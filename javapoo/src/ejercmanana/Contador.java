package ejercmanana;

public class Contador {
    private int total;

    public Contador() {
    }

    public Contador(int total) {
        this.total = total;
    }

    public Contador(Contador contador) {
        this.setTotal(contador.getTotal());
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void incremento(int numero) {
        this.setTotal(this.getTotal() + numero);
    }

    public void decremento(int numero) {
        this.setTotal(this.getTotal() - numero);
    }
}
