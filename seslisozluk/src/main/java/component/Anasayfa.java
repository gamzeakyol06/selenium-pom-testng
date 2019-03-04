package component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class Anasayfa {
     WebDriver driver;

    public Anasayfa(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements (this.driver, this);
    }

    By seslisozlukinput=By.xpath ("//input[@placeholder='sözlükte ara']");
    public WebElement Seslisozlukinput() {return driver.findElement (seslisozlukinput);}
    By searchbutton = By.xpath ("//button[@id='sesli-searchbutton']");
    public WebElement SearchButton() {return driver.findElement (searchbutton);}
    }




