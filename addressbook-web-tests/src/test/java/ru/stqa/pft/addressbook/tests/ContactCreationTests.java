package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.*;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;
import java.util.Comparator;
import java.util.List;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreation() throws Exception {
    app.goTo().goToHomePage();
    List<ContactData> before = app.getContactHelper().getContactList();
    ContactData contact = new ContactData("First_Name", "Middle_Name",
            "Last_Name", "Nick_Name", "Title", "Company",
            "Address", "HOme", "MObile", "Work", "Fax",
            "test@mail.ru", "test2@mail.ru", "test3@mail.ru",
            "HOmepage", null);
    app.getContactHelper().createContact(contact, true);
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() + 1);

    contact.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId());
    before.add(contact);
    Comparator<? super ContactData> ById = ((g1, g2) -> Integer.compare(g1.getId(), g2.getId()));
    after.sort(ById);
    before.sort(ById);
    Assert.assertEquals(after, before);
  }


}
