package com.bankapp.model;

public class BankAccounts {

    private String customer_name;
    private int account_id;
    private int checking_account;
    private long customer_id;
    private int savings_account;
    private boolean account_approval;
    private int deposit_checking;
    private int deposit_savings;
    private int withdrawal_checking;
    private int withdrawal_saving;


    public BankAccounts() {
    }

    public BankAccounts(String customer_name, int account_id, int checking_account, long customer_id, int savings_account, boolean account_approval, int deposit_checking, int deposit_savings, int withdrawal_checking, int withdrawal_saving) {
        this.customer_name = customer_name;
        this.account_id = account_id;
        this.checking_account = checking_account;
        this.customer_id = customer_id;
        this.savings_account = savings_account;
        this.account_approval = account_approval;
        this.deposit_checking = deposit_checking;
        this.deposit_savings = deposit_savings;
        this.withdrawal_checking = withdrawal_checking;
        this.withdrawal_saving = withdrawal_saving;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getChecking_account() {
        return checking_account;
    }

    public void setChecking_account(int checking_account) {
        this.checking_account = checking_account;
    }

    public long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
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

    public int getDeposit_checking() {
        return deposit_checking;
    }

    public void setDeposit_checking(int deposit_checking) {
        this.deposit_checking = deposit_checking;
    }

    public int getDeposit_savings() {
        return deposit_savings;
    }

    public void setDeposit_savings(int deposit_savings) {
        this.deposit_savings = deposit_savings;
    }

    public int getWithdrawal_checking() {
        return withdrawal_checking;
    }

    public void setWithdrawal_checking(int withdrawal_checking) {
        this.withdrawal_checking = withdrawal_checking;
    }

    public int getWithdrawal_saving() {
        return withdrawal_saving;
    }

    public void setWithdrawal_saving(int withdrawal_saving) {
        this.withdrawal_saving = withdrawal_saving;
    }

    @Override
    public String toString() {
        return "BankAccounts{" +
                "customer_name='" + customer_name + '\'' +
                ", account_id=" + account_id +
                ", checking_account=" + checking_account +
                ", customer_id=" + customer_id +
                ", savings_account=" + savings_account +
                ", account_approval=" + account_approval +
                ", deposit_checking=" + deposit_checking +
                ", deposit_savings=" + deposit_savings +
                ", withdrawal_checking=" + withdrawal_checking +
                ", withdrawal_saving=" + withdrawal_saving +
                '}';
    }
}
