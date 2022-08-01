/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carabettaspringboottpfinal.ArgProg.Service;

import com.carabettaspringboottpfinal.ArgProg.Models.Experiencia;
import java.util.List;

/**
 *
 * @author carab
 */
public interface IExperienciaService {
    public List<Experiencia> getExperiencia();
    public void postExperiencia (Experiencia exp);
}
