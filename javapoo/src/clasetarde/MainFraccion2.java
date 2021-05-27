package clasetarde;

public class MainFraccion2 {

    public static void main(String[] args) {

        Fraccion f = new Fraccion(2,5);
        Fraccion g = new Fraccion(2,5);

        if( f.equals(g)){
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        System.out.println(f);
    }
}
