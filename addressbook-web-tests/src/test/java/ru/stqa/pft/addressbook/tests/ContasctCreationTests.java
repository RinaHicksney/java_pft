package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.*;

public class ContasctCreationTests extends TestBase{

  @Test
  public void testContasctCreation() throws Exception {
    app.goToContactPage();
    app.fillContactForm(new ContactData("First_Name", "Middle_Name", "Last_Name", "Nick_Name", "Title", "Company", "Address", "HOme", "MObile", "Work", "Fax", "test@mail.ru", "test2@mail.ru", "test3@mail.ru", "HOmepage"));
    app.submitContactCreation();
    app.returnToHomePage();
    app.logout();
  }


}
