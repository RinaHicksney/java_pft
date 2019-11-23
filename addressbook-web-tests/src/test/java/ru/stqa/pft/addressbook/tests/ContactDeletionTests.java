package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase{
  private WebDriver wd;
  private boolean acceptNextAlert = true;

    @Test
  public void testContactDeletion() throws Exception {
        app.getNavigationHelper().goToHomePage();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("First_Name", "Middle_Name",
                    "Last_Name", "Nick_Name", "Title", "Company",
                    "Address", "HOme", "MObile", "Work", "Fax",
                    "test@mail.ru", "test2@mail.ru", "test3@mail.ru",
                    "HOmepage", null), false);
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        wd.switchTo().alert().accept();
        app.logout();
  }

}
