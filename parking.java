import testes.Car;

import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Car[] car=new Car[10];
        System.out.print("Quantos carros seram usadas: ");
        int park=sc.nextInt();
        sc.nextLine();

        for (int i=0;i<park;i++){
            System.out.println();
            System.out.println("reserva#"+(i+1)+":");

            System.out.print("Nome do dono: ");
            sc.nextLine();
            String nome=sc.nextLine();

            System.out.print("Placa do seu carro: ");
            String placa=sc.nextLine();

            System.out.print("Vaga que sera reservada: ");
            int vaga=sc.nextInt();

            if(vaga>=0 && vaga<9){
                if(car[vaga]==null){
                    car[vaga]=new Car(nome,placa);
                } else {
                    System.out.println("Vaga ocupada");
                    i--;
                }
            }else {
                System.out.println("vaga invalida");
            }


        }

        System.out.println();
        System.out.println("Vagas usadas: ");
        for (int i=0;i<10;i++){
            if(car[i]!=null){
                System.out.println(i+":"+car[i]);
            }
        }




        sc.close();
    }
}
