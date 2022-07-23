package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.userinterface.AdressForm;
import co.com.choucair.prueba.userinterface.BasicUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;





public class Basic implements Task {
    public static Performable UserInformation()
    {
        return Tasks.instrumented(Basic.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue("Carmen").into(BasicUtest.Input_Name),
                Enter.theValue("Rendon").into(BasicUtest.Input_LastName),
                Enter.theValue("CarmenRend197@gmail.com").into(BasicUtest.Input_Email),
                Click.on(BasicUtest.Value_Month),
                Click.on(BasicUtest.Value_Day),
                Click.on(BasicUtest.Value_Year),
                Enter.theValue("Español").into(BasicUtest.Value_Lang),
                Click.on(BasicUtest.Button_Location));




    }

}

