import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o peso da racao");

        double pesoKg = sc.nextInt();

        System.out.println("Quanto que o gato come por dia?:");

        int consumo = sc.nextInt();

        int pesoGramas=(int)(pesoKg*1000);

        int dias = pesoGramas / consumo;

        int sobra = pesoGramas % consumo;


        System.out.println("Duracao:"+dias+"  dias");
        System.out.println("Sobra(G)"+sobra);

        sc.close();
    }
}
