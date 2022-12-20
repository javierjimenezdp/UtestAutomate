package StepDefinitions;
import Steps.UtestSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UtestPage3StepDefinition {
    //@Steps
    UtestSteps utestStep;

    public UtestPage3StepDefinition() {
        this.utestStep = new UtestSteps();
    }

    @When("^ingrese toda la información requerida para la página 3 (.*), (.*), (.*), (.*), (.*), (.*)$")
    public void ingreseTodaLaInformaciónRequeridaPage3(String Computadora, String versión, String languaje, String mobile, String modelo, String SO) {
        utestStep.enterInformationPC(Computadora, versión, languaje, mobile, modelo, SO);
    }

    @Then("^Se completa el registro de 3ra manera exitosa$")
    public void seCompletaElRegistroDeManeraExitosaPage3() {
        utestStep.seCompletaElRegistroDeManeraExitosaPage3();
    }
}
