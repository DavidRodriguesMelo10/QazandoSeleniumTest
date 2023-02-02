package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class DescontosSteps {

    @Dado("^que estou no site da qazando$")
    public void que_estou_no_site_da_qazando()  {
        System.out.println("passou 1");

    }

    @Quando("^eu preencho meu email$")
    public void eu_preencho_meu_email()  {
        System.out.println("passou 2");
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom()  {
        System.out.println("passou 3");

    }

    @Entao("^eu vejo o codigo de desconto$")
    public void eu_vejo_o_codigo_de_desconto()  {
        System.out.println("passou 4");

    }

}
