/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import GUI.BancoGUI;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rasda
 */
public class Cuentas {
    
    private BancoGUI objBancoGUI;
    private CtaAhorros objCtaAhorros;
    private CtaInversion objCtaInversion;
    private CasaInversora objCasainversora;
    private List<CasaInversora> listCasasInversoras= new ArrayList<>();

    String nombre;
    String cargo;
    String documento;
    String telefono;
    String direccion;
    String correo;

    private String idTitular;
    private double deposito;
    private double retiro;
    private double saldo;
    private String fechaCuenta;
    private String tipoCuenta;
    private String msj;
    private String nombreCasaInversora;
    private Integer numCasa=0;
    
    List<Persona> listClientesCasaInv;
    List<String> listNivelesRiesgo= new ArrayList<>();
    List<String> listMontos= new ArrayList<>();
    List<String> listPlazos= new ArrayList<>();
    int porcentajeRetorno;
    private Cuentas objCuentas;
    private String tipoRegistro="";
    

    public Cuentas(String idTitular, String fechaCuenta, String tipoCuenta) {
        this.idTitular = idTitular;
        this.retiro = 0;
        this.saldo = 0;
        this.fechaCuenta = fechaCuenta;
        this.tipoCuenta = tipoCuenta;
        if(this.tipoCuenta.equalsIgnoreCase("Inversión") && this.listCasasInversoras.size()==0  && !tipoRegistro.equalsIgnoreCase("Casa Inversora")){
            crearCasaInversoraAuto();
            //ññ
            nombreCasaInversora= this.listCasasInversoras.get(numCasa-1).getNombre();
            msj="La casa inversionista asignada es :" + nombreCasaInversora;
            JOptionPane.showMessageDialog(null, msj);
        }
    }
    
    private CasaInversora crearCasaInversora( List<String> listNivelesRiesgo, List<String>listMontos, List<String>listPlazos, 
                int porcentajeRetorno, String nombre, String documento, String telefono, String direccion,String correo
        ){
        objCasainversora= new CasaInversora(listNivelesRiesgo, listMontos, listPlazos, 
                porcentajeRetorno, nombre, documento, telefono, direccion, correo);
        listCasasInversoras.add(objCasainversora);
        return objCasainversora;
    }
    
    private CasaInversora crearCasaInversoraAuto(){
        listNivelesRiesgo.add("Riesgo medio");
        listNivelesRiesgo.add("Riesgo bajo");
        listMontos.add("Todos los montos.");
        listPlazos.add("12 meses.");
        listPlazos.add("24 meses.");
        listPlazos.add("36 meses.");
        listPlazos.add("48 meses.");
        porcentajeRetorno=8;
        nombre="Inversionistas asociados";
        documento="80808080";
        telefono="8080";
        direccion="calle 23";
        correo="invAsociado@mail.com";
        objCasainversora= new CasaInversora(listNivelesRiesgo, listMontos, listPlazos, 
                porcentajeRetorno, nombre, documento, telefono, direccion, correo);
        this.listCasasInversoras.add(objCasainversora);
        numCasa=this.listCasasInversoras.size();
        //objBancoGUI.addCasaInversionista(objCasainversora);
        return objCasainversora;
    }
    
    public String hacerDeposito(double deposito, Cuentas cuenta){
        this.objCuentas=cuenta;
        setMsj("Saldo anterior: " + this.objCuentas.getSaldo());
        this.objCuentas.setSaldo(this.objCuentas.getSaldo() + deposito);
        setMsj(getMsj() + "\nEl nuevo saldo es: " + this.objCuentas.getSaldo());
        return getMsj();
    }
    
    public String hacerRetiro( double retiro, Cuentas cuenta){
        this.objCuentas=cuenta;
        setMsj("Saldo anterior: " + this.objCuentas.getSaldo());
        if(this.objCuentas.getSaldo() >= retiro){
            if(this.objCuentas.getTipoCuenta().equalsIgnoreCase("Ahorros")){
                if(this.objCuentas.getSaldo() - retiro >= 500){
                    this.objCuentas.setSaldo(this.objCuentas.getSaldo() - retiro);
                    setMsj(getMsj() + "\nEl nuevo saldo es: " + this.objCuentas.getSaldo());
                }else{
                    System.out.println("Para realizar el retiro,\nel saldo restante debe ser\nmayor o igal a 500$.");
                }
            }
            if(this.getTipoCuenta().equalsIgnoreCase("Inversión")){
                if(this.objCuentas.getSaldo() - retiro >= 10000){
                    this.objCuentas.setSaldo(this.objCuentas.getSaldo() - retiro);
                    setMsj(getMsj() + "\nEl nuevo saldo es: " + this.objCuentas.getSaldo());
                }else{
                    System.out.println("Para realizar el retiro,\nel saldo restante debe ser\nmayor o igal a 10.000$.");
                }
            }
                
        }else{
            setMsj(getMsj() + "\nEl saldo: " + this.objCuentas.getSaldo()+ ", es insuficiente para retirar: "+ retiro);
        }
        return getMsj();
    }

    /**
     * @return the objCtaAhorros
     */
    public CtaAhorros getObjCtaAhorros() {
        return objCtaAhorros;
    }

    /**
     * @param objCtaAhorros the objCtaAhorros to set
     */
    public void setObjCtaAhorros(CtaAhorros objCtaAhorros) {
        this.objCtaAhorros = objCtaAhorros;
    }

    /**
     * @return the objCtaInversion
     */
    public CtaInversion getObjCtaInversion() {
        return objCtaInversion;
    }

    /**
     * @param objCtaInversion the objCtaInversion to set
     */
    public void setObjCtaInversion(CtaInversion objCtaInversion) {
        this.objCtaInversion = objCtaInversion;
    }

    /**
     * @return the idTitular
     */
    public String getIdTitular() {
        return idTitular;
    }

    /**
     * @param idTitular the idTitular to set
     */
    public void setIdTitular(String idTitular) {
        this.idTitular = idTitular;
    }

    /**
     * @return the deposito
     */
    public double getDeposito() {
        return deposito;
    }

    /**
     * @param deposito the deposito to set
     */
    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    /**
     * @return the retiro
     */
    public double getRetiro() {
        return retiro;
    }

    /**
     * @param retiro the retiro to set
     */
    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the fechaCuenta
     */
    public String getFechaCuenta() {
        return fechaCuenta;
    }

    /**
     * @param fechaCuenta the fechaCuenta to set
     */
    public void setFechaCuenta(String fechaCuenta) {
        this.fechaCuenta = fechaCuenta;
    }

    /**
     * @return the tipoCuenta
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * @param tipoCuenta the tipoCuenta to set
     */
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    /**
     * @return the msj
     */
    public String getMsj() {
        return msj;
    }

    /**
     * @param msj the msj to set
     */
    public void setMsj(String msj) {
        this.msj = msj;
    }

    /**
     * @return the tipoRegistro
     */
    public String getTipoRegistro() {
        return tipoRegistro;
    }

    /**
     * @param tipoRegistro the tipoRegistro to set
     */
    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    
}



            //crearCasaInversora(listNivelesRiesgo, listMontos, listPlazos, 0, nombre, documento, telefono, direccion, correo);
            /*msj="\nListado Casas Inversoras:";
            if(listCasasInversoras.size()>0){
                for (int i=0; i<listCasasInversoras.size(); i++) {
                    String nombreCasaInv = this.listCasasInversoras.get(i).getNombre();
                    msj+= "\n"+ i+ "- "+ nombreCasaInv;
                }
                msj+= "\n\nIngrese el número de la casa seleccionada: ";
                String in = JOptionPane.showInputDialog(null, msj);
                numCasa= Integer.valueOf(in);
            }else{
                msj+= "\n\nAún no se han creado casa inversionistas."
                        + "\nPara asignar debe existir por lo menos una casa."
                        + "\nDesea crear una predefinida ahora? - S/N -";
                String in = JOptionPane.showInputDialog(null, msj);
                if(in.equalsIgnoreCase("S")){
                    crearCasaInv();
                    msj+= "\n\nLa casa inversionista creada fué asignada.";
                    JOptionPane.showMessageDialog(null, msj);
                }
            }*/