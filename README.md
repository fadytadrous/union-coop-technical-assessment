

## High-level test Scenarios For Jumia App 

|No.| Name |Expected Results|Preconditions|Test Data|Priority|
|--|:---:|--------------|:------:|:---:|:----:|
|1|User Registration | New user  register successfully on the app.|||High|
|2 | User Login |Existing users log in to the app without any issues.|User has already registered|Registered Email and Password|High|
|3|Browsing Products| User browse and view products by different categories.|||Medium|
|4|Product Search|  Search for products using the search functionality.|||High|
|5|Viewing Product Details| User view detailed information about a product.|||High|
|6|Adding to Cart |user add products to their shopping cart without any issues.|User is logged in to the app.||High|
|7|Cart Management|user add,remove or edit items in their shopping cart. |User is logged in to the app and has items in the cart.||High|
|8|Checkout Functionality |User  successfully complete the checkout process.|||High|
|9|Check different payment options|User choose from different payment and can successfully complete an order using any payment option|User is logged in to the app and has items in the cart.||High|
|10|Order Tracking| User can track the status of their orders.|||Medium|
|11|Editing user profile| User can update their account information. |||Low|
|12|Check disabling different App permisions| App will be working according to the allowed permisions only  |||Medium|
|13|Check Screen rotation with the app |App will be rotated through various pages.|||Medium|
|14|Check switching smartphone themes|App will remain working |||Low|
|15|Check App running in background | App will remain working depending on power saving mode |||Low|
|16|Reset password using verification code| User reset password with verification code by Email or SMS |User has already registered||High|
|17|Check Application offers|Offers are working correctly for the user  |||High|
---

## Test Cases for Search Page

### Verify that the user can input a search query


#### Test Steps:
1. Navigate to the search page.
2. Enter a search query into the search box.


#### Expected Result:
* The entered search query is displayed in the search box.


---

### Verify that Clicking on google search button gets search results

#### Test Steps:
1. Navigate to the search page.
2. Enter a valid search query into the search box.
3. Click on the google search button.


#### Expected Result:
* Clicking on the button proceeds to the search results page

---

### Verify that Enter key gets search results


#### Test Steps:
1. Navigate to the search page.
2. Enter a valid search query into the search box.
3. Press the "Enter".


#### Expected Result:
* "Enter" key proceeds to the search results page


---
### Verify that relevant search results are displayed

#### Test Steps:
1. Navigate to the search page.
2. Enter a valid search query into the search box.
3. Press the "Enter" key or click on the search button.


#### Expected Result:
* Search results are displayed on the page with the exact search criteria

---

### Verify that search suggestions are displayed as the user types

#### Test Steps:
1. Navigate to the search page.
2. Enter a partial search query into the search box.

#### Expected Result:
* Search suggestions are displayed below the search box.
---

### Verify that Clear button deletes search query

#### Test Steps:
1. Navigate to the search page.
2. Enter a valid search query into the search box.
3. Click on the Clear button.

#### Expected Result:
* Search Query is empty.

---
