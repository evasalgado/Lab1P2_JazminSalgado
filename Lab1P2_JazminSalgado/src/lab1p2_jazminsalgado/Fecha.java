/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1p2_jazminsalgado;

import java.util.Date;

/**
 *
 * @author evaja
 */
public class Fecha {
    int indice;
    Date fecha;

    public Fecha(int indice, Date fecha) {
        this.indice = indice;
        this.fecha = fecha;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Iteracion 1: "+indice + ":" + fecha + "\n";
    }
    
    
}
