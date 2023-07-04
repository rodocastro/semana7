package BusinessLogic; 

import java.util.Scanner; 

import Common.Cliente; 

public class Menu {


    public Menu(){
        MostraOpciones(); 

    }

    public void MostrarOpciones() {

        Scanner scanner = new Scanner (System.in); 

        int opcion = 0; 

        do {
            System.out.println("---Menu---");
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Para Salir");
            System.out.println("4. Elige una opcion "); 

            opcion = scanner.nextint(); 

            switch (opcion) {
                case 1:
                System.out.println("Ha seleccionado opcion 1");
                    
                    break;
                case 2:
                System.out.println("Ha seleccionado opcion 2");
                    
                    break;
                case 3:
                System.out.println("Ha seleccionado opcion 3");
                    
                    break;
                case 4:
                System.out.println("Saliendo del programa");
                    
                    break;
            
                default:
                System.out.println("Opcion invalida / Intente de nuevo");
                    break;
            }
            System.out.println();


        } while (opcion !=4);
        scanner.close(); 
        }
}