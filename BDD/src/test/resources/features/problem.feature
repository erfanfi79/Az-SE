@tag
Feature: Problem

  Scenario: divide two values and get square root of them
    Given Two input values given, 36 and 4
    When I divide the two values and get square root
    Then I expect the result, 3

  Scenario Outline: divide two values and get square root of them
    Given Two input values given, <a> and <b>
    When I divide the two values and get square root
    Then I expect the result, <result>
    Examples:
      | a | b | result |
      | 4     | 1     | 2     |
      | 36    | 4      | 3      |
