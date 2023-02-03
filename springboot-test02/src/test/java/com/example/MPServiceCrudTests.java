package com.example;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.model.User;
import com.example.service.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class MPServiceCrudTests {

    @Autowired
    private UserService userService;

    @Test
    public void test01() {
        userService.list().forEach(System.out::println);
        Long count = userService.lambdaQuery().count();
        System.out.println("count = " + count);
        Page<User> page = userService.page(new Page<>(1, 2));
        System.out.println("page.getSize() = " + page.getSize());
        System.out.println("page.getRecords() = " + page.getRecords());
    }

    @Test
    public void test02() {
        List<User> users = userService.listByIds(Arrays.asList(3, 1565531313200271361L));
        users.forEach(System.out::println);
        User user = userService.getOne(new QueryWrapper<User>().eq("name", "张洁"));
        System.out.println("user.name = " + user.getName());
    }

    @Test
    void test03() {
        List<User> users = Arrays.asList(new User(null, "姚远", 29, "2108900@qq.com")
                , new User(null, "lisisi", 24, "lisisi@qq.com"),
                new User(null, "wangwuwu", 25, "wangwuwu@wuwu.com"));
        boolean b = userService.saveBatch(users);
        if (b) {
            System.out.println("批量添加用户成功！！");
        } else {
            System.out.println("批量添加用户失败！！");
        }

        User user = userService.getById(1565608044091199489L);
        System.out.println("user.getName() = " + user.getName());
    }

}
