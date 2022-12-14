/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tugas_akhir.TA.Repositories;

import com.tugas_akhir.TA.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author danu_prat
 */
public interface UsersRepository extends JpaRepository<Users, Integer>{
     
     @Query(value = "SELECT * FROM users WHERE username=?1", nativeQuery = true)
     public Users findUserByEmail(String email);
     
}
