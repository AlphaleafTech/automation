package pages;

import org.openqa.selenium.By;

import static utils.Automation.*;

public class HomePage implements CanCheckVisibility {

    private String url = "https://ailab.acr.org";

    // ---- Fields ---- //
    private By loc_home_tab = By.xpath("//a/span[text()='Home']");
    private By loc_enter_button = By.cssSelector("a > button");
    private By loc_page_banner = By.xpath("(//h1)[1]");


    // ---- Methods --- //
    public void openAilab() {
        visit(url);
        click(loc_enter_button);
        pause(2);
    }

    @Override
    public boolean pageDisplayed() {
        click(loc_home_tab);
        pause(3);
        System.out.println("Checking visibility of Home page...");
        boolean result = isVisible(loc_page_banner);
        pause(2);
        return result;
    }
}