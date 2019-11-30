package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import java.util.Comparator;
import java.util.List;

public class ContactModificationTests extends TestBase {
    @Test

            public void testContactModification() {
        app.goTo().goToHomePage();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("First_Name", "Middle_Name",
                    "Last_Name", "Nick_Name", "Title", "Company",
                    "Address", "HOme", "MObile", "Work", "Fax",
                    "test@mail.ru", "test2@mail.ru", "test3@mail.ru",
                    "HOmepage", null), false);
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().selectContact(before.size() - 1);
        app.getContactHelper().initContactModification(before.size() - 1);
        ContactData contact = new ContactData("First_Name","Middle_Name",
                "Last_Name", "Nick_Name", "Title", "Company",
                "Address", "HOme", "MObile", "Work", "Fax",
                "test@mail.ru", "test2@mail.ru", "test3@mail.ru",
                "HOmepage", null);
        app.getContactHelper().fillContactForm(contact, false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size() - 1);
        before.add(contact);
        Comparator<? super ContactData> ById = ((o1, o2) -> Integer.compare(o1.getId(), o2.getId()));
        before.sort(ById);
        after.sort(ById);
        Assert.assertEquals(before,after);


    }

}
