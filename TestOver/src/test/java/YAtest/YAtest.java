package YAtest;

import Core.BaseSeleniumTest;
import org.junit.Test;
import org.openqa.selenium.By;

public class YAtest extends BaseSeleniumTest {

    @Test
    public void openPage(){
        MainPage main = new MainPage();
        main.newSearch("Как купить хлеб?");
        }
}
