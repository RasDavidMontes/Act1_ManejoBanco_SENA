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
public class Cliente extends Persona{
    
    private String idCliente;
    private String fechaCliente;
    private Boolean isInversionista;
    private List<Cuentas> listCuentas= new ArrayList<>();

    public Cliente( String fechaCliente, String nombre, String documento, String telefono, String direccion, String correo) {
        super(nombre, documento, telefono, direccion, correo);
        this.idCliente = documento;
        this.fechaCliente = fechaCliente;
        this.isInversionista = isInversionista;
    }

    /**
     * @return the idCliente
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the fechaCliente
     */
    public String getFechaCliente() {
        return fechaCliente;
    }

    /**
     * @param fechaCliente the fechaCliente to set
     */
    public void setFechaCliente(String fechaCliente) {
        this.fechaCliente = fechaCliente;
    }

    /**
     * @return the isInversionista
     */
    public Boolean getIsInversionista() {
        return isInversionista;
    }

    /**
     * @param isInversionista the isInversionista to set
     */
    public void setIsInversionista(Boolean isInversionista) {
        this.isInversionista = isInversionista;
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
