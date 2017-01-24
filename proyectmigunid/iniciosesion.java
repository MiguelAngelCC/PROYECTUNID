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
public class iniciosesion {
    
  
    private String id_usuario;
    private String contraseya;
    private String nombre_usuario;
    
    public iniciosesion () {
        id_usuario = "";
        contraseya = "";
        nombre_usuario = "";
        
    }
        public iniciosesion (String id_usuario, String contraseya, String nombre_usuario) {
        this.id_usuario = id_usuario;
        this.contraseya = contraseya;
        this.nombre_usuario = nombre_usuario;
        
        }
        
        public void setid_usuario (String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setcontraseya (String contraseya) {
        this.contraseya = contraseya;
    }

    public void setnombre_usuario (String nombre_usuario ) {
        this.nombre_usuario = nombre_usuario;
    }
    
    public String getid_usuario () {
        return this.id_usuario;
    }
    public String getcontraseya () {
        return this.contraseya;
    }
    public String getnombre_usuario () {
        return this.nombre_usuario;
    }
    
}
    

