/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tugas_akhir.TA.Config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;

/**
 *
 * @author danu_prat
 */
public class Logout implements LogoutHandler{

     @Override
     public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
          System.out.println("Success Logout handler");
     }
}
