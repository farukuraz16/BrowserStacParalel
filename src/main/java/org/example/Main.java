package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        //kullanıcı adı ve sifre
        desiredCapabilities.setCapability("browserstack.user","farukuraz_Rvw0SI");
        desiredCapabilities.setCapability("browserstack.key","dyj6oAxjUyyxfcPerMLo");

        //apk dosyam icin
        desiredCapabilities.setCapability("app","bs://8a536eab83558a2779f2cc51b7acb97b8af4ceb2");

        //device seciyoruz
        desiredCapabilities.setCapability("device","Samsung Galaxy S22 Ultra");
        desiredCapabilities.setCapability("os_version","12.0");

        desiredCapabilities.setCapability("project","Proje İsim");
        desiredCapabilities.setCapability("build","Test Suite");
        desiredCapabilities.setCapability("name","Test Case Adı 2");

        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://hub.browserstack.com/wd/hub"), desiredCapabilities);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Test başarılı!\"}}");
        jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"failed\", \"reason\": \"Testte hata var!\"}}");

    }
}