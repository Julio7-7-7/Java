package tragaperras;
import java.util.Scanner;
public class TragaPerras {

    public static void main(String[] args) {
        
        Cinta cinta = new Cinta();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Tragaperras LoL");

        //3 oportunidades de girar
        for (int numGiros = 1; numGiros <= 3; numGiros++) {
            
            cinta.inicializarCinta();

            System.out.println("\nPresiona 'G' para girar la cinta (intentos " + numGiros + "/3)");
            String input = scanner.nextLine().toUpperCase();

            if (input.equals("G")) {
                cinta.imprimirCaracterSolitario();
                cinta.girarCinta();
                System.out.println("Caracteres: " + cinta.ultimos5Caracteres());

                if (cinta.haGanado()) {
                    System.out.println("¡Ganaste!");
                    break; // El juego termina cuando se gana
                }

                if (numGiros == 3) {
                    System.out.println("Se acabaron tus oportunidades. Suerte la próxima vez");
                }
            } else {
                System.out.println("Opción inválida. Intenta nuevamente.");
            }
        }
        scanner.close();
    }
}

    

