package com.bankapp.model;

import java.sql.Timestamp;

public class Transactions {
    private int transaction_id;
    private int account_id;
    private Timestamp time_stamp;
    private double amount;



    public Transactions() {
    }

    public Transactions(int transaction_id, int account_id, Timestamp time_stamp, double amount) {
        this.transaction_id = transaction_id;
        this.account_id = account_id;
        this.time_stamp = time_stamp;
        this.amount = amount;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public Timestamp getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(Timestamp time_stamp) {
        this.time_stamp = time_stamp;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "transaction_id=" + transaction_id +
                ", account_id=" + account_id +
                ", time_stamp=" + time_stamp +
                ", amount=" + amount +
                '}';
    }
}
