package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
    @Test

            public void testContactModification() {
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("First_Name", "Middle_Name", "Last_Name", "Nick_Name", "Title", "Company", "Address", "HOme", "MObile", "Work", "Fax", "test@mail.ru", "test2@mail.ru", "test3@mail.ru", "HOmepage"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }

}
