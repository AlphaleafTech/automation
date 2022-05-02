package pages;

import org.openqa.selenium.By;
import static utils.Automation.*;


public class CreatePage implements CanCheckVisibility {
    // ---- Fields ---- //
    private By loc_create_tab = By.xpath("//a/span[text()='Create']");
    private By loc_define_problem = By.xpath("(//h5)[1]");

    // ---- Methods --- //
    @Override
    public boolean pageDisplayed() {
        click(loc_create_tab);
        pause(3);
        System.out.println("Checking the visibility of Create page...");
        boolean result = isVisible(loc_define_problem);
        pause(1);
        return result;
    }
}
