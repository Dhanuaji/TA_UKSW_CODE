/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tugas_akhir.TA.Config;

import com.tugas_akhir.TA.Entities.Users;
import com.tugas_akhir.TA.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author danu_prat
 */
public class UsersDetailsServiceImpl implements UserDetailsService{
     
     @Autowired
     private UserServices userServices;

     @Override
     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
          Users users = userServices.findByEmail(username);
          
          if (users == null) {
               throw new UsernameNotFoundException("Could no find user");
          }
          return new UserDetailsConfig(users);
     }
}
