import java.lang.module.Configuration;

public class poo {
    public static void main(String[] args) {
        FuncionarioComum f1=new FuncionarioComum("Giovanni",2500);
        f1.detalhes();
        f1.aumento(10);
        f1.detalhes();


    }
}   abstract class Funcionarios {
    protected String nome;
    protected double salario;

    public Funcionarios(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumento(double percentual) {
        if (percentual > 0) {
            salario += salario * (percentual / 100);
            System.out.println("Salário aumentado em " + percentual + "%.");
        }
    }

    public void detalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + salario);
        System.out.println("---------------");
    }

}
    class FuncionarioComum extends Funcionarios {
        public FuncionarioComum(String nome, double salario) {
            super(nome, salario);
        }
}






