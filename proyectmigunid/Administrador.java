/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectmigunid;

/**
 *
 * @author miguelangel
 */
public class Administrador {
    private String nombre;
    private String contraseya;
    
    public Administrador () {
       nombre = "";
        contraseya = "";
        
    }
    
        public Administrador (String nombre, String contraseya) {
        this.nombre = nombre;
        this.contraseya = contraseya;
        }
        
        public void setnombre (String nombre) {
        this.nombre = nombre;
    }

    public void setcontraseya (String contraseya) {
        this.contraseya = contraseya;
    }
    public String getnombre () {
        return this.nombre;
    }
    public String getcontraseya () {
        return this.contraseya;
    }
    
}