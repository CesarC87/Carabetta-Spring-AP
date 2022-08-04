/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carabettaspringboottpfinal.ArgProg.Service;

import com.carabettaspringboottpfinal.ArgProg.Models.Educacion;
import java.util.List;

public interface IEducacionService {
    public List<Educacion> getEducacion();
    public List<Educacion> getEducacion_title();
    public void postEducacion (Educacion ed);
}
