/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carabettaspringboottpfinal.ArgProg.Repository;

import com.carabettaspringboottpfinal.ArgProg.Models.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author carab
 */
public interface EducacionRepository extends JpaRepository <Educacion, Long>{
    
    
}
