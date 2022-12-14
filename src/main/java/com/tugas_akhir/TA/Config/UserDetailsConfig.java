/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tugas_akhir.TA.Config;

import com.tugas_akhir.TA.Entities.Users;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author danu_prat
 */
public class UserDetailsConfig implements org.springframework.security.core.userdetails.UserDetails{
     
     @Autowired
     private Users users;
     
     public UserDetailsConfig(Users users) {
          this.users = users;
     }

     @Override
     public Collection<? extends GrantedAuthority> getAuthorities() {
           return null;
     }

     @Override
     public String getPassword() {
          return users.getPassword();
     }

     @Override
     public String getUsername() {
          return users.getUsername();
     }

     @Override
     public boolean isAccountNonExpired() {
          return true;
     }

     @Override
     public boolean isAccountNonLocked() {
          return true;
     }

     @Override
     public boolean isCredentialsNonExpired() {
          return true;
     }

     @Override
     public boolean isEnabled() {
          return users.getIsActive();
     }
     
}
