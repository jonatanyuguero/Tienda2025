/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.educastur.ogq69520.tienda2025;

/**
 *
 * @author alu30d
 */
public class MetodosAux {
     public static boolean validarDni(String dni) {
        // Verificar que el DNI tiene un formato válido
        if (dni.isBlank() || !dni.matches("\\d{8}[A-HJ-NP-TV-Z]")) {
            return false;
        }
        // Extraer el número y la letra del DNI
        String numeroStr = dni.substring(0, 8);
        char letra = dni.charAt(8);

        // Calcular la letra correspondiente al número del DNI
        char letraCalculada = calcularLetraDNI(Integer.parseInt(numeroStr));
        // Comparar la letra calculada con la letra proporcionada y devolver
        // el resultado de la comparación TRUE/FALSE
        return letra == letraCalculada; 
    }
    
    public static char calcularLetraDNI(int numero) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(numero % 23);
    }
    
    public static boolean esInt(String s){
        int n;
        try {
            n = Integer.parseInt(s);
            return true;
            
        } catch (NumberFormatException e) {
            return false;
            
        }
    }    
    
    public static boolean esDouble(String s){
        Double n;
        try {
            n = Double.parseDouble(s);
            return true;
            
        } catch (NumberFormatException e) {
            return false;
            
        }
    }
}
