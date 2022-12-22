package StepDefinitions;
import Steps.UtestSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UtestPage4StepDefinition {
    //@Steps
    UtestSteps utestStep;

    public UtestPage4StepDefinition() {
        this.utestStep = new UtestSteps();
    }

    @When("^ingrese toda la información requerida para la página 4 (.*), (.*)$")
    public void ingreseTodaLaInformaciónRequeridaPage4(String Password, String ComfirmPassword) {
        utestStep.enterPassword(Password, ComfirmPassword);
        utestStep.cliclCheckBox();
    }

    @Then("^Se completa el registro de la 4ta de manera exitosa$")
    public void seCompletaElRegistroDeManeraExitosaPage4() {
        utestStep.seCompletaElRegistroDeManeraExitosaPage4();
    }
}
