import java.lang.module.Configuration;

public class poo {
    public static void main(String[] args){
        Produto p1 = new Produto("Mouse Gamer", 129.99, 10);
        Produto p2 = new Produto("Teclado Mecânico", 249.90, 5);
        p1.detalhes();
        p1.repor(5);
        p1.vender(3);
        p1.detalhes();

        System.out.println();



        p2.detalhes();
        p2.vender(6);
        p2.vender(2);
        p2.detalhes();







    }
}
class Produto{
    String nome;
    double preco;
    int quantidade;


    public Produto(String nome,double preco, int quantidade){
        this.nome=nome;
        this.quantidade=quantidade;
        this.preco=preco;


    }public void detalhes(){
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: R$" + preco);
        System.out.println("(------------------)");
    } public void vender(int qtd){
        if (quantidade>0&& qtd <=quantidade){
            quantidade-=qtd;
            System.out.println("Venda de " + qtd + " unidades de " + nome + " realizada com sucesso.");

        }else {
            System.out.println("Estoque insuficiente ou quantidade inválida.");
        }
    } public void repor(int qtd){
        if (qtd>0){
            quantidade+=qtd;
            System.out.println("Reposto " + qtd + " unidades de " + nome);
        } else {
            System.out.println("Quantidade inválida para reposição.");

        }
    } public void mostrarEstoque() {
        System.out.println("Estoque atual de " + nome + ": " + quantidade + " unidades.");
    }

}



