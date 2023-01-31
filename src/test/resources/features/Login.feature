Feature: Login

  @Smoke @Denys
  Scenario: MetTeam user story login 
  	
  	Given Login With valid credentials
  	When Verify you login in as "Admin"
  
  
    #Given select the "<selections>"
   # When select "Text Box" fill out to "<fullName>", "<email>", "<currentAdress>" and "<permanentAdress>" and click submit btn
    #Then assert text from output "<fullName>", "<email>", "<currentAdress>" and "<permanentAdress>"

   # Examples: 
    #  | selections | Price | fullName | email            | currentAdress | permanentAdress |
    #  | Elements   |    10 | Tamara   | Tamara@gmail.com | Miami, FL     | NewYork, NY     |

  