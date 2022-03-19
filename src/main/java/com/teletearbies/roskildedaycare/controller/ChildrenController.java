package com.teletearbies.roskildedaycare.controller;

import com.teletearbies.roskildedaycare.service.ChildrenService;
import com.teletearbies.roskildedaycare.entity.Children;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ChildrenController {
    @Autowired
    private ChildrenService childrenService;


    @RequestMapping("/childrenList")
    public String displayChildrenList(Model model) {
        List<Children> listChildren = childrenService.getAllChildren();
        model.addAttribute("listChildren", listChildren);
        return "children";
    }

}
