Feature: feature to test google search functionality

  @Googletest
  Scenario Outline: Validaite google search is working
    Given browser is open
    When user enters <username> and <pass>
    And hits enter
    Then user is navigates to search results

    Examples: 
      | username        | pass         |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |
      | problem_user    | secret_sauce |
