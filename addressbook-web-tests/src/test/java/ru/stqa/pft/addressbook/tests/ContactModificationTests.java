package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import java.util.Set;

import ru.stqa.pft.addressbook.model.Contacts;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactModificationTests extends TestBase {

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
    public void testContactModification() {
        Contacts before = app.contact().all();
        ContactData modifiedContact = before.iterator().next();;
        ContactData contact = new ContactData().withId(modifiedContact.getId()).withFirstName("First_Name").withMiddle_Name("Middle_Name").withLast_Name(
                "Last_Name").withNick_Name("Nick_Name").withTitle("Title").withCompany("Company").withAddress(
                "Address").withHome("HOme").withMobile("MObile").withWork("Work").withFax("Fax").withEmail(
                "test@mail.ru").withEmail2("test2@mail.ru").withEmail3("test3@mail.ru").withHomepage(
                "HOmepage").withGroup(null);
        app.contact().modify(contact);
        Contacts after = app.contact().all();
        assertThat(after.size(), equalTo(before.size()));
        assertThat(after, equalTo(before.without(modifiedContact).withAdded(contact)));

    }

}
