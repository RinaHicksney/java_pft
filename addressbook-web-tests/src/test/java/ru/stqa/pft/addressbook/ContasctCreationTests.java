package ru.stqa.pft.addressbook;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContasctCreationTests extends TestBase{

  @Test
  public void testContasctCreation() throws Exception {
    goToContactPage();
    fillContactForm(new ContactData("First_Name", "Middle_Name", "Last_Name", "Nick_Name", "Title", "Company", "Address", "HOme", "MObile", "Work", "Fax", "test@mail.ru", "test2@mail.ru", "test3@mail.ru", "HOmepage"));
    submitContactCreation();
    returnToHomePage();
    logout();
  }

 
}
