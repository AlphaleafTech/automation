package pages;

import org.openqa.selenium.By;
import static utils.Automation.*;

public class LearnPage implements CanCheckVisibility {

    // ---- Fields ---- //
    private By loc_learn_tab = By.xpath("//a/span[text()='Learn']");
    private By loc_page_banner = By.xpath("//h1");


    // ---- Methods --- //
    @Override
    public boolean pageDisplayed() {
        click(loc_learn_tab);
        pause(3);
        System.out.println("Checking visibility of Learn page...");
        boolean result = isVisible(loc_page_banner);
        pause(1);
        return result;
    }
}
