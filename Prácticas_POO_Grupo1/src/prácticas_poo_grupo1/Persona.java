/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prácticas_poo_grupo1;

import java.time.LocalDate;

    private String tipo_documento;
    private String nro_documento;

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
            + " NroDoc: " + this.nro_documento);
}
