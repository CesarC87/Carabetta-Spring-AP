/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carabettaspringboottpfinal.ArgProg.Service;

import com.carabettaspringboottpfinal.ArgProg.Models.Experiencia;
import com.carabettaspringboottpfinal.ArgProg.Repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    @Autowired
    public ExperienciaRepository expRepo;
    
    @Override
    public List<Experiencia> getExperiencia() {
        return expRepo.findAll();
    }
    
    @Override
    public List<Experiencia> getExperiencia_title() { 
        return expRepo.findAll();
    }

    @Override
    public void postExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }
}
