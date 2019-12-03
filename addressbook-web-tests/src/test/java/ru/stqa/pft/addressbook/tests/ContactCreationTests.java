package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreation() throws Exception {
    app.goTo().homePage();
    Contacts before = app.contact().all();
    ContactData contact = new ContactData().withFirstName("First_Name").withMiddle_Name("Middle_Name").withLast_Name(
            "Last_Name").withNick_Name("Nick_Name").withTitle("Title").withCompany("Company").withAddress(
                    "Address").withHome("HOme").withMobile("MObile").withWork("Work").withFax("Fax").withEmail(
                            "test@mail.ru").withEmail2("test2@mail.ru").withEmail3("test3@mail.ru").withHomepage(
                                    "HOmepage").withGroup("test1");
    app.contact().create(contact, true);
    Contacts after = app.contact().all();
    assertThat(after.size(), equalTo(before.size() + 1));
    assertThat(after, equalTo(before.withAdded(contact.withId(after.stream().mapToInt((c) -> c.getId()).max().getAsInt()))));
  }


}
