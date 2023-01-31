Feature: Pramerica App

  Background:
    Given Application is launched

  @test
  Scenario Outline: Login Page automation
    Then Login in the application with "<username>" and "<password>"
    Examples:
      | username | password |
      | 70028763 | 420420   |

  @appForm
  Scenario Outline: Application form automation
    When Login in the application with "<username>" and "<password>"
    Then Add details in Application form of "<gender>" and "<sameAsProposer>"
    Then Choose Product
    Examples:
      | username | password | gender | sameAsProposer |
      | 70028763 | 420420   | female | true           |
#