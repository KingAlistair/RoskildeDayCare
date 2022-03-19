package com.teletearbies.roskildedaycare.controller;

import com.teletearbies.roskildedaycare.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ScheduleController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/createWorkSchedules")
    public String manageEmployeeSchedules(Model model){

        model.addAttribute("allEmployees", employeeService.getAllEmployees());

        return "manage-schedules";
    }
}
