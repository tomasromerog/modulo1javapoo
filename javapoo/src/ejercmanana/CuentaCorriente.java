package ejercmanana;

public class CuentaCorriente {

    private int numeroCuenta;
    private double saldo;

    public CuentaCorriente() {
    }

    public CuentaCorriente(int numeroCuenta, int cantidad, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingreso(double cantidad){
        if(cantidad > 0){
            this.saldo = saldo + cantidad;
        } else {
            throw new IllegalArgumentException("Debe ingresar un numero mayor a 0");
        }
    }

    public void egreso(double cantidad){
        if(cantidad > 0){
            this.saldo = saldo - cantidad;
        } else {
            throw new IllegalArgumentException("Debe ingresar un numero mayor a 0");
        }
    }

    public void transferencia(double cantidad, String tipoMovimiento){
        if(tipoMovimiento.equals("Ingreso")){
            this.ingreso(cantidad);
        } else {
            this.egreso(cantidad);
        }
    }

    public void Reintegro(double cantidad){
        this.ingreso(cantidad);
    }
}
