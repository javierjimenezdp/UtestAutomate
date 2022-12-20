package StepDefinitions;
import Steps.UtestSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.es.E;
import net.thucydides.core.annotations.Steps;
import org.yecht.Data;

public class UtestStepDefinition {
    //@Steps
    UtestSteps utestStep;

    public UtestStepDefinition() {
        this.utestStep = new UtestSteps();
    }
    @Given("^Como usuario deseo registrarme en la pagina de Utest$")
    public void comoUsuarioDeseoRegistrarmeEnLaPaginaDeUtest() {
        utestStep.enterPageUtest();
    }


    @When("^Ingrese toda la información requerida (.*), (.*), (.*), (.*), (.*), (.*)$")
    public void ingreseTodaLaInformaciónRequerida(String Nombre, String Apellido, String Email, String Año, String Mes, String Dia) {
        utestStep.enterData(Nombre, Apellido, Email, Año, Mes, Dia);
    }

    @Then("^Se completa el registro de manera exitosa$")
    public void seCompletaElRegistroDeManeraExitosa() {
        utestStep.seCompletaElRegistroDeManeraExitosa();
    }
}
