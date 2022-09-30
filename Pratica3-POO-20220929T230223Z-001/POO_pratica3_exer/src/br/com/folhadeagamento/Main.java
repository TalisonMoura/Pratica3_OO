package br.com.folhadeagamento;

public class Main {
    public static void main(String [] args) {
        FPadrao fp1 = new FPadrao(100,"Marioa Fernanda",2000);
        System.out.println("Toal proventos: " + fp1.calcularProventos());

        FComissionado fc1 = new FComissionado(101,"Pedro Silva",2000,1,10000);
        System.out.println("Total proventos Func.Comissionado: " + fc1.calcularProventos());

        FProdutividade fd1 = new FProdutividade(101,"Talison",2000,1,2000);
        System.out.println("Total proventos Func.Produção: " + fd1.calcularProventos());
    }
}
