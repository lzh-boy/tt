package com.bt.tt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Micro
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/6/417:17
 */
@Controller
public class index {
    @RequestMapping("/")
    public String page(Model model) {
        model.addAttribute("Name", "Micro");
        return "index";
    }
}
