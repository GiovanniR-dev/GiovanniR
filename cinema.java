import testes.Seats;

import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Seats[] seats=new Seats[10];
        System.out.println("Digite quantos ingressos seram vendidos: ");
        int s=sc.nextInt();

        for (int i=0;i<s;i++){
            sc.nextLine();
            System.out.println("Seats#"+(i+1)+":");

            System.out.print("Nome: ");
            String nome=sc.nextLine();

            System.out.print("Seats Number: ");
            int SN=sc.nextInt();

            //quando existir algum lugar usadado ele ira pedir outro numero
            while(SN<0 || SN>9 || seats[SN]!=null){
            if (SN< 0|| SN>9){
                System.out.println("Assento invalido! Escolha de 0 a 9:");
            } else {
                System.out.print("Assento ocupado! Escolha outro: ");
            }
            SN=sc.nextInt();
            }
            seats[SN]=new Seats(nome);
            sc.nextLine();
        }




        System.out.println();
        System.out.println("Assentos usados: ");
        for (int i=0;i<10;i++){
            if (seats[i]!=null){
                System.out.println(i+":"+seats[i].getNome());
            }
        }



        sc.close();
    }
}

//class seats
package testes;

public class Seats {
    private String nome;

    public Seats(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return  nome ;
    }
}

