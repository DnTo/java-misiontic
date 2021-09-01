package M1.Reto2V2;

public class CuentaCorriente extends CuentaBanco {

    private double cuotaManejo;

    public CuentaCorriente(
            String numeroCuenta,
            String nombrePropietario,
            double saldo,
                double cuotaManejo
) {
        super(numeroCuenta, nombrePropietario, saldo);
        this.cuotaManejo = cuotaManejo;
    }

    public void cobrarCuotaManejo() {
        super.setSaldo(super.getSaldo() - cuotaManejo); 
    }
}
