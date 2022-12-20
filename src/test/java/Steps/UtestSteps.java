package Steps;

import PageObject.UtestPageObject;
import StepDefinitions.Hooks;
import StepDefinitions.UtestStepDefinition;

public class UtestSteps  {
    UtestPageObject utestPageObject;
    public UtestSteps(){
        this.utestPageObject = new UtestPageObject();
        utestPageObject.setDriver(Hooks.getDriver());
    }
   public void enterPageUtest(){
        utestPageObject.clicBottomJoin();
   }

    public void enterData(String nombre, String apellido, String email, String año, String mes, String dia) {
        utestPageObject.sendKeysName(nombre);
        utestPageObject.sendKeysLastName(apellido);
        utestPageObject.sendKeysEmail(email);
        utestPageObject.sendYear(año);
        utestPageObject.sendMonth(mes);
        utestPageObject.sendDay(dia);
    }

    public void seCompletaElRegistroDeManeraExitosa() {
        utestPageObject.clickBottonNext();
        utestPageObject.verificationPage();
    }

    public void enterInformation(String ciudad, String codigoPostal, String pais) {
        //utestPageObject.sendSetCity(ciudad);
        //utestPageObject.sendSetZip(codigoPostal);
        utestPageObject.botomSelect();
        utestPageObject.sendCountry(pais);

    }

    public void seCompletaElRegistroDeManeraExitosaPage2() {
        utestPageObject.clickBottomNext2();
        utestPageObject.verificationStep2();
    }

    public void enterInformationPC(String Computadora, String versión, String languaje, String mobile, String modelo, String so) {
        //utestPageObject.sendPC(Computadora);
        utestPageObject.sendVersion(versión);
        utestPageObject.sendLanguaje(languaje);
        utestPageObject.sendMobile(mobile);
        utestPageObject.sendModelo(modelo);
        utestPageObject.sendSo(so);
    }

    public void seCompletaElRegistroDeManeraExitosaPage3() {
        utestPageObject.clickBottonNext3();
        utestPageObject.verificationStep3();
    }
}
