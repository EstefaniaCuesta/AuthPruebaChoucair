package co.com.choucair.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BasicUtest extends PageObject {

    public static final Target Input_Name = Target.the("Button where the user put his name")
            .located(By.id("firstName"));
    public static final Target Input_LastName = Target.the("button when the user put his lastname")
            .located(By.id("lastName"));
    public static final Target Input_Email = Target.the("Button that we go to writte email")
            .located(By.id("email"));

    public static final Target Value_Month = Target.the("Select month of your birthday")
            .located(By.xpath("//select[@name='birthMonth']//option[text()='November']"));

    public static final Target Value_Day = Target.the("Select Day of your birthday")
            .located(By.xpath("//select[@name='birthDay']//option[text()='1']"));

    public static final Target Value_Year = Target.the("Select year of your birthday")
            .located(By.xpath("//select[@name='birthYear']//option[text()='2002']"));

    public static final Target Value_Lang = Target.the("Select year of your birthday")
            .located(By.cssSelector("#languages > div:nth-child(1) > input"));
    public static final Target Button_Location = Target.the( "send form")
            .located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > form > div.form-group.col-xs-12.text-right > a"));

}