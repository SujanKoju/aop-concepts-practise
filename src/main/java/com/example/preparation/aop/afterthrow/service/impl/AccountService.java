package com.example.preparation.aop.afterthrow.service.impl;


import com.example.preparation.aop.afterthrow.model.Account;

//creating interface that throws exception if the customer id not found
public interface AccountService {
    public abstract Account getAccountByCustomerId(String customerId)
            throws Exception;
}
