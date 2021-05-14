package com.bankapp.model;

public class Employee {
    private int employee_id;
    private String employee_pass;
    private String employee_name;
    private int account_id;

public  Employee(){

}
    public Employee(int employee_id, String employee_pass) {
        this.employee_id = employee_id;
        this.employee_pass = employee_pass;
    }

    public Employee(int employee_id, String employee_pass, String employee_name) {
        this.employee_id = employee_id;
        this.employee_pass = employee_pass;
        this.employee_name = employee_name;
    }

    public int getEmployeeID() {
        return employee_id;
    }

    public void setEmployeeID(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_pass() {
        return employee_pass;
    }

    public void setEmployee_pass(String employee_pass) {
        this.employee_pass = employee_pass;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", employee_pass='" + employee_pass + '\'' +
                ", employee_name='" + employee_name + '\'' +
                '}';
    }
}
