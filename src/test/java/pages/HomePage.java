package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import support.Utils;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class HomePage extends Utils {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao(){
        driver.get("https://www.qazando.com.br");
        esperarElementoEstarPresente(By.id("btn-ver-cursos"));
        assertEquals("Não acessou a aplicação",true,driver.findElement(By.id("btn-ver-cursos")).isDisplayed() );
    }

    public void scrollDown()throws InterruptedException{
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0,10000)");
        Thread.sleep(3000);
    }

    public void preencherEmail() {

        driver.findElement(By.id("email")).sendKeys("david.13rodrigues@hotmail.com");

    }

    public void clickGanharDesconto() {
        driver.findElement(By.xpath("/html/body")).click();
        driver.findElement(By.id("button")).click();
    }

    public void verificarCupomDesconto() {
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        assertEquals("O codigo esta correto!", "QAZANDO15OFF", texto_cupom);

    }

}
