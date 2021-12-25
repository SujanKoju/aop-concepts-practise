package com.example.preparation;

import com.example.preparation.aop.around.service.BankService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(proxyTargetClass = true)
@SpringBootApplication
public class PreparationApplication {

    public static void main(String[] args) {

        SpringApplication.run(PreparationApplication.class, args);/*
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
