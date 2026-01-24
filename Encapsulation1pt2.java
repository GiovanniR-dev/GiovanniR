package entities;

public class Product {

    private String nomeDaconta;
    private int numeroDaconta;
    private double deposito;

    public Product(int numeroDaconta, String nomeDaconta) {
        this.nomeDaconta=nomeDaconta;
        this.numeroDaconta=numeroDaconta;
    }

    public Product(int numeroDaconta, String nomeDaconta,double inicialDeposit) {
        this.nomeDaconta=nomeDaconta;
        this.numeroDaconta=numeroDaconta;
        deposit(inicialDeposit);
    }



    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public int getNumeroDaconta() {
        return numeroDaconta;
    }

    public void setNumeroDaconta(int numeroDaconta) {
        this.numeroDaconta = numeroDaconta;
    }

    public String getNomeDaconta() {
        return nomeDaconta;
    }

    public void setNomeDaconta(String nomeDaconta) {
        this.nomeDaconta = nomeDaconta;
    }

    public void deposit(double amount){
        deposito+=amount;
    }

    public void saque(double amount){
        deposito-=amount + 5.0;
    }

    public String toString(){
        return "Account: "
                +numeroDaconta
                +", holder: "
                +nomeDaconta
                +", balance: $"
                +String.format("%.2f",deposito);
    }
}
