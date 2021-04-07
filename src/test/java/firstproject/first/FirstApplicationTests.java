package firstproject.first;

import firstproject.first.bean.Account;
import firstproject.first.mapper.AccountMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class FirstApplicationTests {

    @Autowired
    AccountMapper accountMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testAccountMapper() {
        Account account = accountMapper.selectById(6);
        System.out.println(account);
    }

}
