package br.com.capturabugtest.casetest;

import br.com.capturabugtest.service.EnviaEmail;
import br.com.capturabugtest.service.PrintScreen;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Roseane
 */
public class Principal {

    static WebDriver driver;
    private PrintScreen prtsc;
    private EnviaEmail email;

    public Principal() {
    }

    @BeforeClass
    public static void setUpClass() {
        driver = new FirefoxDriver();

    }

    @Test
    public void aTest() {
        driver.get("https://www.google.com.br");
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        prtsc = new PrintScreen();
        email = new EnviaEmail();
    }

    @After
    public void tearDown() {
        prtsc.print(driver);
        email.envia();
        driver.quit();
    }

}
