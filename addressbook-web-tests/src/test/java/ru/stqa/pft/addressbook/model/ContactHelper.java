package ru.stqa.pft.addressbook.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.appmanager.HelperBase;
import ru.stqa.pft.addressbook.tests.ContactData;

public class ContactHelper extends HelperBase {
        public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitContactCreation() {
      click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void fillContactForm(ContactData contactData) {
      type(By.name("firstname"),contactData.getFirstname());
      type(By.name("middlename"),contactData.getMiddle_name());
      type(By.name("lastname"),contactData.getLast_name());
      click(By.name("address"));
      type(By.name("nickname"),contactData.getNick_name());
      type(By.name("title"),contactData.getTitle());
      type(By.name("company"),contactData.getCompany());
      click(By.name("address"));
      type(By.name("home"),contactData.gethOme());
      type(By.name("mobile"),contactData.getMobile());
      type(By.name("work"),contactData.getWork());
      type(By.name("fax"),contactData.getFax());
      type(By.name("email"),contactData.getEmail());
      type(By.name("email2"),contactData.getEmail2());
      type(By.name("email3"),contactData.getEmail3());
      type(By.name("homepage"),contactData.getHomepage());

    }

    public void returnToHomePage() {
       click(By.linkText("home page"));
    }
}
