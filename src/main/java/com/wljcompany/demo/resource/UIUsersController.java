package com.wljcompany.demo.resource;

import com.wljcompany.demo.mapper.UserMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UIUsersController {

    private UserMapper userMapper;
    private final Logger logger = LogManager.getLogger(this.getClass());

    // This will make userMapper Autowired
    public UIUsersController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @RequestMapping("/ui/users")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userMapper.findAll());
        logger.info("Info log {}", model);
        return "users";
    }

}
