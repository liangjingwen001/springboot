package firstproject.first.controller;

import firstproject.first.bean.Car;
import firstproject.first.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class HelloController {

    @Autowired
    Car car;

    @RequestMapping("hello")
    public Car hello() {
        log.info(car.toString());
        return car;
    }

    /**
     * 获取路径上的参数、请求头参数和？后的参数（包括单个和全部）
     * localhost:9000//car/1/owner/zhangsan?hobby=BBQ&hobby=lanqiu&age=99
     * **/
    @RequestMapping("/car/{id}/owner/{name}")
    public Map<String, Object> getCar(@PathVariable("id") int id,
                                      @PathVariable("name") String name,
                                      @PathVariable Map<String, Object> pv,
                                      @RequestHeader("Content-Type") String ContentType,
                                      @RequestHeader Map<String, Object> header,
                                      @RequestParam("age") String age,
                                      @RequestParam("hobby") List<String > hobby,
                                      @RequestParam Map<String, Object> params
                                      ) {

        Map<String, Object> map = new HashMap<>();

        map.put("id", id);
        map.put("name", name);
        map.put("pv", pv);
        map.put("ContentType", ContentType);
        map.put("header", header);
        map.put("age", age);
        map.put("hobby", hobby);
        map.put("params", params);
        return map;
    }

    /**接收单个参数**/
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public Map postMethod(@RequestBody String content,
                          @RequestParam(name = "age", required = false) String age,
                          @RequestParam(name = "name", defaultValue = "lisi") String name) {

        Map<String, Object> map = new HashMap<>();

        map.put("content", content);
        map.put("age", age);
        map.put("name", name);
        return map;
    }

    /**Map 接收所有表单参数**/
    @RequestMapping(value = "save1", method = RequestMethod.POST)
    public Map postMethod1(@RequestParam Map<String, Object> param) {
        log.info(param.toString());

        Map<String, Object> map = new HashMap<>();

        map.put("age", param.get("name"));
        map.put("name", param.get("age"));
        return map;
    }

    /**对像接收所有表单参数**/
    @RequestMapping(value = "save2", method = RequestMethod.POST)
    public User postMethod2(User user) {
        return user;
    }

    /**对像接收所有JSON格式参数**/
    @RequestMapping(value = "save3", method = RequestMethod.POST)
    public User postMethod3(@RequestBody User user) {
        return user;
    }
}
