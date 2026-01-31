import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar?: ");
        int n=sc.nextInt();

        int[] vect=new int[n];

        for (int i=0;i<n;i++){
            System.out.println("Digite um numero: ");
            vect[i]= sc.nextInt();
        }

        System.out.println("Numeros negativos");
        for (int i=0;i<n;i++){
            if (vect[i]<0){
                System.out.println(vect[i]);
            }
        }





        sc.close();
    }
}
