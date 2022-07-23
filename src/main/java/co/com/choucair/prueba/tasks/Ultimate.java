package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.userinterface.BasicUtest;
import co.com.choucair.prueba.userinterface.UltimateStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ultimate implements Task {
    public static Performable UltimateStep() {
        return Tasks.instrumented (Ultimate.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Amelia1314??").into(UltimateStep.Input_PassWord),
                Enter.theValue("Amelia1314??").into(UltimateStep.Input_Confirm),
                Click.on(UltimateStep.Input_Terms),
                Click.on(UltimateStep.Input_Privacity),
                Click.on(UltimateStep.Button_Finish));




    }
}

