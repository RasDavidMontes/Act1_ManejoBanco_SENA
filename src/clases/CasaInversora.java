/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.List;

/**
 *
 * @author rasda
 */
public class CasaInversora extends Persona{
    
    List<Cliente> listClientesCasaInv;
    List<Cliente> listNivelesRiesgo;
    List<Cliente> listMontos;
    List<Cliente> listPlazos;
    int porcentajeRetorno;

    public CasaInversora(List<Cliente> listClientesCasaInv, List<Cliente> listNivelesRiesgo, List<Cliente> listMontos, List<Cliente> listPlazos, int porcentajeRetorno, String nombre, String documento, String telefono, String direccion, String correo) {
        super(nombre, documento, telefono, direccion, correo);
        this.listClientesCasaInv = listClientesCasaInv;
        this.listNivelesRiesgo = listNivelesRiesgo;
        this.listMontos = listMontos;
        this.listPlazos = listPlazos;
        this.porcentajeRetorno = porcentajeRetorno;
    }
    
}
