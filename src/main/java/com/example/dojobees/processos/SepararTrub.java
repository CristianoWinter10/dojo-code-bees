package com.example.dojobees.processos;

import com.example.dojobees.modelos.Mosto;

public class SepararTrub {
    private Mosto mosto;

    public SepararTrub(Mosto mosto) {
        this.mosto = mosto;
    }

    public void processar() {
        sedimentar();
    }

    private void sedimentar() {
        this.mosto.setSedimentado(true);
    }
}
