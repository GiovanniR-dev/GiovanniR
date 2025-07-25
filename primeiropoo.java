


public class poo {
    public static void main(String[] args){
        Carro meuCarro= new Carro();

        meuCarro.marca="Volkswagen";
        meuCarro.modelo="Jetta Gli 2.0";
        meuCarro.ano=2024;

        meuCarro.buzinar();
        meuCarro.dados();


    }

}
class Carro {
    String marca;
    String modelo;
    int ano;


    public void buzinar(){
        System.out.println("Biiiiiiiiiiiiiiiiii");
    }

    public void dados (){
        System.out.println("Marca: "+marca);
        System.out.println("modelo: "+modelo);
        System.out.println("ano: "+ano);

    }


}
