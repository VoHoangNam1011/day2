package org.example.javabasedconfiguration;

import org.example.pojo.Account;
import org.example.pojo.AccountRepository;
import org.example.pojo.AccountService;
import org.example.pojo.AccountServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public AccountService accountService() {
        AccountServiceImpl bean = new AccountServiceImpl();
        bean.setAccountRepository(accountDao());
        return bean;
    }
    @Bean
    public AccountRepository accountDao() {
        Account.AccountRepositoryImpl bean = new Account.AccountRepositoryImpl();
        return bean;
    }
}
