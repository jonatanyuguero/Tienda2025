/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.educastur.ogq69520.tienda2025;

/**
 *
 * @author alu30d
 */
public class Utilidades{    

    public static String[] rompeFraseConDelimitador(String frase, char delimitador){
       
        String[] palabras=new String[cuentaPalabrasConDelimitador(frase,delimitador)];   
        
        int inicioPalabra=0;
        int posPalabras=0;
        for (int i=0;i<frase.length();i++){
           if (frase.charAt(i)==delimitador){
               palabras[posPalabras]=frase.substring(inicioPalabra,i);
               inicioPalabra=i+1;
               posPalabras++;
           }
           if (i==frase.length()-1){
               palabras[posPalabras]=frase.substring(inicioPalabra,i+1);
           }
        }
        return palabras;
    }
    
    public static String[] rompeFraseAlRevesConDelimitador(String frase, char delimitador){
       
        String[] palabras=new String[cuentaPalabrasConDelimitador(frase,delimitador)];
        int posPalabras=0;
        int finPalabra=frase.length();
        for (int i=frase.length()-1;i>=0;i--){
           if (frase.charAt(i)==delimitador){
               palabras[posPalabras]=frase.substring(i+1,finPalabra);
               finPalabra=i;
               posPalabras++;
           }
           if (i==0){
               palabras[posPalabras]=frase.substring(i,finPalabra);
           }
        }
        return palabras;
    }
    
    public static int cuentaPalabrasConDelimitador (String s, char delimitador){
        int c=0;
        for (int i=0;i<s.length();i++){
           if (s.charAt(i)==delimitador){
               c++;
           }
        }
        c++;
        return c;
    }
    
    public static int buscaEnArray (int[] a, int valor)
    { 
        int pos=-1;
        for (int i = 0; i < a.length; i++) {
           if (a[i]==valor) {
              pos=i;
              break;
           }
        }
        return pos;
    }

    public static int buscaEnArray (String[] a, String valor)
    { 
        int pos=-1;
        for (int i = 0; i < a.length; i++) {
           if (a[i].equalsIgnoreCase(valor)) {
              pos=i;
              break;
           }
        }
        return pos;
    }


}