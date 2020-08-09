Feature: BMI Calculation for given users
  
  @RegressionTest
  Scenario: Verify title of https://www.calculator.net/
    Given Open the given URL
    Then I validate the title of page
    
     @RegressionTest
  Scenario: Verify title of https://www.calculator.net/
    When I click on BMI Calculator
    Then I validate the title of BMICalculator page
    

@RegressionTest
  Scenario Outline: Calculate BMI for given values
    When I Enter <Age>, <Height>, <Weight>
    Then I click the on calculate
    And I capture the BMI Result value

    Examples: 
      | Age  | Height | Weight  |
      | 10 |     127 | 40 |
      | 30 |     156 | 70 |
      | 25 |     152 | 55 |
      | 20 |     160 | 45 |
      | 35 |     160 | 70 |
      
    @RegressionTest
  Scenario: Close the browser
   Then I Close the browser