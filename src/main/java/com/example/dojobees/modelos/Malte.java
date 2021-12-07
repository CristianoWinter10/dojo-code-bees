package com.example.dojobees.modelos;

public class Malte {
    Coloracao coloracao;
    Aroma aroma;

    public Malte(Coloracao coloracao, Aroma aroma) {
        this.coloracao = coloracao;
        this.aroma = aroma;
    }

    public void setAroma(Aroma aroma) {
        this.aroma = aroma;
    }

    public void setColoracao(Coloracao coloracao) {
        this.coloracao = coloracao;
    }
}
