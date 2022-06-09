import io.qameta.allure.Step;

public class CreateAccountLogic extends CreateAccountElements {

    @Step("Click on Personal Account button in creating account popup")
    public CreateAccountLogic clickPersonalAccount() {
        personalAccount.click();
        return this;
    }

    @Step("Enter Email Address {mail} and password 100100 in creating account popup")
    public CreateAccountLogic enterMailAndPassword(String mail) {
        System.out.println(mail);
        mailInput.sendKeys(mail);
        passwordInput.sendKeys("autotest2020");
        continueBtn.click();
        return this;
    }

    @Step("Email with confirmation was sent to server")
    public CreateAccountLogic confirmMail() {
        System.out.println("Email with confirmation was sent to server");
        return this;
    }

    public CreateAccountLogic clickAcceptBtn() {
        acceptBtn.click();
        return this;
    }


}
