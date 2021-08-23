package reto1.v2;

public class SimCard {

    private String empresaTelefonia = "HI";
    private double saldo;
    private String numeroTelefono;
    private boolean celularApagado = true;
    private boolean modoAvionActivado;
    private boolean datosApagados;
    private int saldoDatos;

    public String getEmpresaTelefonia() {
        return empresaTelefonia;
    }

    public void setEmpresaTelefonia(String empresaTelefonia) {
        this.empresaTelefonia = empresaTelefonia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public boolean isCelularApagado() {
        return celularApagado;
    }

    public void setCelularApagado(boolean celularApagado) {
        this.celularApagado = celularApagado;
    }

    public boolean isModoAvionActivado() {
        return modoAvionActivado;
    }

    public void setModoAvionActivado(boolean modoAvionActivado) {
        this.modoAvionActivado = modoAvionActivado;
    }

    public boolean isDatosApagados() {
        return datosApagados;
    }

    public void setDatosApagados(boolean datosApagados) {
        this.datosApagados = datosApagados;
    }

    public int getSaldoDatos() {
        return saldoDatos;
    }

    public void setSaldoDatos(int saldoDatos) {
        this.saldoDatos = saldoDatos;
    }

    public SimCard(String numero) {
        this.numeroTelefono = numero;

    }

    /**
     * a. Si el cliente compra 10 GB o menos, se cobran a 3000 pesos cada GB. b.
     * Si el cliente compra entre 10 GB a 30 GB, las primeras 10GB se cobran a
     * 3000 pesos cada GB, y las demás a 2500 pesos cada una. c. Si el cliente
     * compra más de 30 GB, las primeras 20GB se cobran a 3000 pesos cada GB, y
     * las demás a 1500 pesos cada un
     *
     * @param c gigas a comprar
     */
    public void comprarDatos(int c) {
        if (c < 0) {
            return;
        }

        //calculo el costo
        int costo = 0;
        if (c < 11) {
            costo = c * 3000; //si es menor de 10 gb
        } //si esta entre 10 y 30
        else if (c < 31) {
            costo = 10 * 3000 + (c - 10) * 2500;
        } //si es mayor a 30
        else if (c > 30) {
            costo = 20 * 3000 + (c - 20) * 1500;
        }

        //me alcanza parahacer la compra?
        if (saldo <= costo) {
            saldoDatos += c;
            saldo -= costo;
        }
    }

    public void consumirDatos(int dc) {
        if (!(this.celularApagado || this.datosApagados)) {
            if (this.saldoDatos <= dc) {
                this.saldoDatos -= dc;
            }
        }

        if (saldoDatos < 0) {
            saldoDatos = 0;
        }

    }

    /**
     * El cobro de los datos se hará en la unidad de medida Segundos, y los
     * precios son los siguientes: a. Si la llamada dura 60 segundos o menos, se
     * cobra cada segundo a 1 peso. b. Si la llamada dura más de 60 segundos, se
     * cobran los primeros 60 segundos a 1 peso, y los demás a medio peso
     *
     * @param s
     */
    public void llamar(int s) {
        double costo = 0;
        if (s <= 60) {
            costo = s * 1;
        } else if (s > 60) {
            costo = 60 + (s - 60) * 0.5;
        }
    }

    public void recargarSaldo(double s) {
        if (s > 0) //no puedo recargar saldos negativos
        {
            this.saldo += s;
        }
    }

    /**
     * Enciende el celular si está apagado al invocar este método y viceversa.
     * Si se apaga el celular, los datos móviles y el modo avión deberán
     * apagarse. Si se enciende el celular, los datos móviles y el modo avión
     * permanecerán apagados, hasta que explícitamente se enciendan.
     *
     */
    public void gestionarEncendidoCelular() {
        //lo enciendo
        if (this.celularApagado) {
            this.celularApagado = false;
            this.datosApagados = true;
            this.modoAvionActivado = false;
        } else {
            this.celularApagado = true;
            this.datosApagados = true;
            this.modoAvionActivado = false;

        }
    }

    public void gestionarModoAvion() {
        modoAvionActivado = !celularApagado && modoAvionActivado;
    }

    public void gestionarDatos() {
        
    }

}
