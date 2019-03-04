package component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Anasayfamesaj {
    WebDriver driver;
    public Anasayfamesaj (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements (this.driver, this);
    }
    By testgood = By.xpath ("//h1[contains(text(),'good')]");
    public WebElement TestGood(){return driver.findElement (testgood);}
    public final String Content_good= "good";

    public String TestGood1() {
        String message = driver.findElement (testgood).getText ();
        System.out.println (message);
        return message;
    }
}
