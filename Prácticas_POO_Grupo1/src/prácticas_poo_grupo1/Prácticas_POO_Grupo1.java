
package prácticas_poo_grupo1;

import java.util.Scanner;

public class Prácticas_POO_Grupo1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        PersonaController controla = new PersonaController();
        String rpta = "si";
        
        System.out.println("=== SISTEMA DE REGISTRO DE PERSONAS ===");
        
        while(rpta.equalsIgnoreCase("si")) {
            System.out.println("¿Desea ingresar otra persona? (si/no):");
            rpta = sc.nextLine();
        }
        sc.close();
    }
    
    public static void registrarPersona(Scanner sc, PersonaController controla) {
        Persona p1 = new Persona();
        System.out.println("Ingrese nro de documento: ");
        p1.setNro_documento(sc.nextLine());
        
        System.out.println("Ingrese nombre: ");
        p1.setNombre(sc.nextLine());
        
        System.out.println("Ingrese apellido paterno: ");
        p1.setPaterno(sc.nextLine());
        
        System.out.println("Ingrese apellido materno: ");
        p1.setMaterno(sc.nextLine());
    }
}
