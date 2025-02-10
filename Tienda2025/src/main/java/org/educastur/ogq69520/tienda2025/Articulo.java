/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.educastur.ogq69520.tienda2025;

import java.io.Serializable;

/**
 *
 * @author alu30d
 */
public class Articulo implements Serializable, Comparable<Articulo> {
     private String idArticulo;
    private String descripcion;
    private int existencias;
    private double pvp;

    public Articulo(String idArticulo, String descripcion, int existencias, double pvp) {
        this.idArticulo = idArticulo;
        this.descripcion = descripcion;
        this.existencias = existencias;
        this.pvp = pvp;
    }

    public String getIdArticulo() {
        return idArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getExistencias() {
        return existencias;
    }

    public double getPvp() {
        return pvp;
    }
    

    public void setIdArticulo(String idArticulo) {
        this.idArticulo = idArticulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    @Override
    public int compareTo(Articulo a) {
        //return Double.compare(this.pvp, a.getPvp());
        //return Integer.compare(this.existencias, a.getExistencias());
        return this.idArticulo.compareTo(a.getIdArticulo());
    }
}
