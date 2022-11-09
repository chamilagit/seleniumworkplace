package com.daraz;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
        WebDriver webDriver;
        String LOGINLABLE = "//header/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]";
        String EMAIL = "//*[@id=\"username\"]";
        String PASSWORD = "//*[@id=\"password\"]";

        String LOGINGBUTTON ="//*[@id=\"post-8295\"]/div/div/div[2]/div/div/div/div/div[1]/form/p[3]/button";

        String HOMEBUTTON ="//*[@id=\"site-header\"]/div[1]/div/div/div/div[1]/div[1]/div/a/img";


        public Login(WebDriver webDriver){
            this.webDriver=webDriver;
        }
        public void clickLoginlink(){
                webDriver.findElement(By.xpath(LOGINLABLE)).click();
        }
        public void typeusername(){
                webDriver.findElement(By.xpath(EMAIL)).sendKeys("chamilawasi");
        }
        public void typepassword(){
                webDriver.findElement(By.xpath(PASSWORD)).sendKeys("chamila@123");
        }
        public void clickloginbutton(){
                webDriver.findElement(By.xpath(LOGINGBUTTON)).click();
        }

        public void visitStore(){
                webDriver.findElement(By.xpath(HOMEBUTTON)).click();
        }
}
