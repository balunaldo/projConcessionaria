package Arquivos;
public class concessionaria {
    String marca;
    String modelo;
    int ano;
    double valor;

    public void imprimeInfo(){
        System.out.println(this.marca + ": " + this.modelo + " - " + this.ano + " = " + this.valor);
    }
}