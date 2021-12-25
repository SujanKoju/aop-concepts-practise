package com.example.preparation;

import com.example.preparation.aop.afterthrow.model.Account;
import com.example.preparation.aop.afterthrow.service.impl.AccountService;
import com.example.preparation.aop.afterthrow.service.impl.AccountServiceImpl;
import com.example.preparation.aop.around.service.BankService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(proxyTargetClass = true)
@SpringBootApplication
public class PreparationApplication {

    public static void main(String[] args) {


        /*   SpringApplication.run(PreparationApplication.class, args);*/

        ConfigurableApplicationContext ac = SpringApplication.run(PreparationApplication.class, args);
//Fetching the account object from the application context
        AccountService accountService = ac.getBean("accountServiceImpl", AccountServiceImpl.class);
        Account account;
        try {
//generating exception
            account = accountService.getAccountByCustomerId(null);
            if (account != null) System.out.println(account.getAccountNumber() + "\t" + account.getAccountType());
        } catch (Exception e) {
            System.out.println(e.getMessage());
//e.printStackTrace();
        }
/*
        ConfigurableApplicationContext context = SpringApplication.run(PreparationApplication.class, args);
        // Fetching the employee object from the application context.
        BankService bank = context.getBean(BankService.class);
        // Displaying balance in the account.
        String accnumber = "12345";
        bank.displayBalance(accnumber);
        // Closing the context object.
        context.close();*/
    }

}
