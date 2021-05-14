package org.example;
//package com.bankapp;

import com.bankapp.exception.SqlException;
import com.bankapp.impl.BankServiceDAO;
import com.bankapp.impl.BankServiceDAOImpl;
import com.bankapp.model.BankAccounts;
import com.bankapp.model.Customer;
import com.bankapp.model.Employee;
import com.bankapp.service.InfoCollectService;
import com.bankapp.service.impl.InfoCollectServiceImpl;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class BankMain {
    private static Logger log = Logger.getLogger(BankMain.class);


    public static void main(String[] args) {
        log.info("============Welcome to The Bank of Kenneth================");
        Scanner scanner = new Scanner(System.in);

        int ch = 0;
        do {

            log.info("============================");
            log.info("1)Login");
            log.info("2)Sign Up");
            log.info("3)EXIT");
            log.info("Enter your choice(1-3) : ");

            try {
                ch = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {

            }
            switch (ch) {
                case 1:
                    Scanner scan2 = new Scanner(System.in);
                    int bh = 0;
                    log.info("============================");
                    log.info("1. Sign in as a Customer");
                    log.info("========or========");
                    log.info("2. Sign in as a Employee");
                    log.info("============================");
                    bh = Integer.parseInt(scan2.nextLine());

                    if (bh == 1) {
                        log.info("============================");
                        log.info("Please Enter Your CustomerID");
                        log.info("============================");
                        long lg = scan2.nextLong();
                        scan2.nextLine();

                        log.info("============================");
                        log.info("Please Enter Your Password");
                        log.info("============================");
                        String pw = scan2.nextLine();

                        InfoCollectService infoCollectService = new InfoCollectServiceImpl();
                        try {
                            Customer customer = infoCollectService.userValidation(lg, pw);
                            log.info(customer);
                        } catch (SqlException e) {
                            log.error("Invalid input");
                        }
                        int cm = 0;

                        do {
                            log.info("============================");
                            log.info("1)Deposit into Checkings");
                            log.info("2)Withdraw from Checkings");
                            log.info("3)Deposit into Savings");
                            log.info("4)Withdraw from Savings");
                            log.info("5)Account Overview");
                            log.info("6)Exit");
                            cm = Integer.parseInt(scanner.nextLine());
                            InfoCollectService infoCollectService1 = new InfoCollectServiceImpl();
                            switch (cm) {
                                case 1:
                                    log.info("How much would you like to deposit?");
                                    int dch = Integer.parseInt(scanner.nextLine());
                                    if(dch<0){
                                        log.warn("Please enter a positive amount");
                                    }else {

                                        try {

                                            Customer customer = infoCollectService1.depositChecking(dch, lg);

                                        } catch (SqlException e) {
                                            log.warn("Server side error");
                                        }
                                    }
                                    break;
                                case 2:
                                    log.info("How much would you like to withdraw?");
                                    int wch = Integer.parseInt(scanner.nextLine());
                                    if(wch<0){
                                        log.warn("Please enter a positive amount");
                                    }else {

                                        try {
                                            Customer customer = infoCollectService1.withdrawChecking(wch, lg);

                                        } catch (SqlException e) {
                                            log.error("Server Side Error");
                                        }
                                    }
                                    break;
                                //test this change??????
                                case 3:
                                    log.info("How much would you like to deposit?");
                                    int dsv = Integer.parseInt(scanner.nextLine());
                                    if(dsv<0){
                                        log.warn("Please enter a positive amount");
                                    }else {

                                        try {

                                            Customer customer = infoCollectService1.depositSavings(dsv, lg);

                                        } catch (SqlException e) {
                                            log.error("Server side error");
                                        }
                                    }
                                    break;

                                case 4:
                                    log.info("How much would you like to withdraw?");
                                    int wsv = Integer.parseInt(scanner.nextLine());
                                    if(wsv<0){
                                        log.warn("Please enter a positive amount");
                                    }else {

                                        try {

                                            Customer customer = infoCollectService1.withdrawSavings(wsv, lg);

                                        } catch (SqlException e) {
                                            log.error("Sever Side Error");
                                        }
                                    }
                                    break;

                                case 5:
                                    try {
                                        infoCollectService.userValidation(lg, pw);
                                    } catch (SqlException e) {
                                        log.error("Server Side Error");
                                    }
                                    break;


                            }


                        } while (cm != 6);

                    } else if (bh == 2) {
                        log.info("============================");
                        log.info("Please Enter Your EmployeeID");
                        log.info("============================");
                        int lg = scan2.nextInt();
                        scan2.nextLine();

                        log.info("============================");
                        log.info("Please Enter Your Password");
                        log.info("============================");
                        String pw = scan2.nextLine();
                        InfoCollectService infoCollectService = new InfoCollectServiceImpl();
                        try {
                            Employee employee = infoCollectService.userValidation2(lg, pw);
                            if (lg != 1911) {
                                break;
                            }

                        } catch (SqlException e) {
                            log.error("Invalid Input");

                        }

                        int empl = 0;
                        do {
                            log.info("============================");
                            log.info("1)View Specific Customer Accounts");
                            log.info("2)View all Customer Accounts");
                            log.info("3)Approve a Customer Account");
                            log.info("4)Deny a Customer Account");
                            log.info("5)View all Transactions");
                            log.info("6)Exit");
                            log.info("Enter your choice(1-6) : ");

                            empl = Integer.parseInt(scanner.nextLine());


                            switch (empl) {
                                case 1:

                                    log.info("============================");
                                    log.info("============================");
                                    log.info("Please Enter Specific Customer ID");
                                    log.info("============================");
                                    int emp1 = scan2.nextInt();
                                    scan2.nextLine();
                                    log.info("============================");
                                    log.info("============================");
                                    log.info("Please Enter Specific Customer Name");
                                    log.info("============================");
                                    String emp2 = scan2.nextLine();
                                    InfoCollectService infoCollectService2 = new InfoCollectServiceImpl();
                                    try {
                                        Employee employee = infoCollectService2.userLookup(emp1, emp2);
                                    } catch (SqlException e) {
                                        log.error("The Employee ID and Password entered does not match our records");
                                    }

                                case 2:
                                    try {
                                        InfoCollectService infoCollectService3 = new InfoCollectServiceImpl();
                                        List<Customer> customerList = infoCollectService3.getCustomers();
                                        if (customerList != null && customerList.size() > 0) {
                                            System.out.println("We have total " + customerList.size() + " no of employees in DB... Printing the details below");
                                            for (Customer e : customerList) {
                                                log.info(e);
                                            }
                                        }
                                    } catch (SqlException e) {
                                        log.error(e.getMessage());
                                    }
                                    break;

                                case 3:
                                    log.info("============================");
                                    log.info("============================");
                                    log.info("Please Enter Specific Customer Account ID that should be approved");
                                    log.info("============================");
                                    int emp3 = scan2.nextInt();
                                    scan2.nextLine();

                                    InfoCollectService infoCollectService3 = new InfoCollectServiceImpl();
                                    try {
                                        Employee employee = infoCollectService3.accountApproval(emp3);
                                        log.info("Employee account has been approved");
                                    } catch (SqlException e) {
                                        log.info("Server Side Error");
                                    }
                                    break;
                                case 4:
                                    log.trace("============================");
                                    log.trace("============================");
                                    log.trace("Please Enter Specific Customer Account ID that should be denied");
                                    log.trace("============================");
                                    int emp4 = scan2.nextInt();
                                    scan2.nextLine();

                                    InfoCollectService infoCollectService4 = new InfoCollectServiceImpl();
                                    try {
                                        Employee employee = infoCollectService4.accountDenial(emp4);
                                        log.trace("Employee account has been rejected");
                                    } catch (SqlException e) {
                                        log.error("Server Side Error");
                                    }
                                    break;

                                case 5:

                            }

                        } while (empl != 6);
                    }
                    break;


                case 2:
                    //int bh = 0;
                    Customer customer2 = new Customer();
                    Scanner scan3 = new Scanner(System.in);
                    log.info("=============The================");
                    log.info("=============Bank===============");
                    log.info("==============Of================");
                    log.info("===========Kenneth==============");
                    log.info("================================");
                    log.info("================================");
                    log.info("  \"A Happy Home for Your Money\"  ;)");
                    log.info("=================================");
                    log.info("================================");
                    log.info("=================================");
                    log.info("=================================");
                    log.info("===================================");
                    log.info("==================================");
                    log.info("Please enter your first name");
                    String login_name = scan3.nextLine();
                    log.info("Please enter your age");
                    Integer login_age = scan3.nextInt();
                    log.info("Please enter your initial checking deposit amount");
                    Integer login_deposit = scan3.nextInt();
                    customer2.setChecking_account(login_deposit);
                    log.info("Please enter your initial savings deposit amount");
                    Integer login_deposit2 = scan3.nextInt();
                    customer2.setSavings_account(login_deposit2);
                    scan3.nextLine();
                    log.info("Please enter your password");
                    String login_pass = scan3.nextLine();
                    long randomNum = (long) (Math.random() * 900);
                    Customer customer = new Customer();
                    customer.setCustomer_id(randomNum);
                    int randomNum2 = (int) (Math.random() * 900);
                    customer.setAccount_id(randomNum2);
                    InfoCollectService infoCollectService4 = new InfoCollectServiceImpl();
                    try {
                        infoCollectService4.setUpCustomer(login_name, randomNum, login_age, login_pass);
                    } catch (SqlException e) {
                        log.error(e.getMessage());
                    }


                    log.info("Thank You! Your information will be viewed and either approved or rejected by our staff");
                    log.info("Your new Account ID is " + randomNum2 + " and your new Customer ID is " + randomNum);
                    int x = 0;
                    try {
                        infoCollectService4.setUpAccount(login_name, login_deposit, randomNum2, randomNum, login_deposit2);
                    } catch (SqlException e) {
                        log.error(e.getMessage());
                    }


                    break;


                case 3:
                    log.info("Thanks for using the App :) ");
                    break;
                default:
                    log.info("Invalid Input!!!!!! Your choice should be between 1-9 only........");

            }


        } while (ch != 3);

    }
}


