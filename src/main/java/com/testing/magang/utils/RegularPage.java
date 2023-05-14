package com.testing.magang.utils;

import com.testing.magang.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RegularPage {

    public static final String tombolContactMessages = "contactMessages";
    public static final String tombolComboSelect = "Select";
    public static final String tombolSelect1 = "Name";
    public static final String tombolselect2 = "Email";
    public static final String tombolselect3 = "PhoneNumber";
    public static final String tombolselect4 = "Subject";
    public static final String tombolselect5 = "Messages";
    public static final String search = "Search";
    public static final String erbina = "erbina";
    public static final String cipung = "cipung";
    public static final String totalCipung = "cipungTotal";
    public static final String agussalim = "agussalim@gmail.com";
    public static final String Totalemail = "totalemail";
    public static final String totalPhoneNumber = "DataPhoneNumber";



    public static JavascriptExecutor js = (JavascriptExecutor) DriverSingleton.getDriver();
    public static void delayDuration(long time) {
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void scrollPage(String atas, String bawah) {
        js.executeScript("window.scrollBy(" + atas + "," + bawah + ")");
        System.out.println("Scroll bar");
    }

    public static void scrollElement(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView();", element);
        System.out.println("Scroll bar");
    }



}