package com.app.steps;

import com.app.pages.Page1;
import com.app.utilities.Driver;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class states {
    private Page1 states = new Page1();
// given states tep "string" 
    @Given("states tep [a-z,A-Z]")
    public void states(String one, String two) throws InterruptedException {
        Driver.getDriver().get("https://alphabetizer.flap.tv/lists/list-of-states-in-alphabetical-order.php");
        Thread.sleep(5);
        List<String> unsorted = new ArrayList<>();
        for (WebElement element:states.states) {
            unsorted.add(element.getText());
        }
        List<String> sorted = new ArrayList<>();
//        List<String> after1 = unsorted;
        sorted.addAll(unsorted);
        Collections.sort(sorted,Collections.reverseOrder());


    }


}
