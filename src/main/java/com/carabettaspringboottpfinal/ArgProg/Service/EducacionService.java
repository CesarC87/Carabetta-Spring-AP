/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carabettaspringboottpfinal.ArgProg.Service;

import com.carabettaspringboottpfinal.ArgProg.Models.Educacion;
import com.carabettaspringboottpfinal.ArgProg.Repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    @Autowired
    public EducacionRepository edRepo;
    
    @Override
    public List<Educacion> getEducacion() {
        return edRepo.findAll();
    }
    
    @Override
    public List<Educacion> getEducacion_title() {
        return edRepo.findAll();
    }

    @Override
    public void postEducacion(Educacion ed) {
        edRepo.save(ed);
    }
}

