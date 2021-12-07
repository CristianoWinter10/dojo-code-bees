package com.example.dojobees.processos;

import com.example.dojobees.modelos.Cerveja;

public class Pasteurizacao {
    private Cerveja cerveja;
    
    public Pasteurizacao(Cerveja cerveja){
        this.cerveja = cerveja;
    }
    
    public void Processar(){
        aplicarChoqueTermico();
    }

    private void aplicarChoqueTermico() {
        this.cerveja.setPasteurizada(true);
    }
}
