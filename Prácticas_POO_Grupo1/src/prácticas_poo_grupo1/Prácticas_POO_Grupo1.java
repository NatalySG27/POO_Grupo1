
package prácticas_poo_grupo1;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Prácticas_POO_Grupo1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        PersonaController controla = new PersonaController();
        String rpta = "si";
        
        System.out.println("=== SISTEMA DE REGISTRO DE PERSONAS ===");
        
        while(rpta.equalsIgnoreCase("si")) {
            registrarPersona(sc, controla);
            System.out.println("¿Desea ingresar otra persona? (si/no):");
            rpta = sc.nextLine();
        }
        mostrarListado(controla);
        realizarBusqueda(sc, controla);
        
        sc.close();
    }
    
    public static void registrarPersona(Scanner sc, PersonaController controla) {
        Persona p1 = new Persona();
        
        while(p1.getTipo_documento() == null){
            System.out.println("Ingrese tipo de documento (DNI / Carnet de Extranjeria): ");
            p1.setTipo_documento(sc.nextLine());
        }
        
        while(p1.getNro_documento() == null){
            System.out.println("Ingrese nro de documento: ");
            p1.setNro_documento(sc.nextLine());
        }
        
        System.out.println("Ingrese nombre: ");
        p1.setNombre(sc.nextLine());
        
        System.out.println("Ingrese apellido paterno: ");
        p1.setPaterno(sc.nextLine());
        
        System.out.println("Ingrese apellido materno: ");
        p1.setMaterno(sc.nextLine());
        
        boolean fechaValida = false;
        while(!fechaValida){
            try {
                System.out.println("Ingrese fecha de nacimiento (Formato AAAA-MM-DD): ");
                p1.setFecha_nacimiento(LocalDate.parse(sc.nextLine()));
                fechaValida = true;
            } catch(DateTimeParseException e){
                System.out.println("ERROR: Formato de fecha no valido. Use el formato AAAA-MM-DD.");
            }
        }
        controla.agregarPersona(p1);
    }
    
    public static void mostrarListado(PersonaController controla) {
        System.out.println("\n----------------------------------------");
        controla.listarPersonas();
    }
    
    public static void realizarBusqueda(Scanner sc, PersonaController controla) {
        System.out.println("\n----------------------------------------");
        try {
            System.out.println("Ingrese el numero de documento que desea buscar: ");
            controla.buscarPersona(sc.nextLine());
        } catch(Exception e){
            System.out.println("ERROR: Ocurrio un problema en la busqueda.");
        }
    }
}
