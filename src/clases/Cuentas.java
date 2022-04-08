/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author rasda
 */
public class Cuentas {
    
    private CtaAhorros objCtaAhorros;
    private CtaInversion objCtaInversion;
    
    private String idTitular;
    private double deposito;
    private double retiro;
    private double saldo;
    private String fechaCuenta;
    private String tipoCuenta;
    private String msj;

    public Cuentas(String idTitular, String fechaCuenta, String tipoCuenta) {
        this.idTitular = idTitular;
        this.retiro = 0;
        this.saldo = 0;
        this.fechaCuenta = fechaCuenta;
        this.tipoCuenta = tipoCuenta;
    }
    
    public String hacerDeposito(double deposito){
        setMsj("Saldo anterior: " + this.getSaldo());
        this.setSaldo(this.getSaldo() + deposito);
        setMsj(getMsj() + "\nEl nuevo saldo es: " + this.getSaldo());
        return getMsj();
    }
    
    public String hacerRetiro( double retiro){
        setMsj("Saldo anterior: " + this.getSaldo());
        this.setSaldo(this.getSaldo() - retiro);
        setMsj(getMsj() + "\nEl nuevo saldo es: " + this.getSaldo());
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
    
}
