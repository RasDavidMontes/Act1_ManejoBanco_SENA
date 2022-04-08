/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author rasda
 */
public class Persona {
    
    Cliente objCliente;
    Empleado objEmpleado;
    
    //private String tipoRegistro="";
    private String nombre="";
    private String documento="";
    private String telefono="";
    private String direccion="";
    private String correo="";
    //private String tipoCuenta="";

    
    public Persona(String nombre,String documento,String telefono,String direccion,String correo) {
        this.nombre=nombre;
        this.documento=documento;
        this.telefono=telefono;
        this.direccion=direccion;
        this.correo=correo;        
    }

    void actualizarPersona(String nombre,String documento,String telefono,String direccion,String correo){        
        this.nombre=nombre;
        this.documento=documento;
        this.telefono=telefono;
        this.direccion=direccion;
        this.correo=correo;
    }
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }


}
