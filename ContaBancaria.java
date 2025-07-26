import java.lang.module.Configuration;

public class poo {
    public static void main(String[] args) {
        conta conta1=new conta("12345","Giovanni");

        conta1.mostrarsaldo();

        conta1.depositar(1000);

        conta1.sacar(1500);

        conta1.sacar(500);

        conta1.mostrarsaldo();

    }
}
class conta{
    private String numerodaconta;
    private String Titular;
    private double saldo;

    public conta(String numerodaconta, String titular){
        this.numerodaconta= numerodaconta;
        this.Titular=titular;
        this.saldo=0.0;
    }

    public void depositar(double valor){
        if(valor>0){
            saldo +=valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor invalido para deposito");
        }

    }

    public void sacar(double valor){
        if (valor>0 && valor <= saldo){
            saldo-=valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("ta duro vai trabalhar");
        }
    }
    public void mostrarsaldo(){
        System.out.println("Saldo atual: "+saldo);
    }

    public String getNumerodaconta(){
        return Titular;
    }
}
