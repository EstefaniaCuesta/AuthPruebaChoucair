package co.com.choucair.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UltimateStep extends PageObject {
    public static final Target Input_PassWord = Target.the("Writte the password")
            .located(By.xpath("//*[@id='password']"));

    public static final Target Input_Confirm = Target.the("repeat the password")
            .located(By.xpath("//*[@id='confirmPassword']"));

    public static final Target Input_Terms = Target.the("accept the check")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final  Target Input_Privacity = Target.the("accept policy").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target Button_Finish = Target.the( "send form")
            .located(By.cssSelector("#laddaBtn > i"));

    public static final Target complete = Target.the("text to finish automation")
            .located(By.xpath("//span[contains(text(), 'Complete Setup')]"));

}
