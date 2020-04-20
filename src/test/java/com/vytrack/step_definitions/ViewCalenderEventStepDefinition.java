package com.vytrack.step_definitions;

import com.vytrack.pages.activities.CalenderEventsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ViewCalenderEventStepDefinition {
    CalenderEventsPage calenderEventsPage=new CalenderEventsPage();

    @Then("View Per Page menu should have following options")
    public void view_Per_Page_menu_should_have_following_options(List<String> dataTable) {
        System.out.println("Expected values: "+dataTable);
        Assert.assertEquals(dataTable,calenderEventsPage.getViewPageOptions());
    }




}
