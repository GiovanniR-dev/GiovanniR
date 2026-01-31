import testes.Product;

import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();
        Product[] vect=new Product[n];

        for (int i=0;i<n;i++){
            sc.nextLine();
            String name= sc.nextLine();
            double price=sc.nextDouble();
            vect[i]=new Product(name, price);
        }

        double sum=0;
        for (int i=0;i<n;i++){
            sum+=vect[i].getPrice();
        }

        double avg=sum/n;
        System.out.println(avg);


        sc.close();
    }
  public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name=name;
        this.price=price;
    }

      sc.close;
}
