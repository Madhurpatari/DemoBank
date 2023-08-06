package com.demoBank.DemoBankingApplication.utils;

import java.time.Year;

public class AccountUtils {
    /*
    * 'account number= 2023 + random Six Digit Numbers
    **/
     public static String generateAccountNumber(){
         Year currentYear = Year.now();
         int min = 100000;
         int max = 999999;
         //generate random number
         int randomNumber = (int)Math.floor(Math.random() *(max - min +1) + min);
         //convert random number to string
         String year = String.valueOf(currentYear);
         String randNumber = String.valueOf(randomNumber);
         StringBuilder accountNumber = new StringBuilder();
         return accountNumber.append(year).append(randNumber).toString();
     }

     /*custom msg nd response code for already existing account*/
     public static  final String ACCOUNT_EXISTS_CODE = "001";
    public static  final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account created!!!";

    /*custom msg nd response code for successfully creation of an account*/
    public static  final String ACCOUNT_CREATION_CODE = "002";
    public static  final String ACCOUNT_CREATION_MESSAGE = "Account has been successfully created!!!";

    /*custom msg nd response code for already non-existing account or existing accounts*/
    public static  final String ACCOUNT_NOT_EXISTS_CODE = "003";
    public static  final String ACCOUNT_NOT_EXISTS_MESSAGE = "User with the provided account number doesn't exists..!!";
    public static  final String ACCOUNT_FOUND_CODE = "004";
    public static  final String ACCOUNT_FOUND_SUCCESS = "User Account found";

    /*custom msg nd response code for accounts credit successfully*/
    public static  final String ACCOUNT_CREDITED_SUCCESS = "005";
    public static  final String ACCOUNT_CREDITED_SUCCESS_MESSAGE = "Amount credit successfully";

    /*custom msg nd response code for insufficient balance*/
    public static  final String INSUFFICIENT_BALANCE_CODE = "006";
    public static  final String INSUFFICIENT_BALANCE_MESSAGE = "Insufficient amount";

    /*custom msg nd response code for accounts credit successfully*/
    public static  final String ACCOUNT_DEBITED_SUCCESS = "007";
    public static  final String ACCOUNT_DEBITED_SUCCESS_MESSAGE = "Amount debited successfully";

    /*custom msg nd response code for transfer successfully*/
    public static  final String TRANSFER_SUCCESSFUL_CODE = "008";
    public static  final String TRANSFER_SUCCESSFUL_MESSAGE = "Amount transferred successfully";




}
