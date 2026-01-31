import testes.Rent;

import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Rent[] vect=new Rent[10];
        System.out.print("Quantos seram quartos reservos?: ");
        int n=sc.nextInt();


        for (int i=0;i<n;i++){
            System.out.println();
            System.out.println("Reserva #"+(i+1));
            System.out.print("Name: ");
            sc.nextLine();
            String name=sc.nextLine();
            System.out.print("Email: ");
            String email= sc.next();
            System.out.print("Room: ");
            int roomnumber= sc.nextInt();
            //Recebe o numero de quarto e manda para a reserva
            vect[roomnumber]=new Rent(name,email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for(int i=0;i<10;i++){
            if (vect[i]!=null){
                System.out.println(i+ ": "+vect[i]);
            }

        }



        sc.close();
    }
}
