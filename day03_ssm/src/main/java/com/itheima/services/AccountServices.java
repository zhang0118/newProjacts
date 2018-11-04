package com.itheima.services;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountServices {
    /**
     * 查询所有
     * @return
     */
    List<Account> findAll();
    /**
     * 添加一行
     */
    void seveUser(Account account);
}
