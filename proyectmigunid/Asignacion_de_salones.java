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
public class Asignacion_de_salones {
     
    private String id_usuario;
    private String id_salon;
    private String fecha_asignacion;
    private String hora_inicio;
    private String hora_fin;
    
    public Asignacion_de_salones () {
        id_usuario = "";
        id_salon = "";
        fecha_asignacion = "";
        hora_inicio = "";
        hora_fin = "";
        
    }
    
        public Asignacion_de_salones (String id_usuario, String id_salon, String fecha_asignacion, String hora_inicio, String hora_fin ) {
        this.id_usuario = id_usuario;
        this.id_salon = id_salon;
        this.fecha_asignacion = fecha_asignacion;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        }
        
        public void setid_usuario (String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setid_salon (String id_salon) {
        this.id_salon = id_salon;
    }

    public void setfecha_asignacion (String fecha_asignacion ) {
        this.fecha_asignacion = fecha_asignacion;
    }
    public void sethora_inicio (String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }
     public void sethora_fin (String hora_fin) {
        this.hora_fin = hora_fin;
     }
    
    
    public String getid_usuario () {
        return this.id_usuario;
    }
    public String getid_salon () {
        return this.id_salon;
    }
    public String getfecha_asignacion () {
        return this.fecha_asignacion;
    }
     public String gethora_inicio () {
        return this.hora_inicio;
    }
     public String gethora_fin () {
        return this.hora_fin;
    }
    
}
