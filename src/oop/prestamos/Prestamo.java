package oop.prestamos;

public class Prestamo {

    public Prestamo(float tasa, int plazo, float monto) {
        this.tasa = tasa;
        this.plazo = plazo;
        this.monto = monto;
    }

    public Prestamo(float tasa, float tasaMora, int plazo, float monto) {
        this.tasa = tasa;
        this.tasaMora = tasaMora;
        this.plazo = plazo;
        this.monto = monto;
    }

    /*
    Tasa
    Monto
    Plazo
    
    Persona,
    Entidad,
     */
    private float tasa;
    private float tasaMora;
    private int plazo;

   
    private float monto;

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public void setTasaMora(float tasaMora) {
        this.tasaMora = tasaMora;
    }

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }

    public float getTasa() {
        return this.tasa;
    }

    public float getTasaMora() {
        return this.tasa;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;

    }
    
     public int getPlazo() {
        return plazo;
    }
     
     
    public String TablaAmortizacion(){
        
        return "tabla de amortizaci'on";
    
    }
    
      public float ObtenerCuota(){
        
        return  100000;
    
    }

}
