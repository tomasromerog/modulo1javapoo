package clasemaniana;

import java.util.ArrayList;

public class DemoParam {
    public static void f(int x){
        x=10;
        System.out.println("Estoy en f(), x= " + x );
    }

    public static void g(ArrayList<Integer> x){
        x.add(1);
        x.add(2);
        x.add(3);
    }

    public static void h(ArrayList<Integer> x){
        ArrayList<Integer> y = new ArrayList<>();
        y.add(10);
        y.add(20);
        y.add(30);
        x = y;
    }

    public static void main(String[] args) {
        int i = 4;
        f(i);
        System.out.println("Estoy en main(), i= " + i);

        ArrayList<Integer> z = new ArrayList<>();
        g(z);

        for (int j: z){
            System.out.println(j);
        }
        System.out.println("----");
        h(z);

        for (int j: z){
            System.out.println(j);
        }
    }
}
