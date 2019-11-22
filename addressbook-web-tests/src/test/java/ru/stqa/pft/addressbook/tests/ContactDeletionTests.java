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
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        wd.switchTo().alert().accept();
        app.logout();
  }

}
