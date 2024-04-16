import java.util.Scanner;
public class Ejercicio1 {
    public static void main (String [] args){
    Scanner scanner = new Scanner (System.in);
    byte valor, descuento, total;
   System.out.println("Ingresa la cantidad\n");

   valor = scanner.nextByte();

   if(valor >=100){
    descuento =(byte) (valor-( valor * 0.10));
    System.out. println("Total a pagar es: "+ descuento);

   } else{
    System.out.println("El total a pagar es: "+ valor);
   }

    }

}
