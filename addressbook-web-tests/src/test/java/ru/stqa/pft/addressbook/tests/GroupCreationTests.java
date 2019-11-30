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
    GroupData group = new GroupData("test2", null, null);
    app.getGroupHelper().createGroup(group);
    List<GroupData> after = app.getGroupHelper().getGroupList();
    //int after = app.getGroupHelper().getGroupCount();
    //Assert.assertEquals(after, before + 1); //количество ДО должно совпадать с ПОСЛЕ +1
    Assert.assertEquals(after.size(), before.size() + 1); //размер после = размер до +1

    //лямбда; параметры --> тело функции
    before.add(group);
    Comparator<? super GroupData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);

  }
}
