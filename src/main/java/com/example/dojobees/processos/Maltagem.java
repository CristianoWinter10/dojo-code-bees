package com.example.dojobees.processos;

import com.example.dojobees.modelos.Aroma;
import com.example.dojobees.modelos.Coloracao;
import com.example.dojobees.modelos.Malte;

public class Maltagem {

    private int diasDeProcesso;

    private final int DIAS_MAXIMO_PARA_TORRAGEM_TRADICIONAL = 3;

    public Maltagem(int diasDeProcesso) {
        this.diasDeProcesso = diasDeProcesso;
    }

    public Malte processar() {
        Malte malte = macerarEGerminar();
        secarTorrar(malte);
        return malte;
    }


    private Malte macerarEGerminar() {
        //adiciona água e oxigênio
        return new Malte(null, null);
    }

    private void secarTorrar(Malte malte){
        if (diasDeProcesso < DIAS_MAXIMO_PARA_TORRAGEM_TRADICIONAL) {
            malte.setAroma(Aroma.TRADICIONAL);
            malte.setColoracao(Coloracao.CLARA);
        } else {
            malte.setAroma(Aroma.TORRADO);
            malte.setColoracao(Coloracao.ESCURA);
        }
    }

    public int getDiasDeProcesso() {
        return diasDeProcesso;
    }
}
