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
public class usuario {
    String primernombre;
    String segundonombre;
    String apellido;
    String segundoapellido;
    String direccion;
    String telefono;
    String correoelectronico;
    String contraseya;
    String estadocivil;
    String fechadenacimiento;
    int edad;
    
   public usuario(){
        }
    
   public usuario(String primernombre, String segundonombre, String apellido, String segundoapellido, String direccion, String telefono, String correoelectronico, String contraseya, String estadocivil, String fechadenacimiento, int edad){
           this.primernombre = primernombre;
           this.segundonombre = segundonombre;
           this.apellido = apellido;
           this.segundoapellido = segundoapellido;
           this.direccion = direccion;
           this.telefono = telefono;
           this.correoelectronico = correoelectronico;
           this.contraseya = contraseya;
           this.estadocivil = estadocivil;
           this.fechadenacimiento = fechadenacimiento;
           this.edad = edad;
	}
   
        
        public String getNombre() {
            return primernombre;
        }
        
        public void setprimernombre() {
            this.primernombre = primernombre;
        }
        
        public int getEdad() {
            return edad;
        }
	
	public String getNumeroDeTelefono() {
		return telefono;
	}

	public void setNumeroDeTelefono(String telefono) {
		this.telefono = telefono;
        }
        
}
                
	


    
    
   

