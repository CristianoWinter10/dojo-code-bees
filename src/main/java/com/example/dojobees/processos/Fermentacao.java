package com.example.dojobees.processos;

import com.example.dojobees.modelos.Mosto;

public class Fermentacao {
    private Mosto mosto;

    public Fermentacao(Mosto mosto){
      this.mosto = mosto;
    }

    public void processar() {
        adicionarLeveduras();
        setarTemperatura();
        fermentar();
    }

    public void adicionarLeveduras() {}

    public void setarTemperatura() {}

    public void fermentar() {}
}
