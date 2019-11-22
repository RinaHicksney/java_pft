package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("First_Name", "Middle_Name", "Last_Name", "Nick_Name", "Title", "Company", "Address", "HOme", "MObile", "Work", "Fax", "test@mail.ru", "test2@mail.ru", "test3@mail.ru", "HOmepage"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
    app.logout();
  }


}
