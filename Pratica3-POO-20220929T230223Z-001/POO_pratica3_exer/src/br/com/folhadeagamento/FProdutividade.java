package br.com.folhadeagamento;

public class FProdutividade extends Funcionario {
    private double valor;
    private double producao;

    public FProdutividade(int matricula, String nome, double salario, double valor, double producao) {
        super(matricula, nome, salario);
        this.valor = valor;
        this.producao = producao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getProducao() {
        return producao;
    }

    public void setProducao(double producao) {
        this.producao = producao;
    }
    public double calcularProventos()   {
        return getValor()*getProducao()+getSalario();
    }
}
