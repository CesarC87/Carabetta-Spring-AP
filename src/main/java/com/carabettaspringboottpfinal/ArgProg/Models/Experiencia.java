/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carabettaspringboottpfinal.ArgProg.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter @Setter
@Entity
@Table(name = "experiencia")
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String experiencia;   
    private String exp_title;
    private String logo;
    private int person_id;
    
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//
//    @JoinColumn(name = "person_id", nullable = false)
//
//    @OnDelete(action=OnDeleteAction.NO_ACTION)
//
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//
//    private User user;

    
}
