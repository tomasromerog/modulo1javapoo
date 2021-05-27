package clasetarde.clasedemoabstracta;

public class MainFiguraGeometrica {

    public static void main(String[] args) {

        Circulo c = new Circulo(120);
        c.imprimirArea();

        Rectangulo r = new Rectangulo(3,5);
        r.imprimirArea();

        Rectangulo j = new Rectangulo(7,8);

        FiguraGeometrica[] arr = {c,r,j};

        double x = FigurasUtil.areaPromedio(arr);
        System.out.println(x);
    }
}
