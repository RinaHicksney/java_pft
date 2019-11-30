package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase {
    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
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


      if (creation) {
          //выбор группы из выпадающего списка (проверкеа на наличае эл-та)
          new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
      } else {
          // проверка того, что элемента быть не должно
          //если элемент появился, тест упадет
          Assert.assertFalse(isElementPresent(By.name("new_group")));
      }
    }

    public void submitContactCreation() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void returnToHomePage() {
       click(By.linkText("home page"));
    }

    public void deleteSelectedContact() {
        click(By.xpath("//input[@value='Delete']"));}

    public void initContactModification(int index) {
        wd.findElements(By.xpath("//img[@alt='Edit']")).get(index).click();
    }

    public void submitContactModification() {
        click(By.xpath("//input[@name='update']"));
    }
    public void selectContact(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();
    }

    public void createContact(ContactData contact, boolean b) {
        initContactCreation();
        fillContactForm(contact, true);
        submitContactCreation();
        returnToHomePage();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }
    public int getGroupCount() {
        return wd.findElements(By.name("selected[]")).size(); //вернет размер списка элементов
    }

    public List<ContactData> getContactList() {
        List<ContactData>  contacts = new ArrayList<>();
        List<WebElement> elements = wd.findElements(By.cssSelector("tr[name]"));
        for (WebElement element : elements){

            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            String firstName = element.findElement(By.xpath("td[3]")).getText();
            String lastName = element.findElement(By.xpath("td[2]")).getText();

            ContactData contact = new ContactData(id, firstName, null,
                    lastName, null, null, null,
                    null, null, null, null, null,
                    null, null, null,
                    null, null);
            contacts.add(contact);
        }
        return contacts;
    }
}
