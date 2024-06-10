package com.euroTech.utilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import java.net.MalformedURLException;
public class Driver {

    private Driver() {}

    private static InheritableThreadLocal<WebDriver> driverPool=new InheritableThreadLocal<>();
    // paralel olarak calisitirilan testlerin hangi birisi uzerinde islem yapacaksak bize onu gonderiyor

    public static WebDriver get() {
        if (driverPool.get() == null) {
            //if we pass the driver from terminal then use that one
            //if we do not pass the driver from terminal then use the one properties file
            String browser = System.getProperty("browser") != null ? System.getProperty("browser") : ConfigReader.get("browser");
            switch (browser) {
                case "chrome":
                    //System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");

                    driverPool.set(new ChromeDriver());
                    break;
                case "chrome-headless":

                   driverPool.set(new ChromeDriver(new ChromeOptions().addArguments("--headless")));
                    break;
                case "firefox":

                    driverPool.set(new FirefoxDriver());
                    break;
                case "firefox-headless":

                   driverPool.set(new FirefoxDriver(new FirefoxOptions().addArguments("--headless")));
                    break;
                case "edge":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                        throw new WebDriverException("Your OS doesn't support Edge");

                    driverPool.set(new EdgeDriver());
                    break;

                case "remote_chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.setCapability("platform", Platform.ANY);
                    try{
                       // driverPool.set(new RemoteWebDriver(new URL("http://remote_IP/wd/hub"),chromeOptions));
                        driverPool.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),chromeOptions));
                    }catch (MalformedURLException e){
                        e.printStackTrace();
                    }

                    break;
                case "remote_firefox":
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.setCapability("platform",Platform.ANY);

                    try{
                        driverPool.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),firefoxOptions));
                    }catch (MalformedURLException e){
                        e.printStackTrace();
                    }
                    break;
            }

        }
        return driverPool.get();
    }

    public static void closeDriver() {
       driverPool.get().quit();
       driverPool.remove();
    }
}
