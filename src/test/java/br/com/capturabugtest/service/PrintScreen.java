package br.com.capturabugtest.service;

import br.com.capturabugtest.model.Arquivo;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Rose
 */
public class PrintScreen {

    public void print(WebDriver driver) {

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Arquivo arquivo = new Arquivo();
        try {
            arquivo.setNome("erro.png");
            arquivo.setCaminho("C:\\tmp\\" + arquivo.getNome());

            FileUtils.copyFile(scrFile, new File(arquivo.getCaminho()));
        } catch (IOException ex) {
            Logger.getLogger(PrintScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
