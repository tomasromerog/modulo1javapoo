package clasemaniana.demofraccion;

public class MainFraccion {
    public static void main(String[] args) {

        //Instanciamos a la clase o al objeto
        Fraccion f = new Fraccion(2,3);

        Fraccion g = new Fraccion(5 , 3);

        f.sumar(g);
        f.simplificar();
        f.imprimir();

        Fraccion x = Fraccion.sumar(f,g);
        f.imprimir();

    }
}
