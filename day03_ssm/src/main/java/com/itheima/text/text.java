package com.itheima.text;

import com.itheima.domain.Account;
import com.itheima.services.AccountServices;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class text {
    @Test
    public void findAll(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountServices accountServices = classPathXmlApplicationContext.getBean(AccountServices.class, "accountServices");
        List<Account> all = accountServices.findAll();
        System.out.println(all);
    }
}
