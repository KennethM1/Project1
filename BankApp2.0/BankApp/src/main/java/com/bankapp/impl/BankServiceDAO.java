package com.bankapp.impl;

import com.bankapp.exception.SqlException;
import com.bankapp.model.BankAccounts;
import com.bankapp.model.Customer;
import com.bankapp.model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface BankServiceDAO {
        public Customer getCustomerById(long customer_id) throws SqlException;

        public Customer getCustomerByName(String customer_name) throws SqlException;

        public Customer setCustomerPassword(String customer_pass, String customer_name) throws SqlException;

        public Customer setCustomerUser(String customer_username) throws SqlException;

        public Customer userValidation(Long customer_id, String customer_pass) throws SqlException;

        public Employee userValidation2(int employee_id, String employee_pass) throws SqlException;

        public Employee userLookup(long customer_id, String customer_name) throws SqlException;

        public Customer inputCustomer(String customer_name, int customer_age, String customer_pass) throws SqlException;

        public Employee accountApproval(int account_id) throws SqlException;

        public Employee accountDenial(int account_id) throws SqlException;

        public List<Customer> getCustomers() throws SqlException;

        public Customer depositChecking(int checking_account, long customer_id) throws SqlException;

        public Customer setUpAccount(String customer_name,int checking_account,int account_id, long customer_id, int savings_account) throws SqlException;

        public Customer setUpCustomer(String customer_name,long customer_id,int customer_age,String customer_pass) throws SqlException;

        public Customer withdrawChecking(int checking_account,long customer_id) throws SqlException;

        public Customer withdrawSavings(int savings_account,long customer_id) throws SqlException;

        public Customer depositSavings(int savings_account,long customer_id) throws SqlException;

        public Customer checkingValidate(long customer_id, int checking_account) throws SqlException;

        public Customer createCustomer(Customer customer) throws SqlException;

        public Customer userValidation3(Customer customer) throws SqlException;

        public List<Customer> getCustomerInfo(Customer customer) throws SqlException;

        public List<Customer> getCustomerInfoByID(long customer_id, String customer_pass) throws SqlException;

        public Customer depositChecking2(Customer customer) throws SqlException;

        public Customer depositSavings2(Customer customer) throws SqlException;

        public Customer withdrawChecking2(Customer customer) throws SqlException;

        public Customer withdrawSaving2(Customer customer) throws SqlException;

        public BankAccounts CustomerAcct(BankAccounts bankaccounts) throws SqlException;

        public List<Employee> empValidation(Employee employee) throws SqlException;

        public BankAccounts accountApproval2(BankAccounts bankAccounts) throws SqlException;

        public BankAccounts accountDenial2(BankAccounts bankAccounts) throws SqlException;

        public Employee addEmployee(Employee employee) throws SqlException;

        public List<BankAccounts> customersById(long customer_id) throws SqlException;

        public List<BankAccounts> customersByApprove(boolean account_approval) throws SqlException;
}
