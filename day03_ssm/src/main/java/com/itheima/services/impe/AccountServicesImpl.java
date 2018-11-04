package com.itheima.services.impe;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.services.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountServices")
public class AccountServicesImpl implements AccountServices {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("查询所有");
        return null;
    }

    @Override
    public void seveUser(Account account) {
    accountDao.seveUser(account);
    }
}
