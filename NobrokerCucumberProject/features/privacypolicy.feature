Feature: Privacy and policy
Scenario: privacy and policy page
Given User launch the chrome browser
When user opens URL NOb "https://www.nobroker.in/"
And click privacyPolicy option

Then close the browser
