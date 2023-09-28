package cincopreciostotal;
import java.util.Scanner;
public class Cincopreciostotal 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner (System.in);
        float n1,n2,n3,n4,n5,denny;
        System.out.print("ingresa el primer numero: ");
        n1=leer.nextFloat();
        System.out.print("ingresa el segundo numero: ");
        n2=leer.nextFloat();
        System.out.print("ingresa el tercero numero: ");
        n3=leer.nextFloat();
        System.out.print("ingresa el cuarto numero: ");
        n4=leer.nextFloat();
        System.out.print("ingresa el quinto numero: ");
        n5=leer.nextFloat();
        denny=(n1+n2+n3+n4+n5);
        System.out.println("el resultado de la suma es: " + denny);
    }
    
}
