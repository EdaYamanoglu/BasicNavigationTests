package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver getDriver (String Browser){

        if(Browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        }else if (Browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new EdgeDriver();

        }else if (Browser.equals("edge")){
            WebDriverManager.edgedriver();
            return new EdgeDriver();

            }else{
            return null;
        }

    }




    }



