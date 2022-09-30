package br.com.carnaval;

public class Normal extends Ingresso{
    public Normal(double valorIngresso) {
        super(valorIngresso);
    }
    public String imprimeIngreso(){
        valorIngresso=100;
        return "Ingresso Normal: " + getValorIngresso();
    }

}
