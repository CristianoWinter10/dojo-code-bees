package com.example.dojobees;

import com.example.dojobees.modelos.Mosto;
import com.example.dojobees.modelos.Malte;
import com.example.dojobees.processos.SepararTrub;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.testng.Assert;
import org.testng.annotations.Test;

@RunWith(JUnit4.class)
public class SepararTrubTest {
    @Test
    public void deveRetornarMostoAoRealizarProcessoDeSeparacao() {
        Mosto mosto = new Mosto(new Malte(null, null));
        SepararTrub separacao = new SepararTrub(mosto);

        separacao.processar();

        Assert.assertTrue(mosto.isSedimentado());
    }
}
