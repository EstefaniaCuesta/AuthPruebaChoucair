package co.com.choucair.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesPage extends PageObject {




    public static final Target Value_Mobile = Target.the("Select your mobile device")
            .located(By.xpath("//div[@placeholder='Select Brand']"));
    public static final Target Input_Mobile = Target.the("Select your mobile device")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/input[1]"));

    public static final Target Value_Model = Target.the("Select your model")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]/span"));
    public static final Target Input_Model = Target.the("Select your model")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/input[1]"));

    public static final Target Value_System = Target.the("Select your OS")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span"));
    public static final Target Input_System = Target.the("Select your OS")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/input[1]"));

    public static final Target Button_LastStep = Target.the( "send form")
            .located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > div:nth-child(2) > div > a"));

}
