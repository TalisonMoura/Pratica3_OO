package br.com.carnaval;

public class Vip extends Ingresso{

    private double valorAdcicioal;
    private static int count=0;

    public Vip(double valorIngresso, double valorAdcicioal) {
        super(valorIngresso);
        this.valorAdcicioal = valorAdcicioal;
        count++;
    }

    public double getValorAdcicioal() {
        return valorAdcicioal;
    }

    public void setValorAdcicioal(double valorAdcicioal) {
        this.valorAdcicioal = valorAdcicioal;
    }

    public String imprimeIngresso(){
        return "Ingresso VIP: " + (getValorIngresso() + getValorAdcicioal());
    }

    public int numeroVip(){
        return count;
    }
}

