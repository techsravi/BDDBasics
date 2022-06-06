Feature: Login Test

Senario: Succesfull login with valid username and password
Given: Launch browser
When: Open URL "https://admin-demo.nopcommerce.com/"
And: Enter usear name as "admin@yourstore.com" and password as "admin"
And: Click on login btn
Then valid page title as "Dashboard / nopCommerce administration"
When click on logout
And close browser