/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carabettaspringboottpfinal.ArgProg.Service;

import com.carabettaspringboottpfinal.ArgProg.Models.Proyectos;
import java.util.List;


public interface IProyectosService {
    public List<Proyectos> getProyectos();    
    public void postProyectos (Proyectos proy);
}
