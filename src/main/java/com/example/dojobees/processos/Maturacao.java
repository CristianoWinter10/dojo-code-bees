package com.example.dojobees.processos;

import com.example.dojobees.modelos.Cerveja;

public class Maturacao {

    private Cerveja cerveja;

    public Maturacao(Cerveja cerveja) {
        this.cerveja = cerveja;
    }

    public void processar() {
        fermentar();
    }

    private void fermentar() {

    }
}
