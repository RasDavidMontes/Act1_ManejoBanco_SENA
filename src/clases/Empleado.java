/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rasda
 */
public class Empleado extends Persona{
    private String idEmpleado;
    private String Cargo;
    private String fechaContrato;
    private String Sueldo;
    private List<Cuentas> listCuentas= new ArrayList<>();

    public Empleado( String Cargo, String fechaContrato, String Sueldo, String nombre, String documento, String telefono, String direccion, String correo) {
        super(nombre, documento, telefono, direccion, correo);
        this.idEmpleado = documento;
        this.Cargo = Cargo;
        this.fechaContrato = fechaContrato;
        this.Sueldo = Sueldo;
    }

    /**
     * @return the idEmpleado
     */
    public String getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return the Cargo
     */
    public String getCargo() {
        return Cargo;
    }

    /**
     * @param Cargo the Cargo to set
     */
    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    /**
     * @return the fechaContrato
     */
    public String getFechaContrato() {
        return fechaContrato;
    }

    /**
     * @param fechaContrato the fechaContrato to set
     */
    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    /**
     * @return the Sueldo
     */
    public String getSueldo() {
        return Sueldo;
    }

    /**
     * @param Sueldo the Sueldo to set
     */
    public void setSueldo(String Sueldo) {
        this.Sueldo = Sueldo;
    }

    /**
     * @return the listCuentas
     */
    public List<Cuentas> getListCuentas() {
        return listCuentas;
    }

    /**
     * @param listCuentas the listCuentas to set
     */
    public void setListCuentas(List<Cuentas> listCuentas) {
        this.listCuentas = listCuentas;
    }
    
}
