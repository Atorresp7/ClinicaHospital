/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.clinicalhospital.model;

import com.mycompany.clinicalhospital.model.Persona;

/**
 *
 * @author Andres Felipe Torres Padilla
 */
public class Medico extends Persona{
    private String especialidad;
    private String tarjetaProfesional;

    public Medico() {
    }

    public Medico(String especialidad, String tarjetaProfesional, String nombre, int edad, String cedula) {
        super(nombre, edad, cedula);
        this.especialidad = especialidad;
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setTarjetaProfesional(String tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }
    
    public void atender(Consulta c){
        System.out.println(c.toString());
    }

    @Override
    public String toString() {
        return super.toString()+"\nEspecialidad: " + especialidad + "\nTarjeta Profesional: " + tarjetaProfesional + '}';
    }
               
}
