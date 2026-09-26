/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prácticas_poo_grupo1;

import java.util.ArrayList;

public class PersonaController {
    
    ArrayList<Persona> lista = new ArrayList<>();

    public void agregarPersona(Persona nuevapersona) {
        lista.add(nuevapersona);
    }
    public void listarPersonas() {
        System.out.println("La lista de personas es: ");
        for(int i = 0; i < lista.size(); i++){
            Persona aux = lista.get(i);
            aux.verDatos();
        }
    }
}
