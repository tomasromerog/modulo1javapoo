package ejerciciotarde.ejercfigurageometrica;

public class Circulo extends FiguraGeometrica{
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        if(radio == 0){
            throw new IllegalArgumentException("El radio no puede ser cero");
        } else {
            this.radio = radio;
        }
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radio , 2);
    }
}
