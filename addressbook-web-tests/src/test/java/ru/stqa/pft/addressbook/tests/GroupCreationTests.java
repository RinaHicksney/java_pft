package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class GroupCreationTests extends TestBase{


  @Test
  public void testGroupCreation() throws Exception {

    // null в fillGroupForm - значения по умолчаниюю
    app.getNavigationHelper().goToGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList(); //Список объектов типа GroupData
    //int before = app.getGroupHelper().getGroupCount();
    GroupData group = new GroupData("test1", null, null);
    app.getGroupHelper().createGroup(group);
    List<GroupData> after = app.getGroupHelper().getGroupList();
    //int after = app.getGroupHelper().getGroupCount();
    //Assert.assertEquals(after, before + 1); //количество ДО должно совпадать с ПОСЛЕ +1
    Assert.assertEquals(after.size(), before.size() + 1); //размер после = размер до +1

    //способ сравнения 1
    int max = 0;
    for (GroupData g : after) {
      if (g.getId() > max) {
        max = g.getId();
      }
    }
    //способ сравнения 2
    //является анонимным классом
    Comparator<? super GroupData> byId = new Comparator<GroupData>() {   //new+ctrl+space (создание переопределения)
      @Override
      public int compare(GroupData o1, GroupData o2) {
        return Integer.compare(o1.getId(), o2.getId());
      }
    }; //компаратор (сравниватель).  который умеет сравнивать объекты типа GroupData
    int max1 = after.stream().max(byId).get().getId();
    group.setId(max1);
    before.add(group);
    Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));

  }
}
