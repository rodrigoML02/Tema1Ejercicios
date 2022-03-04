
package Ejercicios.ejercicios.ejercicio14;
import Ejercicios.ejercicios.utilidades.Utilidades;

/**
 *
 * 14. Escribe un programa que lee una cadena de caracteres de teclado e indique si
es o no palíndroma (se lee igual de izquierda a derecha que de derecha a
izquierda, sin tener en cuenta los espacios en blanco y las mayúsculas). Por
ejemplo: "dabale arroz a la zorra el abad".
 */
public class Ejercicio14 {
    public static void main (String[] args){
        String lectura=" ";
        boolean EsUnPalindromo;
        //leemos la palabra introducida por el usuario
        System.out.println("Introduce la palabra que quieras saber si es un palindromo ");
        lectura=Utilidades.LeerFrase(lectura);
        //detectamos si es un palindromo o no
        EsUnPalindromo=Utilidades.DetectorDePalindromos(lectura);
        if(EsUnPalindromo==true){
            System.out.println("Es un palindromo");
        }
        else{
           System.out.println("No es un palindromo"); 
        }
    }
}
   
