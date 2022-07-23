package co.com.choucair.prueba.questions;

import co.com.choucair.prueba.userinterface.UltimateStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question <Boolean>{
    private String question;
    public Answer (String question){
        this.question = question;
    }

    public static Answer toFinish(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean results;
        String completeText = Text.of(UltimateStep.complete).viewedBy(actor).asString();
        if (question.equals(completeText)) {
            results = true;
        }else{
            results = false;
        }
        return results;
    }
}
