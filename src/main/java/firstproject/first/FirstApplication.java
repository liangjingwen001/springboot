package firstproject.first;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//全局配置就不需要每个方法都加@Mapper和@Service
//@MapperScan("firstproject.first.mapper")
//@ServletComponentScan(basePackages = "firstproject.first.service")
@SpringBootApplication
public class FirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class, args);
    }

}
