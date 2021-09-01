
package M1.Reto2V2;

public class Main {
    public static void main(String[] args) {
        
        CuentaAhorro ctaAhorro =
           new CuentaAhorro("123","A", 1000);
        
        System.
           out
          .println("Saldo actual" +ctaAhorro.getSaldo() );
        ctaAhorro.pagarIntereses(5);
        System.
           out
          .println("Nuevo Saldo " +ctaAhorro.getSaldo() );
        
        
        System.out.println("RETIRAR");
        System.
           out
          .println("Saldo actual" +ctaAhorro.getSaldo() );
        ctaAhorro.retirar(100);
        
         System.
           out
          .println("Nuevo Saldo " +ctaAhorro.getSaldo() );
         
         CuentaCorriente c = new CuentaCorriente("134","John",
         50000.0,7000.0);
         c.depositar(600000);
         c.cobrarCuotaManejo();
         c.retirar(150000);
          
         System.
           out
          .println("Nuevo Saldo " +c.getSaldo() );
         
    }
}
