package problem;

import calculator.Calculator;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepDef {
    private Problem problem;
    private int value1;
    private int value2;
    private double result;

    @Before
    public void before() throws Throwable {
        problem = new Problem();
    }


    @When("^I divide the two values and get square root$")
    public void iDivideTheTwoValuesAndGetSquareRoot() {
        result = problem.squareRootOfDivision(value1, value2);
        System.out.println(result);
    }

    @Then("^I expect the result, (\\d+)$")
    public void iExpectTheResult(double arg0) {
        Assert.assertEquals(arg0, result,0.001);
    }

    @Given("^Two input values given, (\\d+) and (\\d+)$")
    public void twoInputValuesGivenAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }
}
