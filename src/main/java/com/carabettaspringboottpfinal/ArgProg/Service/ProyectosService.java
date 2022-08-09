/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carabettaspringboottpfinal.ArgProg.Service;

import com.carabettaspringboottpfinal.ArgProg.Models.Proyectos;
import com.carabettaspringboottpfinal.ArgProg.Repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {
    @Autowired
    public ProyectosRepository proyRepo;
    
    @Override
    public List<Proyectos> getProyectos() {
        return proyRepo.findAll();
    }    

    @Override
    public void postProyectos(Proyectos proy) {
        proyRepo.save(proy);
    }
}
