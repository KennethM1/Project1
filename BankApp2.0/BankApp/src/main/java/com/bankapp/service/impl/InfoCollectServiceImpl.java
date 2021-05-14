package com.bankapp.service.impl;

import com.bankapp.exception.SqlException;
import com.bankapp.impl.BankServiceDAO;
import com.bankapp.impl.BankServiceDAOImpl;
import com.bankapp.model.BankAccounts;
import com.bankapp.model.Customer;
import com.bankapp.model.Employee;
import com.bankapp.service.InfoCollectService;
//import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InfoCollectServiceImpl implements InfoCollectService {
    private static Map<Integer,Customer> map= new HashMap<>();
    private BankServiceDAO bankServiceDAO= new BankServiceDAOImpl();
    @Override
    public Customer getCustomerById(long customer_id) throws SqlException {
        Customer customer=null;
        customer=bankServiceDAO.getCustomerById(customer_id);
        return customer;
    }

    @Override
    public Customer getCustomerByName(String customer_name) throws SqlException {
        Customer customer=null;
        customer=bankServiceDAO.getCustomerByName(customer_name);
        return customer;

    }

    @Override
    public Customer setCustomerPassword(String customer_pass, String customer_name) throws SqlException {
        Customer customer=null;
        customer=bankServiceDAO.setCustomerPassword (customer_pass,customer_name);
        return customer;
    }

    @Override
    public Customer setCustomerUser(String customer_username) throws SqlException {
        return null;
    }

    @Override
    public Customer userValidation(long customer_id, String customer_pass) throws SqlException {
        Customer customer=null;
        customer=bankServiceDAO.userValidation(customer_id, customer_pass);
        return customer;
    }

    @Override
    public Employee userValidation2(int employee_id, String employee_pass) throws SqlException {
        Employee employee=null;
        employee=bankServiceDAO.userValidation2(employee_id, employee_pass);
        return employee;
    }

    @Override
    public Employee userLookup(long customer_id, String customer_name) throws SqlException {
        Employee employee=null;
        employee=bankServiceDAO.userLookup(customer_id, customer_name);
        return employee;
    }

    @Override
    public Customer inputCustomer(String customer_name, int customer_age, String customer_pass) throws SqlException {
        Customer customer=null;
        customer=bankServiceDAO.inputCustomer (customer_name, customer_age, customer_pass);
        return customer;
    }

    @Override
    public Employee accountApproval(int account_id) throws SqlException {
        Employee employee=null;
        employee=bankServiceDAO.accountApproval(account_id);
        return employee;
    }

    @Override
    public Employee accountDenial(int account_id) throws SqlException {
        Employee employee=null;
        employee=bankServiceDAO.accountDenial(account_id);
        return employee;
    }

    @Override
    public List<Customer> getCustomers() throws SqlException {
       return bankServiceDAO.getCustomers();
 }

    @Override
    public Customer depositChecking(int checking_account,  long customer_id) throws SqlException {
        Customer customer=null;
        customer=bankServiceDAO.depositChecking(checking_account, customer_id);
        return customer;
    }

    @Override
    public Customer setUpAccount(String customer_name, int checking_account, int account_id, long customer_id, int savings_account) throws SqlException {
        Customer customer=null;
        customer=bankServiceDAO.setUpAccount(customer_name, checking_account, account_id, customer_id, savings_account);
        return customer;
    }

    @Override
    public Customer setUpCustomer(String customer_name, long customer_id, int customer_age, String customer_pass) throws SqlException {
        Customer customer=null;
        customer=bankServiceDAO.setUpCustomer(customer_name, customer_id, customer_age, customer_pass);
        //customer.setCustomer_id(this.customer_id);
        //map.put(customer.getCustomer_age(),customer);
        return (customer);
    }

    @Override
    public Customer withdrawChecking(int checking_account, long customer_id) throws SqlException {
        Customer customer=null;
        customer=bankServiceDAO.withdrawChecking(checking_account, customer_id);
        return customer;
    }

    @Override
    public Customer withdrawSavings(int savings_account, long customer_id) throws SqlException {
        Customer customer=null;
        customer=bankServiceDAO.withdrawSavings(savings_account, customer_id);
        return customer;
    }

    @Override
    public Customer depositSavings(int savings_account, long customer_id) throws SqlException {
        Customer customer=null;
        customer=bankServiceDAO.depositSavings(savings_account, customer_id);
        return customer;
    }

    @Override
    public Customer checkingValidate(long customer_id, int checking_account) throws SqlException {
        Customer customer=null;
        customer=bankServiceDAO.checkingValidate(customer_id, checking_account );
        return customer;
    }

    @Override
    public Customer createCustomer(Customer customer) throws SqlException {

        return customer;
    }

    @Override
    public Customer userValidation3(Customer customer) throws SqlException {
        return customer;
    }

    @Override
    public List<Customer> getCustomerInfo(Customer customer) throws SqlException {
        if (customer != null) {
            return bankServiceDAO.getCustomerInfo(customer);
        } else {
            return null;

        }
    }

    @Override
    public List<Customer> getCustomerInfoByID(long customer_id, String customer_pass) throws SqlException {
        return bankServiceDAO.getCustomerInfoByID(customer_id,customer_pass);
    }

    @Override
    public Customer depositChecking2(Customer customer) throws SqlException {
        return bankServiceDAO.depositChecking2(customer);
    }

    @Override
    public Customer depositSavings2(Customer customer) throws SqlException {
        return bankServiceDAO.depositSavings2(customer);
    }

    @Override
    public Customer withdrawChecking2(Customer customer) throws SqlException {
        return bankServiceDAO.withdrawChecking2(customer);
    }

    @Override
    public Customer withdrawSaving2(Customer customer) throws SqlException {
        return bankServiceDAO.withdrawSaving2(customer);
    }

    @Override
    public BankAccounts CustomerAcct(BankAccounts bankaccounts) throws SqlException {
        return bankServiceDAO.CustomerAcct(bankaccounts);
    }

    @Override
    public List<Employee> empValidation(Employee employee) throws SqlException {
        return bankServiceDAO.empValidation(employee);
    }

    @Override
    public BankAccounts accountApproval2(BankAccounts bankAccounts) throws SqlException {
        return bankServiceDAO.accountApproval2(bankAccounts);
    }

    @Override
    public BankAccounts accountDenial2(BankAccounts bankAccounts) throws SqlException {
        return bankServiceDAO.accountDenial2(bankAccounts);
    }

    @Override
    public Employee addEmployee(Employee employee) throws SqlException {
        return bankServiceDAO.addEmployee(employee);
    }

    @Override
    public List<BankAccounts> customersById(long customer_id) throws SqlException {
        return bankServiceDAO.customersById(customer_id);
    }

    @Override
    public List<BankAccounts> customersByApprove(boolean account_approval) throws SqlException {
        return bankServiceDAO.customersByApprove(account_approval);
    }
}


