package com.parasoft.example.parabank.cucumber;

import java.io.IOException;

import com.parasoft.cucumber.soatest.StepDefinitionLoader;

import cucumber.api.java8.GlueBase;

public class ParaBankStepDefinitions implements GlueBase {
    public ParaBankStepDefinitions() throws IOException {
        StepDefinitionLoader.loadStepDefinitions(getClass(),
                getClass().getResource("parabank_stepdefs.json"));
    }
}