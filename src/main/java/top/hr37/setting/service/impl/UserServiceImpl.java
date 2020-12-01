package top.hr37.setting.service.impl;

import top.hr37.setting.dao.UserDao;
import top.hr37.setting.service.UserService;

import javax.annotation.Resource;

public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
}
