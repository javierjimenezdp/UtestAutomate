package PageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.yecht.Data;

import javax.el.ELException;
import java.util.concurrent.TimeUnit;

public class UtestPageObject extends WebBasePage {
    private String xpathDate = "//option[text()='Replaceable']";
    private String xpathCountry = "//div[text()='Replaceable']";
    private String xpathPC="//span[text()='Replaceable']//following::span[1]";
    private String xpathVersion="//span[text()='Replaceable']";
    private String xpathLanguage="//span[text()='Replaceable']//following::span[1]";
    private String xpathMobile="//span[text()='Replaceable']//following::span[1]";
    private String xpathModelo="//span[text()='Replaceable']//following::span[1]";
    private String xpathSO="//span[text()='Replaceable']//following::span[text()='Replaceable']";
    @FindBy(xpath = "//a[contains(text(),'Join Today')]")
    private WebElement bottomJoin;
    @FindBy(id = "firstName")
    private WebElement setName;
    @FindBy(id = "lastName")
    private WebElement setLastName;
    @FindBy(id = "email")
    private WebElement setEmail;
    @FindBy(xpath = "//span[text()='Next: Location']")
    private WebElement clickBottomNext;
    @FindBy(xpath = "//span[contains(text(),'Step 2:')]")
    private WebElement step2;
    @FindBy(id = "city")
    private WebElement setCity;
    @FindBy(id = "zip")
    private WebElement setZip;
    @FindBy(xpath = "//label[contains(text(),'Country')]//following::div")
    private WebElement bottomSelect;
    @FindBy(xpath = "//span[contains(text(),'Step 3')]")
    private WebElement step3;
    @FindBy(xpath = "//span[text()='Next: Devices']")
    private WebElement clickBottomNext2;
    @FindBy(xpath = "//span[text()='One device is required to complete registration.']//following::a[1]")
    private WebElement clickBottomNext3;
    @FindBy(xpath = "//span[text()='Step 4: ']")
    private WebElement step4;
    @FindBy(xpath = "//div[@placeholder=\"Select a Version\"]")
    private WebElement clickVersion;
    @FindBy(xpath = "//div[text()=\"Spanish\"]")
    private WebElement clicLanguage;


    public void clicBottomJoin(){
        esperaElemnento(bottomJoin, 10);
        bottomJoin.click();
    }

    public void sendKeysName(String nombre) {
        esperaElemnento(setName, 10);
        setName.sendKeys(nombre);
    }
    public void sendKeysLastName(String apellido) {
        esperaElemnento(setLastName, 10);
        setLastName.sendKeys(apellido);
    }

    public void sendKeysEmail(String email) {
        esperaElemnento(setEmail, 10);
        setEmail.sendKeys(email);
    }
    public void sendYear(String año) {
        WebElement element = returnElement(xpathDate, año);
        element.click();
    }
    public void sendMonth(String mes) {
        WebElement element = returnElement(xpathDate, mes);
        element.click();
    }
    public void sendDay(String dia) {
        WebElement element = returnElement(xpathDate, dia);
        element.click();
    }

    public void clickBottonNext() {
        esperaElemnento(clickBottomNext, 10);
        scrollElement(clickBottomNext);
        clickBottomNext.click();
    }
    public boolean verificationPage(){
        esperaElemnento(step2, 10);
        return step2.isDisplayed();
    }
    public void sendSetCity(String Ciudad){
        esperaElemnento(setCity, 10);
        setCity.sendKeys(Ciudad);
    }
    public void sendSetZip(String CodigoPostal){
        esperaElemnento(setZip, 10);
        setZip.sendKeys(CodigoPostal);
    }
    public void botomSelect(){
        esperaElemnento(bottomSelect, 10);
        bottomSelect.click();
    }
    public void sendCountry(String Pais) {
        WebElement element = returnElement(xpathCountry, Pais);
        element.click();
    }
    public void clickBottomNext2(){
        esperaElemnento(clickBottomNext2, 10);
        clickBottomNext2.click();
    }
    public boolean verificationStep2() {
        esperaElemnento(step3, 10);
        return step3.isDisplayed();
    }

    public void sendPC(String Computadora) {
        WebElement element = returnElement(xpathPC, Computadora);
        element.click();
    }

    public void sendVersion(String version) {
        WebElement element = returnElement(xpathVersion, version);
        clickVersion.click();
        esperaElemnento(element, 10);
        element.click();

    }

    public void sendLanguaje(String language) {
        clicLanguage.click();
        WebElement element = returnElement(xpathLanguage, language);
        esperaElemnento(element, 10);
        element.click();
    }

    public void sendMobile(String mobile) {
        WebElement element = returnElement(xpathMobile, mobile);
        element.click();
    }

    public void sendModelo(String modelo) {
        WebElement element = returnElement(xpathModelo, modelo);
        element.click();
    }

    public void sendSo(String SO) {
        WebElement element = returnElement(xpathSO, SO);
        element.click();
    }

    public void clickBottonNext3() {
        esperaElemnento(clickBottomNext3, 10);
        clickBottomNext3.click();
    }

    public boolean verificationStep3() {
        esperaElemnento(step4, 10);
        return step4.isDisplayed();
    }
}
