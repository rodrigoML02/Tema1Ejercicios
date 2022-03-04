
package Ejercicios.ejercicios.ejercicio12;
import Ejercicios.ejercicios.utilidades.Utilidades;

/**
 *
 * 12. Escribe un programa que acepte una cadena de caracteres (que podrá contener
cualquier carácter a excepción del retorno de carro) y que diga cuántas vocales
contiene.
 */
public class Ejercicio12 {
    public static void main(String[] args){
       int NumeroDeVocales;
       String palabra=" ";
       System.out.println("Introduce una palabra: ");
       //leemos la palabra introducida por el usuario
       palabra=Utilidades.LeerFrase(palabra);
       //contamos el numero de vocales
       NumeroDeVocales=Utilidades.ContadorDeVocales(palabra);
       System.out.println("el numero de vocales es de: "+NumeroDeVocales);

    }
}



