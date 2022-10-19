package com.alkomprar.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CommonStepDefinition {

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
    }
}