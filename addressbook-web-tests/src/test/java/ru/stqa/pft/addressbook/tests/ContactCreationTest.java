package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.gotoContactEditPage();
    app.fillContactForm(new ContactData("Ana", "Test", "Moscow, Kremlin 456", "test@qatest.com", "+7951000000"));
    app.viewCreatedContact();
  }

}