/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.educastur.ogq69520.tienda2025;

/**
 *
 * @author alu30d
 */
public class StockAgotado extends Exception{
    public StockAgotado(String cadena){                                                                        
        super(cadena); //Llama al constructor de Exception y le pasa el contenido de cadena              
    }
}
