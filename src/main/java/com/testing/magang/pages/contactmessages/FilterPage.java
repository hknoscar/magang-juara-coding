package com.testing.magang.pages.contactmessages;


import com.testing.magang.drivers.DriverSingleton;
import com.testing.magang.utils.RegularPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FilterPage {

    public FilterPage() {
        WebDriver driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    WebElement email;
    @FindBy(xpath = "//input[@id='password']")
    WebElement pass;
    @FindBy(xpath = "//button[normalize-space()='Sign-In']")
    WebElement btnSignin;
    @FindBy(xpath = "//span[normalize-space()='Contact Messages']")
    WebElement btnContactMessage;
    @FindBy(xpath = "//select[@name='st']")
    WebElement btnComboSelect;
    @FindBy(xpath = "//option[@value='name']")
    WebElement btnSelect1;
    @FindBy(xpath = "//option[@value='email']")
    WebElement btnSelect2;
    @FindBy(xpath = "//option[@value='phone_number']")
    WebElement btnSelect3;
    @FindBy(xpath = "//option[normalize-space()='Subject']")
    WebElement btnSelect4;
    @FindBy(xpath = "//option[normalize-space()='Message']")
    WebElement btnSelect5;
    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement Search;
    @FindBy(xpath = "(//td[contains(text(),'erbina')])[1]")
    public WebElement textErbina;
    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/form/div/div[4]/div/b")
    public WebElement totalCipung;
    @FindBy(xpath = "(//td[contains(text(),'agussalim@gmail.com')])[1]")
    public WebElement textAgussalim;
    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/form/div/div[4]/div/b")
    public WebElement totalEmail;
    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/thead/tr/th[4]")
    public WebElement totalPhoneNumber;



    public void login() {
        email.sendKeys("ucen1315@gmail.com");
        pass.sendKeys("a");
        btnSignin.click();
    }

    public void btnClick(String click) {
        switch (click) {
            case RegularPage.tombolContactMessages -> btnContactMessage.click();
//            case RegularPage.tombolComboBox -> btnComboBox.click();

        }
    }

    public void valueSendkey(String element, String value) {
        switch (element) {
            case RegularPage.tombolComboSelect -> btnComboSelect.sendKeys(value);
            case RegularPage.search -> Search.sendKeys(value);
            case RegularPage.erbina -> textErbina.sendKeys(value);
            case RegularPage.cipung -> Search.sendKeys(value);
            case RegularPage.agussalim -> textAgussalim.sendKeys(value);
            case RegularPage.totalPhoneNumber -> totalPhoneNumber.sendKeys(value);


        }
    }

    public String result(String element) {
        switch (element) {
            case RegularPage.tombolComboSelect -> {
                return btnComboSelect.getText();
            }
            case RegularPage.tombolselect2 -> {
                return btnSelect2.getText();
            }
            case RegularPage.tombolselect3 -> {
                return btnSelect3.getText();
            }
            case RegularPage.tombolselect4 -> {
                return btnSelect4.getText();
            }
            case RegularPage.tombolselect5 -> {
                return btnSelect5.getText();
            }
            case RegularPage.tombolSelect1 -> {
                return btnSelect1.getText();
            }
            case RegularPage.totalCipung -> {
                return totalCipung.getText();
            }
            case RegularPage.Totalemail -> {
                return totalEmail.getText();
            }
            case RegularPage.totalPhoneNumber-> {
                totalPhoneNumber.getText();
            }
        }
            return element;
    }
}

