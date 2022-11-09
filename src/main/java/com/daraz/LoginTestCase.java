package com.daraz;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestCase {
       @Test
        public void clicklogin () {
            System.setProperty("webdriver.chrome.driver", "F:\\SeleniumTesting\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.wasi.lk/");

            Login login = new Login(driver);
            login.clickLoginlink();
            login.typeusername();
            login.typepassword();
            login.clickloginbutton();
            login.visitStore();

        }
    }
