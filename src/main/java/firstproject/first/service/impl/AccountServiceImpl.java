package firstproject.first.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import firstproject.first.bean.Account;
import firstproject.first.mapper.AccountMapper;
import firstproject.first.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {
}
