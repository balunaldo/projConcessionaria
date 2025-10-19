import java.util.Scanner;

public class cadastro {
    public static void main(String args[]){
        final int QTDVEICULOS = 2;
        Scanner entrada = new Scanner(System.in);
        concessionaria listaVeiculos[] = new concessionaria[QTDVEICULOS];

        //leitura info dos veículos
        for(int i = 0; i < QTDVEICULOS; i++){
            listaVeiculos[i] = new concessionaria();
            System.out.println("\nVeículo " + (i + 1));
            System.out.println(("\nMarca: "));
            listaVeiculos[i].marca = entrada.nextLine();
            System.out.println("\nModelo: ");
            listaVeiculos[i].modelo = entrada.nextLine();
            System.out.println("\nAno: ");
            listaVeiculos[i].ano = entrada.nextInt();
            System.out.println("\nValor da venda: ");
            listaVeiculos[i].valor = entrada.nextFloat();
            
            entrada.nextLine(); // bom colocar para limpar buffer do teclado (tava no outro código do professor, então é útil kkkkk)
        }
        entrada.close();

        gerarListaVeiculos(listaVeiculos);
        System.out.println("\nTotal da obtido com as vendas: R$ " + somarVendas(listaVeiculos));
    }

    public static void gerarListaVeiculos(concessionaria[] listaVeic){
        System.out.println("\nVeículos: ");
        if(listaVeic == null) return;
        for(concessionaria v : listaVeic){
            if(v !=  null){
                v.imprimeInfo();
            }
        }
    }

    public static double somarVendas(concessionaria[] listaVeic){
        double total = 0.0;
        if(listaVeic == null) return total;
        for(concessionaria v : listaVeic){
            if(v != null){
                total += v.valor;
            }
        }
        return total;
    }
}
