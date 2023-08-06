
# Demo Banking Application
1. This is a demo banking application built using Spring Boot, Maven, and MySQL. The application provides various functionalities to simulate banking operations. It includes the following features:

2. Create Account: Allows users to create a new bank account with their details, including name, email, and initial balance.

3. Credit Account: Enables users to deposit funds into their account by specifying the account number and the amount to be credited.

4. Debit Account: Allows users to withdraw funds from their account by specifying the account number and the amount to be debited.

5. Name Enquiry: Allows users to inquire about the account holder's name by providing the account number.

6. Balance Enquiry: Provides users with their current account balance by providing the account number.

7. Transfer Amount: Allows users to transfer funds from their account to another account by specifying the source and destination account numbers and the amount to be transferred.

8. Email Alerts: The application sends email alerts to both the source and destination accounts during account creation and transfer transactions.
## Prerequisites
Before running the application, ensure that you have the following:

1. Java Development Kit (JDK) installed on your system.

2. Maven build tool installed.

3. MySQL database installed and configured with appropriate credentials.
## Api Endpoints
The controller class you provided looks like a RESTful API controller for a demo banking application. It maps HTTP endpoints to corresponding methods that handle various banking operations.

Let's break down the controller and its endpoints:

### Create Account Endpoint:
- HTTP Method: POST
- Endpoint: /api/user
- Description: This endpoint allows users to create a new bank account. It expects a UserRequest object in the request body, containing the user's details (name, email, and initial balance). The userService.createAccount() method is called to process the account creation, and it returns a BankResponse object as the response.

### Balance Enquiry Endpoint:

- HTTP Method: GET
- Endpoint: /api/user/balanceEnquiry
- Method: balanceEnquiry(@RequestBody EnquiryRequest enquiryRequest)
- Description: This endpoint allows users to inquire about their account balance. It expects an EnquiryRequest object in the request body, containing the account number for which the balance is to be queried. The userService.balanceEnquiry() method is called to retrieve the account balance, and it returns a BankResponse object as the response.

### Name Enquiry Endpoint:

- HTTP Method: GET
- Endpoint: /api/user/nameEnquiry
- Method: nameEnquiry(@RequestBody EnquiryRequest enquiryRequest)
- Description: This endpoint allows users to inquire about the account holder's name. It expects an EnquiryRequest object in the request body, containing the account number for which the account holder's name is to be queried. The userService.nameEnquiry() method is called to retrieve the account holder's name, and it returns a String as the response.


### Credit Account Endpoint:

- HTTP Method: POST
- Endpoint: /api/user/credit
- Method: creditAccount(@RequestBody CreditDebitRequest creditDebitRequest)
- Description: This endpoint allows users to credit funds to their account. It expects a CreditDebitRequest object in the request body, containing the account number and the amount to be credited. The userService.creditAccount() method is called to process the credit transaction, and it returns a BankResponse object as the response.


### Debit Account Endpoint:

- HTTP Method: POST
- Endpoint: /api/user/debit
- Method: debitAccount(@RequestBody CreditDebitRequest creditDebitRequest)
- Description: This endpoint allows users to debit funds from their account. It expects a CreditDebitRequest object in the request body, containing the account number and the amount to be debited. The userService.debitAccount() method is called to process the debit transaction, and it returns a BankResponse object as the response.


### Transfer Amount Endpoint:

- HTTP Method: POST
- Endpoint: /api/user/transfer
- Method: transferAmount(@RequestBody TransferRequest transferRequest)
- Description: This endpoint allows users to transfer funds from their account to another account. It expects a TransferRequest object in the request body, containing the source and destination account numbers and the amount to be transferred. The userService.transfer() method is called to process the transfer transaction, and it returns a BankResponse object as the response.