import java.lang.module.Configuration;

public class poo {
    public static void main(String[] args) {
        Livro livro1=new Livro("Joao do java",59.95,"Java para tarados");
        livro1.exibirDetalhes();
        Eletronico ele1=new Eletronico("Smartphone",699.95,"Apple");
        ele1.exibirDetalhes();

        Livro livro2= new Livro(" Estruturas de Dados",59.95,"Gui do fernandes");
        livro2.exibirDetalhes();

        Eletronico ele2=new Eletronico("notebook",7999.95,"Apple");
        ele2.exibirDetalhes();



    }
}
abstract class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract void exibirDetalhes();
}

// Classe Livro herda Produto
class Livro extends Produto {
    String autor;

    public Livro(String autor, double preco, String nome) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$" + preco);
        System.out.println("--------------------------");
    }
}

class Eletronico extends Produto{
    String marca;

    public Eletronico(String nome, double preco, String marca){
        super(nome,preco);
        this.marca=marca;
    }
    @Override
    public void exibirDetalhes() {
        System.out.println("Eletrônico: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("--------------------------");
    }

}


