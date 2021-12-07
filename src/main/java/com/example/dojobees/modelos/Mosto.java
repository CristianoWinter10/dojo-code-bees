package com.example.dojobees.modelos;

public class Mosto {

    private boolean filtrado = false;

    private Malte malte;

    public Mosto(Malte malte) {
        this.malte = malte;
    }

    public void setMosto(Malte malte) {
        this.malte = malte;
    }

    public void getMosto(Malte malte) {
        this.malte = malte;
    }

    public boolean isFiltrado() {
        return filtrado;
    }

    public void setFiltrado(boolean filtrado) {
        this.filtrado = filtrado;
    }
}
