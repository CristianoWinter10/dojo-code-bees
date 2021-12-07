package com.example.dojobees;

import com.example.dojobees.modelos.Mosto;
import com.example.dojobees.modelos.Malte;
import com.example.dojobees.processos.Filtragem;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.testng.Assert;
import org.testng.annotations.Test;

@RunWith(JUnit4.class)
public class FiltragemTeste {

    @Test
    public void deveRetornarMostoAoRealizarProcessoDeFiltragem() {
        Mosto mosto = new Mosto(new Malte(null, null));
        Filtragem filtragem = new Filtragem(mosto);

        filtragem.processarMosto();

        Assert.assertTrue(mosto.isFiltrado());
    }
}
