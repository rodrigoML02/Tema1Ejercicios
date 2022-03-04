package Ejercicios.ejercicios.ejercicio5;

/**
 *5. Escribe un programa que visualice por pantalla la tabla de multiplicar de los
10 primeros números naturales.
 */
public class Ejercicio5 {
   public static void main (String[] args){
       for (int i=1;i<=10;i++){
           System.out.println("TABLA DEL "+i);
           for(int j=0;j<=10;j++){
               System.out.println("|"+i+"*"+j+"="+j*i+"|");
           }
       }
       
   }
    
}
