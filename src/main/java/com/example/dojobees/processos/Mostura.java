package com.example.dojobees.processos;

import com.example.dojobees.modelos.Malte;
import com.example.dojobees.modelos.Mosto;

public class Mostura {

    public Mosto processar(Malte malte){
        triturar(malte);
        cozinhar(malte);
        
        return new Mosto(malte);
    }

    private void triturar(Malte malte) {
        malte.setTriturado(true);
    }

    private void cozinhar(Malte malte) {
        malte.setCozido(true);
    }
}
