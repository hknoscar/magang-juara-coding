package com.testing.magang.testpage.contactmessage;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testing.magang.libtest.LibraryTest;
import com.testing.magang.pages.contactmessages.FilterPage;
import com.testing.magang.utils.Regular;
import com.testing.magang.utils.RegularPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestContactMessage {
    public static WebDriver driver;
    public static FilterPage fp;
    public static ExtentTest ext;

    public TestContactMessage() {
        driver = LibraryTest.driver;
        fp = new FilterPage();
        ext = LibraryTest.extentTest;
    }

    @Given("Admin open web")
    public void admin_open_web() {
        ext.log(LogStatus.PASS, "Admin open web");
        driver.get(Regular.URL);
    }

    @When("Admin login web juara coding")
    public void admin_login_web_juara_coding() {
        ext.log(LogStatus.PASS, "Admin login web juara coding");
        fp.login();
    }

    @And("Admin klik tombol contact messages")
    public void admin_klik_tombol_contact_messages() {
        RegularPage.delayDuration(1);
        ext.log(LogStatus.PASS, "Admin klik tombol contact messages");
        fp.btnClick(RegularPage.tombolContactMessages);
    }

    @And("Admin pilih filter nama")
    public void admin_pilih_filter_nama() {
        RegularPage.delayDuration(1);
        ext.log(LogStatus.PASS, "Admin pilih filter nama ");
        fp.valueSendkey(RegularPage.tombolComboSelect, "nama");
    }

    @Then("Admin get tombol nama")
    public void admin_get_tombol_nama() {
        ext.log(LogStatus.PASS, "Admin get tombol nama ");
        Assert.assertEquals(fp.result(RegularPage.tombolSelect1), "Nama");
    }

    @When("Admin pilih filter email")
    public void admin_filer_email() {
        RegularPage.delayDuration(1);
        ext.log(LogStatus.PASS, "Admin pilih filter email");
        fp.valueSendkey(RegularPage.tombolComboSelect, "email");

    }

    @Then("Admin get tombol email")
    public void admin_get_tombol_email() {
        ext.log(LogStatus.PASS, "Admin get tombol email");
        Assert.assertEquals(fp.result(RegularPage.tombolselect2), "Email");
    }

    @When("Admin pilih filter phone number")
    public void admin_pilih_filter_phone_number() {
        RegularPage.delayDuration(1);
        ext.log(LogStatus.PASS, "Admin pilih filter phone number");
        fp.valueSendkey(RegularPage.tombolComboSelect, "phone number");
    }

    @Then("Admin get tombol phone number")
    public void admin_get_tombol_phone_number() {
        ext.log(LogStatus.PASS, "Admin get tombol phone number");
        Assert.assertEquals(fp.result(RegularPage.tombolselect3), "Phone Number");
    }

    @When("Admin pilih filter subject")
    public void admin_pilih_filter_subject() {
        RegularPage.delayDuration(1);
        ext.log(LogStatus.PASS, "Admin pilih filter subject");
        fp.valueSendkey(RegularPage.tombolComboSelect, "subject");
    }

    @Then("Admin get tombol subject")
    public void admin_get_tombol_subject() {
        ext.log(LogStatus.PASS, "Admin get tombol subject");
        Assert.assertEquals(fp.result(RegularPage.tombolselect4), "Subject");
    }

    @When("Admin pilih filter message")
    public void admin_pilih_filter_message() {
        RegularPage.delayDuration(1);
        ext.log(LogStatus.PASS, "Admin pilih filter message");
        fp.valueSendkey(RegularPage.tombolComboSelect, "Message");
    }

    @Then("Admin get tombol message")
    public void admin_get_tombol_message() {
        ext.log(LogStatus.PASS, "Admin get tombol message");
        Assert.assertEquals(fp.result(RegularPage.tombolselect4), "Message");
    }

    @And("Admin input erbina pada search")
    public void admin_input_erbina_pada_search() {
        ext.log(LogStatus.PASS, "Admin input erbina pada search");
        RegularPage.delayDuration(1);
        fp.valueSendkey(RegularPage.search, "erbina");
    }

    @And("Admin klik enter pada keyboard")
    public void admin_klik_enter() {
        ext.log(LogStatus.PASS, "Admin klik enter pada keyboard");
        fp.valueSendkey(RegularPage.search, Keys.ENTER + "");
    }

    @Then("Admin get name search erbina")
    public void admin_get_erbina() {
        ext.log(LogStatus.PASS, "Admin get name search erbina");
        Assert.assertEquals(fp.result(RegularPage.erbina), "erbina");
    }

    @And("Admin input cipung pada search")
    public void admin_input_cipung_pada_search() {
        ext.log(LogStatus.PASS, "Admin input cipung pada search");
        RegularPage.delayDuration(1);
        fp.valueSendkey(RegularPage.search,  Keys.CONTROL + "a");
        fp.valueSendkey(RegularPage.search,  "widya");
        RegularPage.delayDuration(1);
    }

    @Then("Admin get name search cipung")
    public void admin_get_name_search_cipung() {
        ext.log(LogStatus.PASS, "Admin get name search cipung");
        Assert.assertEquals(fp.result(RegularPage.totalCipung), "Total Search : 0 Data");
    }
    @And("Admin input agussalim@gmail.com pada search")
    public void admin_input_agussalim_pada_search() {
        ext.log(LogStatus.PASS, "Admin input agussalim@gmail.com pada search");
        RegularPage.delayDuration(1);
        fp.valueSendkey(RegularPage.search,  Keys.CONTROL + "a");
        fp.valueSendkey(RegularPage.search,  "agussalim@gmail.com");
    }
    @Then("Admin get email search agussalim@gmail.com")
    public void admin_get_email_() {
        ext.log(LogStatus.PASS, "Admin get email search agussalim@gmail.com");
        Assert.assertEquals(fp.result(RegularPage.agussalim), "agussalim@gmail.com");
    }
    @And("Admin input wakanda@gmail.com pada search")
    public void admin_input_wakanda_pada_search() {
        ext.log(LogStatus.PASS, "Admin input wakanda@gmail.com pada search");
        RegularPage.delayDuration(1);
        fp.valueSendkey(RegularPage.search,  Keys.CONTROL + "a");
        fp.valueSendkey(RegularPage.search,  "wakanda@gmail.com");
    }
    @Then("Admin get email search wakanda@gmail.com")
    public void admin_get_email() {
        ext.log(LogStatus.PASS, "Admin get email search wakanda@gmail.com");
        Assert.assertEquals(fp.result(RegularPage.Totalemail), "Total Search : 0 Data");
    }
    @And("Admin input 123456 pada search")
    public void admin_input_123456_pada_search() {
        ext.log(LogStatus.PASS, "Admin input 123456 pada search");
        RegularPage.delayDuration(1);
        fp.valueSendkey(RegularPage.search,  Keys.CONTROL + "a");
        fp.valueSendkey(RegularPage.search,  "123456");
        RegularPage.delayDuration(1);
    }

}

