package tests;

import org.testng.annotations.Test;
import pages.CanCheckVisibility;
import pages.CreatePage;
import pages.HomePage;
import pages.LearnPage;
import utils.Browser;

public class SmokeTest {

    @Test
    public void userCanOpenAilab() {
        Browser.openBrowser();

        HomePage home = new HomePage();
        home.openAilab();

        Browser.closeBrowser();
    }


    @Test
    public void badTestCase() {
        Browser.openBrowser();

        HomePage home = new HomePage();
        LearnPage learn = new LearnPage();
        CreatePage create = new CreatePage();


        // go to test site
        home.openAilab();

        // let's check the visibility of vital pages
        home.pageDisplayed();
        learn.pageDisplayed();
        create.pageDisplayed();

        Browser.closeBrowser();
    }


    @Test
    public void goodTestCase() {
        Browser.openBrowser();

        System.out.println("Hello");
        System.out.println(13);
        System.out.println(true);
        System.out.println('c');


        // Test Site
        new HomePage().openAilab();

        CanCheckVisibility vis;   // polymorphic var

        vis = new HomePage();
        vis.pageDisplayed();

        vis = new LearnPage();
        vis.pageDisplayed();

        vis = new CreatePage();
        vis.pageDisplayed();

        Browser.closeBrowser();
    }

}

// Polymorphisms
// ---------------------------------------------------------------------
//  -- Static Polymorphism   :   Single Class    --> Method Overloading
//  -- Run-time Polymorphism :   Multiple Class  --> Method Overriding
