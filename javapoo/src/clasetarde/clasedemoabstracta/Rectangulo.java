package clasetarde.clasedemoabstracta;

public class Rectangulo extends FiguraGeometrica{

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return this.base * this.altura;
    }
}
