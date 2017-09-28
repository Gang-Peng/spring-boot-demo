package com.wljcompany.demo.resource;

import com.wljcompany.demo.mapper.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UIUsersController {

    private UserMapper userMapper;

    // This will userMapper Autowired
    public UIUsersController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @RequestMapping("/ui/users")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userMapper.findAll());
        return "users";
    }

}
