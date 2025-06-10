import java.util.Scanner;

public class grau {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Digite o valor de A:");

        int a=sc.nextInt();

        System.out.print("Digite o valor de B:");

        int b=sc.nextInt();

        System.out.print("Digite o valor de C:");

        int c=sc.nextInt();

        int delta = (b * b) - (4 * a * c);
        System.out.println("O seu delta e:" +delta);

        if (delta<0){
            System.out.println("a equação não possui raízes reais.");
        } else if (delta==0) {
            double x = -b/(2.0*a);
            System.out.println("A equação possui uma raiz real: x = " + x);
        } else {
            double x1=(-b+ Math.sqrt(delta))/(2*a);
            double x2=(-b- Math.sqrt(delta))/(2*a);
            System.out.println("A equação possui duas raízes reais:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        }

    }
}
