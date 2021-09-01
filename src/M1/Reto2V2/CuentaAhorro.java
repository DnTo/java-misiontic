package M1.Reto2V2;

public class CuentaAhorro extends CuentaBanco {

    public double getIEA() {
        return 0.0;
    }

    public void pagarIntereses(int dias) {
        
        if(dias<=0) return; // si no se cumple esta
        //condicion retornoe, me salgo del metodo
        
        /*El número de días sobre los que 
        se va a calcular el interés debe de ser
        mayor o igual a 1.*/

        //tenemos un interes anual
        //y que al dividirlo obtenemos el diario
        /* saldo 100.000 
        interes diario = 
        100.000 x (1 +( 0.01)/365) = 2.73
         */
        
        //estas variables son 
        //especificas del metodo tasa y nuevaSaldo
        double tasa = 0.0;
        if (getSaldo() < 1000000) {
            tasa = 0.01;
        } else if (getSaldo() < 2000000) {
            tasa = 0.0175;
        } else if (getSaldo() >= 2000000) {
            tasa = 0.023;
        }
        
        double tasaDias = tasa/365 * dias;
        //aca se ve la formula
        double nuevaSaldo =  getSaldo()* (1 + tasaDias);
        
        //establecer el nuevo saldo
        setSaldo(nuevaSaldo);
    }

    public CuentaAhorro(String numeroCuenta, String nombrePropietario, double saldo) {
        super(numeroCuenta, nombrePropietario, saldo);
    }
}
