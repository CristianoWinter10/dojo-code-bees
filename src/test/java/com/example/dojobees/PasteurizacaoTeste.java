package com.example.dojobees;

import com.example.dojobees.modelos.Cerveja;
import com.example.dojobees.processos.Pasteurizacao;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PasteurizacaoTeste {


    @Test
    public void DeveAlterarEstadoDaCervejaParaPasteurizada(){
        Cerveja cerveja = new Cerveja();
        Pasteurizacao pasteurizacao = new Pasteurizacao(cerveja);

        pasteurizacao.Processar();

        Assert.assertTrue(cerveja.getPasteurizada());
    }
}
