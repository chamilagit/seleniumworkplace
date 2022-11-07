package com.daraz;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {

        String LOGINLABLE = "//a[contains(text(),'LOGIN')]";
        String relativexpath = "//input[@name='q']";

        System.setProperty("webdriver.chrome.driver", "F:\\SeleniumTesting\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

    }
}
