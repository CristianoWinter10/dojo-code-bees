package com.example.dojobees;

import com.example.dojobees.modelos.Malte;
import com.example.dojobees.modelos.Aroma;
import com.example.dojobees.modelos.Coloracao;
import com.example.dojobees.processos.Maltagem;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.testng.Assert;
import org.testng.annotations.Test;

@RunWith(JUnit4.class)
public class MaltagemTeste {

    @Test
    public void deveRetornarMalteAoRealizarProcessoDeMaltagem() {
        Maltagem maltagem = new Maltagem(10);
        Malte malte = maltagem.processar();

        Assert.assertEquals(malte.getAroma(), Aroma.TORRADO);
        Assert.assertEquals(malte.getColoracao(), Coloracao.ESCURA);
    }

    @Test
    public void deveRetornarCervejaTradicional() {
        Maltagem maltagem = new Maltagem(2);
        Malte malte = maltagem.processar();

        Assert.assertEquals(malte.getAroma(), Aroma.TRADICIONAL);
        Assert.assertEquals(malte.getColoracao(), Coloracao.CLARA);
    }
}
