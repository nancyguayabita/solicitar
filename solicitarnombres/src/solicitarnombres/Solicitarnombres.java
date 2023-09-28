package solicitarnombres;
import java.util.Scanner;
public class Solicitarnombres 
{

    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre + "bienvenido.");
    }
    
}
