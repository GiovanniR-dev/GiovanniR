import java.util.Locale;
import java.util.Scanner;

public class cursojava {
    public static void  main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner((System.in));
            Double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
            A = sc.nextDouble();
            B = sc.nextDouble();
            C = sc.nextDouble();
            triangulo = A*C / 2.0;
            circulo = 3.14159*C*C;
            trapezio = (A+B)/2.0*C;
            quadrado = B*B;
            retangulo = A+B;

            System.out.printf("Triangulo: %.3f%n", triangulo);
            System.out.printf("circulo: %.3f%n", circulo);
            System.out.printf("trapezio: %.3f%n", trapezio);
            System.out.printf("quadrado: %.3f%n", quadrado);
            System.out.printf("retangulo: %.3f%n", retangulo);



            sc.close();




    }
}
