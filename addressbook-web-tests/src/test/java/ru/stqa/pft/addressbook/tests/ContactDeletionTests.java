package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import ru.stqa.pft.addressbook.model.ContactData;
import org.testng.Assert;
import java.util.List;

public class ContactDeletionTests extends TestBase{


    @Test
  public void testContactDeletion() throws Exception {
        app.goTo().goToHomePage();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("First_Name", "Middle_Name",
                    "Last_Name", "Nick_Name", "Title", "Company",
                    "Address", "HOme", "MObile", "Work", "Fax",
                    "test@mail.ru", "test2@mail.ru", "test3@mail.ru",
                    "HOmepage", null), false);
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().selectContact(before.size() - 1);
        app.getContactHelper().deleteSelectedContact();
        app.wd.switchTo().alert().accept();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(before.size() - 1);
        Assert.assertEquals(before,after);
  }

}
