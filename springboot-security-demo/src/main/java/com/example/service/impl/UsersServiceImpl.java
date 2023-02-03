package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mapper.UsersMapper;
import com.example.model.Users;
import com.example.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @Author yuanyao
 * @Date 2022/9/14
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService, UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public UserDetails loadUserByUsername(String username) {

        if (!"admin".equals(username)) {
            throw new UsernameNotFoundException("找不到此用户！");
        }
        // 通过
        QueryWrapper<Users> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username);
        Users user = usersMapper.selectOne(wrapper);

        // 对从数据库中查询出来的密码进行解析（加密）
        String newPassword = passwordEncoder.encode(user.getPassword());

        // authority:权限
        return new User(username, newPassword, AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
