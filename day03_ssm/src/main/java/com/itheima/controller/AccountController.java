package com.itheima.controller;

 import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.services.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("account")
public class AccountController {
    @Autowired
    private AccountServices accountServices;

    @RequestMapping("findAll")
    public String findAll(){
        System.out.println("1024");
        accountServices.findAll();
        return "success";
    }

    @RequestMapping("seve")
    public String seve(Account account){
        System.out.println("aaaaa");
        accountServices.seveUser(account);
        return "success";
    }

}
