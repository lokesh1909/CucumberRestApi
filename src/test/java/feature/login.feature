Feature: Feature is to test dependencies and its working

Scenario Outline: scenario description
	Given Go to "<url>"
	When entered username "<uname>" and password "<pwd>"
	And user acess request is "Post" and "body"
	Then test login
	And Status code is <code>
		
Examples:
	| url | uname | pwd | code | casename |
	|url.com|test|test|200|Testing|
	|url.com2|test2|test2|100|Testing2|