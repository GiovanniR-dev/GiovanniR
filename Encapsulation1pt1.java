import java.util.Locale;
import java.util.Scanner;
import entities.Product;
public class Main {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            Product account;

            System.out.print("Enter account number: ");
            int number=sc.nextInt();

            System.out.print("enter account holder: ");
            sc.nextLine();
            String holder=sc.nextLine();

            System.out.print("tem deposito inical y/n: ");
            char response=sc.next().charAt(0);
            if (response=='y'){
                System.out.print("Digite o valro de deposito: ");
                double inicialDeposit=sc.nextDouble();
                account= new Product(number,holder,inicialDeposit);
            } else {
                account =new Product(number,holder);
            }

            System.out.println();
            System.out.print("Account data: ");
            System.out.print(account);

            System.out.println();
            System.out.print("Deposito: ");
            double depositiVale=sc.nextDouble();
            account.deposit(depositiVale);
            System.out.print("Updated account data: ");
            System.out.print(account);

            System.out.println();
            System.out.print("Saque: ");
            double Saque=sc.nextDouble();
            account.saque(Saque);
            System.out.print("Updated account data: ");
            System.out.print(account);


            sc.close();
        }




}
