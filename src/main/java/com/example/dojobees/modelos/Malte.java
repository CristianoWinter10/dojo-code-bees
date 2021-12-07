package com.example.dojobees.modelos;

public class Malte {
    private Coloracao coloracao;
    private Aroma aroma;
    private boolean triturado = false;
    private boolean cozido = false;

    public Malte(Coloracao coloracao, Aroma aroma) {
        this.coloracao = coloracao;
        this.aroma = aroma;
    }

    public Aroma getAroma() {
        return this.aroma;
    }

    public void setAroma(Aroma aroma) {
        this.aroma = aroma;
    }

    public Coloracao getColoracao() {
        return this.coloracao;
    }

    public void setColoracao(Coloracao coloracao) {
        this.coloracao = coloracao;
    }

    public void setTriturado(boolean triturado) {
        this.triturado = triturado;
    }

    public boolean isTriturado() {
        return this.triturado;
    }

    public void setCozido(boolean cozido) {
        this.cozido = cozido;
    }

    public boolean isCozido() {
        return this.cozido;
    }
}
