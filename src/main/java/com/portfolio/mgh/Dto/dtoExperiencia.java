/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mgh.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String FechaInicioE;
    @NotBlank
    private String FechaFinE;
    
    //Constructores

    public dtoExperiencia() {
        
    }

    public dtoExperiencia(String nombreE, String descripcionE, String FechaInicioE, String FechaFinE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.FechaInicioE = FechaInicioE;
        this.FechaFinE = FechaFinE;
    }
    
    //getters setters

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getFechaInicioE() {
        return FechaInicioE;
    }

    public void setFechaInicioE(String FechaInicioE) {
        this.FechaInicioE = FechaInicioE;
    }

    public String getFechaFinE() {
        return FechaFinE;
    }

    public void setFechaFinE(String FechaFinE) {
        this.FechaFinE = FechaFinE;
    }

    public String getFechaInicio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    }

   
    
    
   
    

    

