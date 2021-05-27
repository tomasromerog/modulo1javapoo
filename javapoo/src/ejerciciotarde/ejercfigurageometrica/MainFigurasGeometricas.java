package ejerciciotarde.ejercfigurageometrica;

public class MainFigurasGeometricas {
    public static void main(String[] args) {

        Circulo c1 = new Circulo(200);
        Circulo c2 = new Circulo(10);

        Rectangulo r1 = new Rectangulo(20, 40);
        Rectangulo r2 = new Rectangulo(10, 15);

        Triangulo t1 = new Triangulo(3, 7);
        Triangulo t2 = new Triangulo(87, 15);

        FiguraGeometrica[] arr = {c1, c2, r1, r2, t1, t2};

        double promedio = FigurasUtil.areaPromedio(arr);
        System.out.println(promedio);
    }
}
