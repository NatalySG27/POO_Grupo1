/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prácticas_poo_grupo1;

import java.time.LocalDate;

/**
 *
 * @author natal
 */
public class Persona {
    String tipo_documento;
    String nro_documento;
    String nombre;
    String paterno;
    String materno;
    LocalDate fecha_nacimiento;

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        if(tipo_documento.equalsIgnoreCase("DNI") || tipo_documento.equalsIgnoreCase("Carnet de Extranjeria")){
            this.tipo_documento = tipo_documento;
        }else{
            System.out.println("Tipo de documento no valido");
        }
    }

    public String getNro_documento() {
        return nro_documento;
    }

    public void setNro_documento(String nro_documento) {
        this.nro_documento = nro_documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
