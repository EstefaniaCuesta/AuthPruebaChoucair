package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.userinterface.AdressForm;
import co.com.choucair.prueba.userinterface.UtestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class Adress implements Task {
    public static Adress AdressInformation() {
        return Tasks.instrumented(Adress.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Cartagena").into(AdressForm.Input_City),
                SendKeys.of(Keys.ARROW_DOWN).into(AdressForm.Input_City),
                SendKeys.of(Keys.ENTER).into(AdressForm.Input_City),
                Enter.theValue("130001").into(AdressForm.Input_Zip),
                Click.on(AdressForm.Select_Country),
                Enter.theValue("Colombia").into(AdressForm.Input_Country),
                SendKeys.of(Keys.ENTER).into(AdressForm.Input_Country),
                Click.on(AdressForm.Button_Devices));
    }
}
