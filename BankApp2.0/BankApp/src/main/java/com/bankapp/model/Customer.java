package com.bankapp.model;

public class Customer {
    private long customer_id;
    private String customer_name;
    private double account_balance;
    private boolean account_approved;
    private String customer_pass;
    private int customer_age;
    private int account_id;
    private int deposit_checking;
    private int checking_account;
    private int savings_account;
    private boolean account_approval;

    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }


    public int getCustomer_age() {
        return customer_age;
    }

    public void setCustomer_age(int customer_age) {
        this.customer_age = customer_age;
    }

    public int getAccount_id() {
        return account_id;
    }



    public int getChecking_account() {
        return checking_account;
    }

    public void setChecking_account(int checking_account) {
        this.checking_account = checking_account;
    }

    public int getSavings_account() {
        return savings_account;
    }

    public void setSavings_account(int savings_account) {
        this.savings_account = savings_account;
    }

    public boolean isAccount_approval() {
        return account_approval;
    }

    public void setAccount_approval(boolean account_approval) {
        this.account_approval = account_approval;
    }

    public String getCustomer_pass() {
        return customer_pass;
    }

    public void setCustomer_pass(String customer_pass) {
        this.customer_pass = customer_pass;
    }

    private Customer customer_user;

    public long getCustomer_id() {
        return customer_id;
    }





    public Customer getCustomer_user() {
        return customer_user;
    }

    public void setCustomer_user(Customer customer_user) {
        this.customer_user = customer_user;
    }

    public Customer() {
    }
    public void customer_login(){

    }





    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public double getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }

    public boolean isAccount_approved() {
        return account_approved;
    }

    public void setAccount_approved(boolean account_approved) {
        this.account_approved = account_approved;
    }

    public int getDeposit_checking() {
        return deposit_checking;
    }

    public void setDeposit_checking(int deposit_checking) {
        this.deposit_checking = deposit_checking;
    }

    public Customer message(){
        Customer wow = new Customer();
        System.out.println("thanks");
        return wow;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", customer_name='" + customer_name + '\'' +
                ", account_balance=" + account_balance +
                ", account_approved=" + account_approved +
                ", customer_pass='" + customer_pass + '\'' +
                ", customer_age=" + customer_age +
                ", account_id=" + account_id +
                ", deposit_checking=" + deposit_checking +
                ", checking_account=" + checking_account +
                ", savings_account=" + savings_account +
                ", account_approval=" + account_approval +
                ", customer_user=" + customer_user +
                '}';
    }
}
