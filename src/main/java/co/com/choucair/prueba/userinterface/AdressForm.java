package co.com.choucair.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AdressForm extends PageObject {

    public static final Target Input_City = Target.the("field to write the city")
            .located(By.id("city"));

    public static final Target Input_Zip = Target.the("field to write postal code")
            .located(By.id("zip"));
    public static final Target Input_Country = Target.the("insert your country")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target Select_Country = Target.the("Select Country").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target Button_Devices = Target.the( "send form")
            .located(By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue pull-right']"));



}