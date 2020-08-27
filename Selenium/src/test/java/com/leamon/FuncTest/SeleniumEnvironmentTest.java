package com.leamon.FuncTest;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEnvironmentTest {

    public static void main(String[] args) throws Exception {
        //设置Chrome驱动
        System.setProperty("webdriver.chrome.driver","/Users/mac/Desktop/git_test/Selenium/src/test/resources/mac/chromedriver");
        //搭建Chrome环境
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.baidu.com");
        Thread.sleep(3000);
        chromeDriver.quit();
    }
}
