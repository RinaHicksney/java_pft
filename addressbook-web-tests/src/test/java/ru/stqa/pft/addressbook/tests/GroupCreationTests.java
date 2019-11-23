package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase{


  @Test
  public void testGroupCreation() throws Exception {

    // null в fillGroupForm - значения по умолчаниюю
    app.getNavigationHelper().goToGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createGroup(new GroupData("test 2", null, null));
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before + 1); //количество ДО должно совпадать с ПОСЛЕ +1
    app.logout();
  }

}
