/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author rasda
 */
public class CtaAhorros extends Cuentas{
    
    private int porcentajeAhorro;
    private double montoInicial=1000.0;
    private double saldoMinimo=500.0;
    private int porcentajeInteresesMes;

    public CtaAhorros(int porcentajeAhorro, int porcentajeInteresesMes, String idTitular, String fechaCuenta, String tipoCuenta) {
        super(idTitular, fechaCuenta, tipoCuenta);
        this.porcentajeAhorro = porcentajeAhorro;
        this.porcentajeInteresesMes = porcentajeInteresesMes;
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
     * @return the porcentajeAhorro
     */
    public int getPorcentajeAhorro() {
        return porcentajeAhorro;
    }

    /**
     * @param porcentajeAhorro the porcentajeAhorro to set
     */
    public void setPorcentajeAhorro(int porcentajeAhorro) {
        this.porcentajeAhorro = porcentajeAhorro;
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
     * @return the porcentajeInteresesMes
     */
    public int getPorcentajeInteresesMes() {
        return porcentajeInteresesMes;
    }

    /**
     * @param porcentajeInteresesMes the porcentajeInteresesMes to set
     */
    public void setPorcentajeInteresesMes(int porcentajeInteresesMes) {
        this.porcentajeInteresesMes = porcentajeInteresesMes;
    }
    
}
