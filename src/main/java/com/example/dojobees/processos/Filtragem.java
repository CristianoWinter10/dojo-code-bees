package com.example.dojobees.processos;

import com.example.dojobees.modelos.Mosto;
import com.example.dojobees.modelos.Cerveja;

public class Filtragem {

    private Mosto mosto;
    private Cerveja cerveja;

    public Filtragem(Mosto mosto) {
        this.mosto = mosto;
    }

    public Filtragem(Cerveja cerveja) {
        this.cerveja = cerveja;
    }

    public void processarMosto() {

        filtrar();
        filtrar();

        this.mosto.setFiltrado(true);
    }

    public void processarCerveja() {
        filtrar();
    }

    private void filtrar() {

    }

}
