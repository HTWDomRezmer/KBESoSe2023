package dev.kbe.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public List<Account> allAccounts(){
        return accountRepository.findAll();
    }
}
