/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carabettaspringboottpfinal.ArgProg.Controller;

import com.carabettaspringboottpfinal.ArgProg.Models.Educacion;
import com.carabettaspringboottpfinal.ArgProg.Models.Experiencia;
import com.carabettaspringboottpfinal.ArgProg.Service.IEducacionService;
import com.carabettaspringboottpfinal.ArgProg.Service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EducacionController {
    
    @Autowired
    private IEducacionService edServ;

    @GetMapping("/educacion")
    @ResponseStatus(HttpStatus.OK)
    public List<Educacion> getEducacion() {
        return edServ.getEducacion();
    }
    
    @PostMapping("/educacion")
    public void postEducacion(@RequestBody Educacion ed){
        edServ.postEducacion(ed);
    }    
}
