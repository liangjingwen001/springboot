package firstproject.first.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        /**
         * 1.允许访问的路径
         * 2.允许跨域的来源
         * 3.允许跨域的方法
         * 4.允许携带请求头
         * 5.最大响应时间
         * **/
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8080", null)
                .allowedMethods("GET","POST","PUT","OPTIONS","DELETE")
                .allowCredentials(true)
                .maxAge(3600);
    }
}