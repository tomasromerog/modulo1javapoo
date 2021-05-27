package ejerciciotarde.ejercfigurageometrica;

public class Rectangulo extends FiguraGeometrica{
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        if(base == 0){
            throw new IllegalArgumentException("El radio no puede ser cero");
        } else {
            this.base = base;
        }
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if(altura == 0){
            throw new IllegalArgumentException("El radio no puede ser cero");
        } else {
            this.altura = altura;
        }
    }

    @Override
    public double area() {
        return (this.base * this.altura);
    }
}
