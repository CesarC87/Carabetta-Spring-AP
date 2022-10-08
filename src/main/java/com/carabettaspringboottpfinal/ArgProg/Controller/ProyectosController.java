/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carabettaspringboottpfinal.ArgProg.Controller;

import com.carabettaspringboottpfinal.ArgProg.Models.Proyectos;
import com.carabettaspringboottpfinal.ArgProg.Service.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ProyectosController {
    @Autowired
    private IProyectosService proyServ;

    @CrossOrigin(origins = "*")
    @GetMapping("/proyectos")
    @ResponseStatus(HttpStatus.OK)
    public List<Proyectos> getProyectos() {
        return proyServ.getProyectos();
    }
    
    @PostMapping("/proyectos")
    public void postProyectos(@RequestBody Proyectos proy){
        proyServ.postProyectos(proy);
    }    
}
