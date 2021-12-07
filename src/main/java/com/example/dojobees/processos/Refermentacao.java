package com.example.dojobees.processos;

import com.example.dojobees.modelos.Cerveja;

public class Refermentacao {
    private Cerveja cerveja;

    public Refermentacao(Cerveja cerveja){
        this.cerveja = cerveja;
    }
    public void processar(){
        adicionarAcucar();
    }

    public void adicionarAcucar(){}
}
