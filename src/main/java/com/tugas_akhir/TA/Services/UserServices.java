/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tugas_akhir.TA.Services;

import com.tugas_akhir.TA.Entities.Users;
import com.tugas_akhir.TA.Interfaces.UserInterfaces;
import com.tugas_akhir.TA.Repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author danu_prat
 */
@Service
public class UserServices implements UserInterfaces{
     
     @Autowired
     private UsersRepository userRepository;

     @Override
     public Users findByEmail(String email) {
          return userRepository.findUserByEmail(email);
     }
     
}
