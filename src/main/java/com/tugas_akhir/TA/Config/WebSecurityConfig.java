/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tugas_akhir.TA.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 *
 * @author danu_prat
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
     
     @Bean
     public UserDetailsService userDetailsService() {
          return new UsersDetailsServiceImpl();
     }
     
     @Bean
     public BCryptPasswordEncoder passwordEncoder() {
          return new BCryptPasswordEncoder();
     }
     
     @Bean
     public DaoAuthenticationProvider authenticationProvider() {
          DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
          authProvider.setUserDetailsService(userDetailsService());
          authProvider.setPasswordEncoder(passwordEncoder());
          
          return authProvider;
     }

     @Override
     protected void configure(AuthenticationManagerBuilder auth) throws Exception {
          auth.authenticationProvider(authenticationProvider());
          
     }
     
     @Override
     protected void configure(HttpSecurity http) throws Exception {
          http.
                  authorizeRequests()
                  .antMatchers("/css/**").permitAll()
                  .antMatchers("/dashboard").permitAll()
                  .antMatchers("/product").permitAll()
                  .antMatchers("/contact-us").permitAll()
                  .anyRequest()
                  .authenticated()
                  .and()
                  .formLogin()
//                  .loginPage("/admin-login").permitAll()
                  .defaultSuccessUrl("/admin-dashboard")
                  .usernameParameter("email")
                  .passwordParameter("password")
                  .and()
                  .logout()
                  .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                  .addLogoutHandler(new Logout())
                  .logoutSuccessUrl("/admin-login");
     }
}
