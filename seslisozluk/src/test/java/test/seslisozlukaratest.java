package test;
import base.Base;
import component.Anasayfa;
import component.Anasayfamesaj;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Reporter.log;

public class seslisozlukaratest extends Base {
    public static final Logger log= LogManager.getLogger (Base.class.getName());
    @BeforeTest
    public void Beforemethod() {
        super.beforemethod ( );
        driver.get ("https://www.seslisozluk.net/");
    }
        @Test(priority = 1)
        public void sesliSozluk() throws InterruptedException {
            try {
                log ("sesliSozluk ()");
                Anasayfa test = new Anasayfa (driver);
                test.Seslisozlukinput ( ).sendKeys ("good");
                test.SearchButton ( ).click ( );
                Thread.sleep (6000L);

                Anasayfamesaj mesaj = new Anasayfamesaj (driver);
                Assert.assertEquals (mesaj.TestGood1 ( ), "food");
                log.info ("input box test pass");
                System.out.println ("input box test pass");
                Thread.sleep (3000L);
            } catch (Exception e) {
                e.printStackTrace ( );
                Assert.fail ("input test is fail");
                log.info ("input test is fail");
            }
        }

        @AfterTest
        public void Aftermethod() {
            super.aftermethod ( );
        }

}