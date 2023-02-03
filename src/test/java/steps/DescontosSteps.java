package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DescontosSteps {

    WebDriver driver = new ChromeDriver();

    @Dado("^que estou no site da qazando$")
    public void que_estou_no_site_da_qazando()   {
        driver.get("https://www.qazando.com.br");
    }

    @Quando("^eu preencho meu email$")
    public void eu_preencho_meu_email() throws InterruptedException{
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,10000)");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("david.15rodrigues@gmail.com");
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom()  {
        driver.findElement(By.id("button")).click();
    }

    @Entao("^eu vejo o codigo de desconto$")
    public void eu_vejo_o_codigo_de_desconto()  {
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        System.out.println(texto_cupom);
        driver.quit();
    }

}
