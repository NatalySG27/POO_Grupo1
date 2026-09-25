/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prácticas_poo_grupo1;

import java.time.LocalDate;

    private String tipo_documento;
    private String nro_documento;
    private String nombre;
    private String paterno;
    private String materno;
    private String fecha_nacimiento;

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
}
public void verDatos() { 
    System.out.println("Persona TipoDoc: " + this.tipo_documento
            + " NroDoc: " + this.nro_documento
            + " Nombre: " + this.nombre 
            + " Apellido paterno: " + this.paterno 
            + " Apellido materno: " + this.materno
            + " Fecha de nacimiento: " + this.fecha_nacimiento);
}
