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
public class tipo_usuario {
    
    private String id_usuario_autonumerico;
    private String contraseya;
    private String descripcion;
    
    public tipo_usuario () {
        id_usuario_autonumerico = "";
        contraseya = "";
        descripcion = "";
    }
    
    public tipo_usuario (String id_usuario_autonumerico, String contraseya, String descripcion ) {
    this.id_usuario_autonumerico = id_usuario_autonumerico;
    this.contraseya = contraseya;
    this.descripcion = descripcion;
    }
     
     public void setid_usuario_autonumerico (String id_usuario_autonumerico) {
        this.id_usuario_autonumerico = id_usuario_autonumerico;
        
    public void setcontraseya (String contraseya) { 
        this.contraseya = contraseya;
    }
    public void setdescripcion (String descripcion) {
        this.descripcion = descripcion;   
    } 
    public String getid_usuario_autonumerico () {
    return id_usuario_autonumerico;
    }
    public String getcontraseya (){
    return contraseya;
    }
     public String getdescripcion (){
    return descripcion;
     }
      public String toString () {
        return super.toString() + "\nRepresenta a la Provincia de " + getProvinciaQueRepresenta() + " para el " + getPartidoPolitico() + "\nSu número de despacho es " + getNumeroDespacho(); 
    }
    
    abstract public void getCamaraEnQueTrabaja();
    
}

