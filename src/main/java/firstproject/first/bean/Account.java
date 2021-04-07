package firstproject.first.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @TableName("account_table")：指定表名
 * @TableField(exist = false)：定义表中不存在的字段
 * **/
@Data
@ToString
@AllArgsConstructor
public class Account {

    private int id;
    private String name;
    private int money;
}
