@web @drag
Feature: US_03 Drag and Drop

  Scenario: TC_03 Drag and Drop
    Given User goes to "demoqa_url".
    Then User clicks the Interactions
    And User clicks Droppables
    When User moves the box of "drag_me" to box of "drop_here"
    Then Verify that "drop_here" changed to "dropped_message"
