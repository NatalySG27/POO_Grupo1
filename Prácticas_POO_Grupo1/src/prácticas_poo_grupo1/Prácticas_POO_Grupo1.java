
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
}
