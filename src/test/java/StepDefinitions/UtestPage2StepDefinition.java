package StepDefinitions;
import Steps.UtestSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UtestPage2StepDefinition {
    //@Steps
    UtestSteps utestStep;

    public UtestPage2StepDefinition() {
        this.utestStep = new UtestSteps();
    }

    @When("^Ingrese toda la información reuquerida para la página 2 (.*), (.*), (.*)$")
    public void ingreseTodaLaInformaciónRequeridaPage2(String Ciudad, String CodigoPostal, String Pais) {
        utestStep.enterInformation(Ciudad, CodigoPostal, Pais);
    }

    @Then("^Se completa el registro de 2da manera exitosa$")
    public void seCompletaElRegistroDeManeraExitosaPage2() {
        utestStep.seCompletaElRegistroDeManeraExitosaPage2();
    }
}
