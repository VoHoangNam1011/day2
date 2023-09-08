package org.example.pojo;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class Account {
    private long id;
    private String ownerName;
    private double balance;
    private Date accessTime;
    private boolean locked;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Date accessTime) {
        this.accessTime = accessTime;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public static class AccountRepositoryImpl implements AccountRepository {
        private Map<Long, Account> accountsMap = new HashMap<>();
        {
            Account account1 = new Account();
            account1.setId(1L);
            account1.setOwnerName("John");
            account1.setBalance(10.0);

            Account account2 = new Account();
            account2.setId(2L);
            account2.setOwnerName("John");
            account2.setBalance(10.0);

            accountsMap.put(account1.getId(), account1);
            accountsMap.put(account2.getId(), account2);
        }
        @Override
        public void insert(Account account) {
            accountsMap.put(account.getId(), account);
        }
        @Override
        public void update(Account account) {
            accountsMap.put(account.getId(), account);
        }
        @Override
        public Account find(long accountId) {
            return accountsMap.get(accountId);
        }
    }
}
