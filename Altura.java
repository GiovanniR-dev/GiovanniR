import testes.Seats;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao cadastradas?: ");
        int n = sc.nextInt();

        double[] altura = new double[n];

        for (int i = 0; i<n; i++) {
            System.out.println();
            System.out.print("Altura#"+(i+1)+": ");
            altura[i] = sc.nextDouble();



        }
        double soma=0;
        for (double p:altura) {
            soma += p;

        }

        double media = soma/altura.length;


        int cont=0;
        for (double p:altura) {
            if (p>media) {
                cont++;
            }
        }

        double maior=0;
        for (double p:altura) {
            if (p>maior) {
                maior=p;
            }
        }

        double max=altura[0];
        double min=altura[0];

        for (double p:altura) {
            if (p>max) {
                max=p;
            }
            if (p<min) {
                min=p;
            }
        }

        double diferenca=max-min;



        System.out.println("Media: "+media);
        System.out.println("Acima da media: "+cont);
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+min);
        System.out.println("Diferenca: "+diferenca);









        sc.close();
    }

}
