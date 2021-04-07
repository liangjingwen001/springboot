package firstproject.first.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import firstproject.first.bean.Account;
import firstproject.first.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping("list")
    public Page<Account> accountList(){

        // 查询所有
        // List<Account> list = accountService.list();

        // 分页查询
        Page<Account> accountPage = new Page<>(2,3);
        Page<Account> page = accountService.page(accountPage, null);
        return page;
    }
}
