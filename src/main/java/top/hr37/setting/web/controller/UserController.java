package top.hr37.setting.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.hr37.setting.service.UserService;

import javax.annotation.Resource;

@Controller
@RequestMapping("/setting")
public class UserController {

    @Resource
    private UserService service;
    private ModelAndView mv = new ModelAndView();


}
