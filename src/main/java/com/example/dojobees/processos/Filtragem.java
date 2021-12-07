package com.example.dojobees.processos;

import com.example.dojobees.modelos.Mosto;

public class Filtragem {

    private final Mosto mosto;

    public Filtragem(Mosto mosto) {
        this.mosto = mosto;
    }

    public void processar() {

        filtrar();
        filtrar();

        this.mosto.setFiltrado(true);
    }

    private void filtrar() {

    }

}
