package ejercmanana;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion() {
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion sumar(Fraccion x){
        int nuevoDenominador = denominador * x.denominador;
        int nuevoNumerador = numerador * x.denominador + x.numerador * denominador;

        this.numerador = nuevoNumerador;
        this.denominador = nuevoDenominador;
        return this;
    }

    //Hacer lo mismo para la divicion, multiplicacion y resta
    public Fraccion sumar(int numero){
        int nuevoDenominador = denominador * 1;
        int nuevoNumerador = numerador * 1 + numero *denominador;

        this.denominador = nuevoDenominador;
        this.numerador = nuevoNumerador;

        return this;
    }

    public void imprimir(){
        System.out.println(numerador + "/" + denominador);
    }

    public Fraccion restar(Fraccion x){
        int nuevoDenominador = denominador * x.denominador;
        int nuevoNumerador = numerador * x.denominador - x.numerador * denominador;

        this.numerador = nuevoNumerador;
        this.denominador = nuevoDenominador;
        return this;
    }

    //Falta ejecutarlo

    public Fraccion multiplicar(Fraccion x){
        int nuevoDenominador = denominador * x.denominador;
        int nuevoNumerador = numerador * x.numerador;

        this.numerador = nuevoNumerador;
        this.denominador = nuevoDenominador;
        return this;
    }

    public Fraccion dividir(Fraccion x){
        int nuevoDenominador = denominador * x.numerador;
        int nuevoNumerador = numerador * x.denominador;

        this.numerador = nuevoNumerador;
        this.denominador = nuevoDenominador;
        return this;
    }


    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
}
