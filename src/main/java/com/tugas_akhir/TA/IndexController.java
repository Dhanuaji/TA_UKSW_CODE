/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tugas_akhir.TA;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author danu_prat
 */
@Controller
public class IndexController {
     
     @RequestMapping(value = "/admin-login", method = RequestMethod.GET)
     public String login () {
          return "LoginPage";
     }
    
    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String dashboard() {
        return "DashboardPage";
    }
    
    @RequestMapping(value = "/contact-us", method = RequestMethod.GET)
    public String contactPage() {
        return "ContactPage";
    }
    
    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public String productPage() {
        return "ProductsPage";
    }
    
    @RequestMapping(value = "/admin-dashboard", method = RequestMethod.GET)
    public String adminDashboardPage() {
        return "AdminDashboardPage";
    }
    
}
