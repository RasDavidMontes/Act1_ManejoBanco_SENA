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
    
    List<Persona> listClientesCasaInv;
    List<String> listNivelesRiesgo;
    List<String> listMontos;
    List<String> listPlazos;
    int porcentajeRetorno;

    public CasaInversora( List<String> listNivelesRiesgo, List<String> listMontos, 
            List<String> listPlazos, int porcentajeRetorno, 
            String nombre, String documento, String telefono, String direccion, String correo
        ) {
        super(nombre, documento, telefono, direccion, correo);
        this.listNivelesRiesgo = listNivelesRiesgo;
        this.listMontos = listMontos;
        this.listPlazos = listPlazos;
        this.porcentajeRetorno = porcentajeRetorno;        
    }
    
    public void addCliente(Cliente cli){
        this.listClientesCasaInv.add(cli);
    }
    
    public List getListaclientes(){
        return this.listClientesCasaInv;
    }
    
    public void setListaclientes(List listaCli){
        this.listClientesCasaInv= listaCli;
    }
    
}
