package com.example;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mapper.UserMapper;
import com.example.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class MPMapperCrudTests {

    @Resource
    private UserMapper userMapper;


    /**
     * 查询全部记录
     */
    @Test
    void testSelectList() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    /**
     * 查询名字中包含ie的用户
     */
    @Test
    public void testSelectListByCondition() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", "ie");
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }

    /**
     * selectList(Map<String,Object></>)
     * SELECT id,name,age,email FROM user WHERE name = ? AND email = ?
     */
    @Test
    public void testSelectById() {
        HashMap<String, Object> paramsMap = new HashMap<>();
        paramsMap.put("name", "zhangJie");
        paramsMap.put("email", "160120@qq.com");
        List<User> users = userMapper.selectByMap(paramsMap);
        users.forEach(System.out::println);
    }

    /**
     * 插入一条数据：insert(T t)
     */
    @Test
    void testInsert() {
        User user = new User();
        user.setName("zhangJie");
        user.setAge(27);
        user.setEmail("160120@qq.com");
        userMapper.insert(user);
    }

    /**
     * 通过QueryWrapper删除表中满足条件的记录
     */
    @Test
    public void testDeleteByWrapper() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("id", 1);
        int row = userMapper.delete(wrapper);
        if (row > 0) {
            System.out.println("删除id为1的用户成功");
        } else {
            System.out.println("删除id为1的用户成功");
        }
    }

    /**
     * deleteById(Object id):通过ID直接删除
     */
    @Test
    public void testDeleteByID() {
        int row = userMapper.deleteById(4);
        System.out.println(row > 0 ? "删除ID为4的用户成功!" : "删除ID为4的用户失败~");
    }

    /**
     * 根据ID进行修改，只修改不为空的数据
     */
    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(1565531313200271361L);
        user.setName("张洁");
        user.setEmail("5201314@yaoyuan.com");
        userMapper.updateById(user); // UPDATE user SET name=?, email=? WHERE id=?
    }

    @Test
    public void testSelectPage() {
        Page<User> iPage = userMapper.selectPage(new Page<>(1, 2), null);
        System.out.println("总记录数为：" + iPage.getTotal());
        System.out.println("当前页为： " + iPage.getCurrent());
        System.out.println("iPage.getPages() = " + iPage.getPages());
        List<User> records = iPage.getRecords();
        records.forEach(System.out::println);
    }

    /**
     * 测试自定义方法
     */
    @Test
    public void testUserDefinedMethod() {
        List<String> names = userMapper.listAllUserName();
        names.forEach(System.out::println);
    }

    @Test
    public void testUserDefinedMethod2() {
        List<User> userList = null;
        try {
            userList = userMapper.listAllUserEmail().stream()
                    .filter(x -> x.getEmail().equals("5201314@yaoyuan.com"))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("抱歉！系统发生了异常！！错误原因是：" + e.getMessage());
        }
        assert userList != null;
        userList.forEach(System.out::println);
    }

}
