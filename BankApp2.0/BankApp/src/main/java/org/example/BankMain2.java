package org.example;

import com.bankapp.impl.BankServiceDAO;
import com.bankapp.impl.BankServiceDAOImpl;
import com.bankapp.model.BankAccounts;
import com.bankapp.model.Customer;
import com.bankapp.model.Employee;
import com.bankapp.service.InfoCollectService;
import com.bankapp.service.impl.InfoCollectServiceImpl;
import io.javalin.Javalin;


import java.util.List;

public class BankMain2 {

    public static void main(String[] args) {

    InfoCollectService service = new InfoCollectServiceImpl();
        BankServiceDAO dao = new BankServiceDAOImpl();


    Javalin app=Javalin.create(config->config.enableCorsForAllOrigins()).
            start(7000);

        app.post("/customer",ctx -> {
        Customer customer=ctx.bodyAsClass(Customer.class);
        customer=service.setUpCustomer(customer.getCustomer_name(),customer.getCustomer_id(),customer.getCustomer_age(),customer.getCustomer_pass());
        //ctx.result(customer.getCustomer_name());
        //ctx.result(customer.getCustomer_name());
        ctx.json(customer);
    });


        app.get("/customer/:customer_id",ctx -> {
        //Customer customer=ctx.bodyAsClass(Customer.class);
        List<BankAccounts> bankAccountsList =dao.customersById(Integer.parseInt(ctx.pathParam("customer_id")));
        //ctx.result(customer.toString());
        ctx.json(bankAccountsList);
    });

        app.get("/customers",ctx -> {
        //Customer customer=ctx.bodyAsClass(Customer.class);
        List<Customer> customerList = service.getCustomers();
        //ctx.result(customer.toString());
        ctx.json(customerList);
    });

        app.post("/customer/login",ctx -> {               //requires customer ID and Password
            Customer customer=ctx.bodyAsClass(Customer.class);
            customer=dao.userValidation3(customer);
            List<Customer> customer2=service.getCustomerInfo(customer);
//            if(customer.isAccount_approval()==true){
//                ctx.json("Access Granted");
//            }else{
//                ctx.json("Rejected Access");
            //}
            //ctx.resultFuture();
            //ctx.json(customer);
            ctx.json(customer2);
        });

        app.post("/customer2",ctx -> {
            Customer customer=ctx.bodyAsClass(Customer.class);
            customer= dao.createCustomer(customer);
            //ctx.result(customer.getCustomer_name());
            //ctx.json("Hello "+customer.getCustomer_id()+customer.getCustomer_pass());
            //ctx.result("What the hell man");
            ctx.json(customer);
        });

        app.get("/customer/welcome",ctx -> {
            Customer customer=ctx.bodyAsClass(Customer.class);
            List<Customer> customerList = dao.getCustomerInfoByID(customer.getCustomer_id(), customer.getCustomer_pass());
            ctx.result(customerList.toString());
            ctx.json(customerList);
        });

        app.put("/customer/depositchecking",ctx->{
            Customer customer=ctx.bodyAsClass(Customer.class);
            customer=dao.depositChecking2(customer);
            ctx.json(customer);
        });

        app.put("/customer/depositsaving",ctx->{
            Customer customer=ctx.bodyAsClass(Customer.class);
            customer=dao.depositSavings2(customer);
            ctx.json(customer);
        });

        app.put("/customer/withdrawchecking",ctx->{
            Customer customer=ctx.bodyAsClass(Customer.class);
            customer=dao.withdrawChecking2(customer);
            ctx.json(customer);
        });

        app.put("/customer/withdrawsaving",ctx->{
            Customer customer=ctx.bodyAsClass(Customer.class);
            customer=dao.withdrawSaving2(customer);
            ctx.json(customer);
        });

        app.post("/customer3",ctx -> {
            BankAccounts bankaccounts = ctx.bodyAsClass(BankAccounts.class);
            bankaccounts = dao.CustomerAcct(bankaccounts);
            //ctx.result(customer.getCustomer_name());
            //ctx.json("Hello "+customer.getCustomer_id()+customer.getCustomer_pass());
            //ctx.result("What the hell man");
            ctx.json(bankaccounts);
        });

        app.post("/employee/login",ctx -> {
            Employee employee = ctx.bodyAsClass(Employee.class);
            List<Employee> employee2=dao.empValidation(employee);
            //ctx.result(customer.getCustomer_name());
            //ctx.json("Hello "+customer.getCustomer_id()+customer.getCustomer_pass());
            //ctx.result("What the hell man");
            ctx.json(employee2);
        });

        app.post("/employee/approve",ctx -> {
            BankAccounts bankAccounts = ctx.bodyAsClass(BankAccounts.class);
            bankAccounts=dao.accountApproval2(bankAccounts);
            //ctx.result(customer.getCustomer_name());
            //ctx.json("Hello "+customer.getCustomer_id()+customer.getCustomer_pass());
            //ctx.result(String.valueOf(bankAccounts));
            ctx.json(bankAccounts);
        });

        app.post("/employee/deny",ctx -> {
            BankAccounts bankAccounts = ctx.bodyAsClass(BankAccounts.class);
            bankAccounts=dao.accountDenial2(bankAccounts);
            //ctx.result(customer.getCustomer_name());
            //ctx.json("Hello "+customer.getCustomer_id()+customer.getCustomer_pass());
            //ctx.result(String.valueOf(bankAccounts));
            ctx.json(bankAccounts);
        });

        app.post("/newemployee",ctx -> {
            Employee employee=ctx.bodyAsClass(Employee.class);
            employee= dao.addEmployee(employee);
            ctx.json(employee);
        });

        app.get("/customers/:account_approval",ctx -> {
//            BankAccounts bankAccounts=ctx.bodyAsClass(BankAccounts.class);
            List<BankAccounts> bankAccountsList =dao.customersByApprove(Boolean.parseBoolean(ctx.pathParam("account_approval")));
           //ctx.result(bankAccountsList.account_approval);
            ctx.json(bankAccountsList);
        });


    }
}
