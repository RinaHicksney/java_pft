package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactDeletionTests extends TestBase{

    @BeforeMethod
    public void ensurePreconditions(){
        app.goTo().homePage();
        if (app.contact().all().size()==0){
            app.contact().create(new ContactData().withFirstName("First_Name").withMiddle_Name("Middle_Name").withLast_Name(
                    "Last_Name").withNick_Name("Nick_Name").withTitle("Title").withCompany("Company").withAddress(
                    "Address").withHome("HOme").withMobile("MObile").withWork("Work").withFax("Fax").withEmail(
                    "test@mail.ru").withEmail2("test2@mail.ru").withEmail3("test3@mail.ru").withHomepage(
                    "HOmepage").withGroup(null), true);
        }
    }

    @Test
  public void testContactDeletion() throws Exception {
        Contacts before = app.contact().all();
        ContactData deletedContact = before.iterator().next();
        app.contact().delete(deletedContact);
        Contacts after = app.contact().all();
        assertThat(after.size(), equalTo(before.size() - 1));
        assertThat(after, equalTo(before.without(deletedContact)));
  }

}
