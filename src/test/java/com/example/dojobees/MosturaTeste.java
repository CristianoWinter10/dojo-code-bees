package com.example.dojobees;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import com.example.dojobees.processos.Mostura;
import com.example.dojobees.modelos.Malte;
import org.testng.Assert;
import org.testng.annotations.Test;

@RunWith(JUnit4.class)
public class MosturaTeste {

    @Test
    public void deveRetornarMostoAoRealizarProcessoDeMostura() {
        Mostura mostura = new Mostura();
        Malte malte = new Malte(null, null);
        mostura.processar(malte);

        Assert.assertTrue(malte.isCozido());
        Assert.assertTrue(malte.isTriturado());
    }
}

