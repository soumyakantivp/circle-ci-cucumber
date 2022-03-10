Feature: Sign Up to EBL

  Scenario Outline: <case>
    Given the user navigates to EBL Signup
    When the user enters "<full_name>" as full name
    And the user enters "<org_name>" as org name
    And the user enters "<email>" as email
    And the user enters "<password>" as password
    And the user clicks submit
    Then the user is "<result>"

    #existing org name - 'org'
    Examples: 
      | case                                           | full_name | org_name | email          | password | result        |
      | Invalid email with other details good          | toto      | org1     | 123.gmail.com  | 12345678 | not logged in |
      | Giving special char in org name                | toto      | !org@    | toto@gmail.com | 12345678 | not logged in |
      | Full Name with special characters              | toto@     | org1     | toto@gmail.com | 12345678 | logged in     |
      | Email without or with invalid domain extension | toto      | org1     | rachit@msg91   | 12345678 | not logged in |
