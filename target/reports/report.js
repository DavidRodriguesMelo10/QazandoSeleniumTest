$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("desconto.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Receber o cupom de desconto da qazando",
  "description": "Eu como usuario da qazando\r\nquero receber um cupom de desconto\r\npara comprar um curso com o valor menor",
  "id": "receber-o-cupom-de-desconto-da-qazando",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "Visualizar codigo de desconto",
  "description": "",
  "id": "receber-o-cupom-de-desconto-da-qazando;visualizar-codigo-de-desconto",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 9,
  "name": "que estou no site da qazando",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "eu preencho meu email",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "clico em ganhar cupom",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu vejo o codigo de desconto",
  "keyword": "Entao "
});
formatter.match({
  "location": "DescontosSteps.que_estou_no_site_da_qazando()"
});
formatter.result({
  "duration": 3311435900,
  "status": "passed"
});
formatter.match({
  "location": "DescontosSteps.eu_preencho_meu_email()"
});
formatter.result({
  "duration": 3166646400,
  "status": "passed"
});
formatter.match({
  "location": "DescontosSteps.clico_em_ganhar_cupom()"
});
formatter.result({
  "duration": 129191100,
  "status": "passed"
});
formatter.match({
  "location": "DescontosSteps.eu_vejo_o_codigo_de_desconto()"
});
formatter.result({
  "duration": 37225500,
  "status": "passed"
});
});