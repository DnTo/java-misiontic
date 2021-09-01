package M1.Reto2V2;

public class CuentaBanco {

    //<editor-fold defaultstate="collapsed" desc="g&s">
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    public String getNombrePropietario() {
        return nombrePropietario;
    }
    
    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
//</editor-fold>
    private String numeroCuenta;
    private String nombrePropietario;
    private double saldo;

    public void depositar(double valor) {
        
        saldo = saldo + valor;

    }

    public CuentaBanco(String numeroCuenta, String nombrePropietario, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombrePropietario = nombrePropietario;
        this.saldo = saldo;
    }

    /**
     * Por cada retiro el banco cobra el 5% del valor a retirar (comisión).
     *
     * @param valorRetiro valor que solicito retirar
     */
    public void retirar(double valorRetiro) {

        double comision = valorRetiro * 0.05;
        double valorARetirar = valorRetiro + comision;
        if (valorARetirar < saldo) {
            saldo = saldo - valorARetirar;
        }
    }
}
