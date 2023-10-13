/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1p2_jazminsalgado;

import java.util.ArrayList;

/**
 *
 * @author evaja
 */
public class dominio {
    String dominio;
    ArrayList<usuario> correo;

    public dominio(String dominio, ArrayList<usuario> correo) {
        this.dominio = dominio;
        this.correo = correo;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public ArrayList<usuario> getCorreo() {
        return correo;
    }

    public void setCorreo(ArrayList<usuario> correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "dominio{" + "dominio=" + dominio + ", correo=" + correo + '}';
    }

    
}
