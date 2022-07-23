package co.com.choucair.prueba.tasks;


import co.com.choucair.prueba.userinterface.AdressForm;
import co.com.choucair.prueba.userinterface.DevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class Devices implements Task {
    public static Devices DevicesInformation() {
        return Tasks.instrumented(Devices.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(DevicesPage.Value_Mobile),
                Enter.theValue("Alcatel").into(DevicesPage.Input_Mobile),
                SendKeys.of(Keys.ENTER).into(DevicesPage.Input_Mobile),

                Click.on(DevicesPage.Value_Model),
                Enter.theValue("A30").into(DevicesPage.Input_Model),
                SendKeys.of(Keys.ENTER).into(DevicesPage.Input_Model),

                Click.on(DevicesPage.Value_System),
                Enter.theValue("Android 6").into(DevicesPage.Input_System),
                SendKeys.of(Keys.ENTER).into(DevicesPage.Input_System),

                Click.on(DevicesPage.Button_LastStep));
    }
}

