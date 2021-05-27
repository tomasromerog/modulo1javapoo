package clasetarde;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion() {
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void simplificar(){
        int i = 2;
        while (i <= numerador && i <= denominador){
            if( numerador%i==0 && denominador%i==0){
                this.numerador = numerador/i;
                this.denominador = denominador/i;
            } else {
                i++;
            }
        }
    }

    public Fraccion sumar(Fraccion x){
        int nuevoDenominador = denominador * x.denominador;
        int nuevoNumerador = numerador * x.denominador + x.numerador * denominador;

        this.numerador = nuevoNumerador;
        this.denominador = nuevoDenominador;
        return this;
    }

    public static Fraccion sumar(Fraccion a, Fraccion b){
        Fraccion x = new Fraccion(a.numerador,a.denominador);
        x.sumar(b);
        return x;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    @Override
    public boolean equals(Object obj) {
        //Aca controlamos que el obj sea del tipo Fraccion.
        if(!(obj instanceof Fraccion)){
            return false;
        }
        //Aca convierto el objeto que mandamos en fraccion.
        //(Casteamos el objeto en fraccion upcasting y downcasting en java)
        Fraccion x = (Fraccion) obj;
        return this.numerador==x.numerador && this.denominador==x.denominador;
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
