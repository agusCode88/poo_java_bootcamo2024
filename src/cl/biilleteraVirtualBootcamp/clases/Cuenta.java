package cl.biilleteraVirtualBootcamp.clases;

import java.text.DecimalFormat;

public class Cuenta {
    /*
       1) Atributos de una clase
     */
    //Modificadores de Acceso
    private int numeroCuenta;
    private String titularCuenta;
    private double saldoCuenta;

    /*
       2) Constructor
     */

    public Cuenta(){}

        /*
        3) Métodos de Acceso
     */

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitularCuenta() {
        return titularCuenta;
    }

    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    /*
        4) Métodos de comportamiento
     */

    public void mostrarInformacionCuentaCorriente(){

        String formatoSaldo = formatearSaldo(saldoCuenta);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titularCuenta);
        System.out.println("Saldo: $ " + formatoSaldo);
    }

    // CrearCuenta
    // AgregarSaldo
    // RestarSaldo
    // MostrarInformacion
    // Ver Saldo
    // Conversor Moneda
    // Menu

    /*
        Opcional
        5) Métodos utilitarios o de lógica
     */
    private String formatearSaldo( double saldo) {
        DecimalFormat formatoSaldo = new DecimalFormat("#,###");
        return formatoSaldo.format(saldo);
    }
}
