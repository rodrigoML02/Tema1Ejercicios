/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ejercicios.utilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rodri
 */
public class Utilidades {
      
    public static boolean DetectorDePrimos (int numero) {
        int CantidadDeDivisores=0;
        boolean detector;
        //recorremos todos los numero menores e iguales que el dado y vemos los restos
        // como un primo solo es divisible por si mismo y 1 el contador tendra que ser ==2
        //para que el numero sea primo
        for(int i=1;i<=numero;i++){
            if(numero%i==0){
                CantidadDeDivisores++;
            }
        }
        detector=(CantidadDeDivisores==2);
        return detector;
        //se podria poner i=2 y  cambiar la condicion a contador==1;
    }
        public static String LeerFrase (String palabra) {
        System.out.println(palabra);
        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
        String name;
        try {
            name = consola.readLine();
        } catch (IOException ex) {
            name = " ";
        }
        //

        return name;

    }
        public static int ContadorDeVocales (String palabra){
            int numDeVocales=0;
            int j=0;
            //** convierte las mayusculas en minusculas**// 
            String PEnMinuscula=palabra.toLowerCase();
            char a='a';
            char e='e';
            char i='i';
            char o='o';
            char u='u';
            char character;
            //**el bucle recorre las posiciones de la palabra devolviendo cada uno de los
            //**caracteres y comparandolos con las vocales**//
            for(j=0;j<palabra.length();j++){
                character=PEnMinuscula.charAt(j);  
                if (character==a | character==e | character==i | character==o | character==u ){
                    numDeVocales++;                    
                }
            }
            return numDeVocales;
        }
        public static void EscribeAlreves (String palabra){
            //al igual que en el bucle anterior este recorre los caracteres de la palabra 1 a 1 pero en sentido contrario.//
            for (int i=palabra.length()-1;i>=0;i--){
                System.out.print(palabra.charAt(i));
            }
            System.out.print("\n");
        }
        public static boolean DetectorDePalindromos(String lectura){
            boolean verdad;
            int contador=0;
            String palabra;
            //quitamos los espacios y las mayusculas//
            palabra=lectura.replace(" ","");
            palabra=palabra.toLowerCase();
            int i=0;
            int j=palabra.length()-1;
            char char1;
            char char2;
            
            while (i<palabra.length() & j>=0){
                //recorremos la palabra en ambos sentidos y vamos comparando letra a letra//
                char1=palabra.charAt(i);
                char2=palabra.charAt(j);
                
                if(char1==char2){
                   contador ++;
                   i++;
                   j--;
                }
                else{
                    i++;
                    j--;
                }
                
            }
            //sera palindromo cuando el numero de letras iguales sea igual al numero de letras
            //es decir uando todas las letras sean iguales
            verdad=(contador==palabra.length());
            return verdad;   
        }
}
      
        
        
    