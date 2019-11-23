package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTests extends TestBase{


  @Test
  public void testGroupDeletion() throws Exception {

    app.getNavigationHelper().goToGroupPage();
    if (! app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("test 2", null, null));
    }
    List<GroupData> before =app.getGroupHelper().getGroupList();
    app.getGroupHelper().selectGroup(before.size()-1);  //удалить последний модуль
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
    List<GroupData> after =app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() - 1);

    //удаляем лишний элемент, который мы удаляли в тестируемом приложении
    before.remove(before.size()-1); //теперь 2 одинаковых списка, пот. перем. before ссылается  не на оригинальный старый список, а на стар. список, в кот. удален ненуж эл-т
    //после этого старый список долж содерж теже самые эл-ты. что и новый
    Assert.assertEquals(before, after); //сравниваем 2 списка групп до удаления и после удаления
    }
  }


