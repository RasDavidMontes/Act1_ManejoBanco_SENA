/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author rasda
 */
public class CtaInversion extends Cuentas{
    
    private double montoInicial=25000.0;
    private double saldoMinimo=10000.0;
    private String idCuenta;
    private String nombreInversora;

    public CtaInversion( String nombreInversora, String idTitular, String fechaCuenta, String tipoCuenta) {
        super(idTitular, fechaCuenta, tipoCuenta);
        this.idCuenta = idTitular;
        this.nombreInversora = nombreInversora;
    }
    
    public String deposito( double deposito){
        String estadoDeposito= super.hacerDeposito(deposito);
        return estadoDeposito;
    }
    
    public String retiro( double retiro){
        String estadoRetiro = super.hacerRetiro( retiro);
        return estadoRetiro;
    }

    /**
     * @return the montoInicial
     */
    public double getMontoInicial() {
        return montoInicial;
    }

    /**
     * @param montoInicial the montoInicial to set
     */
    public void setMontoInicial(double montoInicial) {
        this.montoInicial = montoInicial;
    }

    /**
     * @return the saldoMinimo
     */
    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    /**
     * @param saldoMinimo the saldoMinimo to set
     */
    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    /**
     * @return the idCuenta
     */
    public String getIdCuenta() {
        return idCuenta;
    }

    /**
     * @param idCuenta the idCuenta to set
     */
    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    /**
     * @return the nombreInversora
     */
    public String getNombreInversora() {
        return nombreInversora;
    }

    /**
     * @param nombreInversora the nombreInversora to set
     */
    public void setNombreInversora(String nombreInversora) {
        this.nombreInversora = nombreInversora;
    }
    
}
