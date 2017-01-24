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
public class Salones {
    
    private String id_salon;
    private String id_usuario;
    private String fecha_asignacion;
    
    public Salones () {
        id_salon = "";
        id_usuario = "";
        fecha_asignacion = "";
        
    }
    
        public Salones (String id_salones, String id_usuario, String fecha_asignacion) {
        this.id_salon = id_salon;
        this.id_usuario = id_usuario;
        this.fecha_asignacion = fecha_asignacion;
        }
        
        public void setid_salon (String id_salon) {
        this.id_salon = id_salon;
    }

    public void setid_usuario (String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setfecha_asignacion (String fecha_asignacion ) {
        this.fecha_asignacion = fecha_asignacion;
    }
    
    public String getid_salon () {
        return this.id_salon;
    }
    public String getid_usuario () {
        return this.id_usuario;
    }
    public String getfecha_asignacion () {
        return this.fecha_asignacion;
    }
    
}

   



