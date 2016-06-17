Feature:calculatorfeature
Scenario Outline: ATDD
Given user enters an <expr>
Then result should be <expr>





Examples:
|expr        | result |
|"1,2,3,+,-" | "-4"   |