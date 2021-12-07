package com.example.dojobees.modelos;

public class Mosto {

    private boolean filtrado = false;
    private boolean sedimentado = false;

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

     public boolean isSedimentado() {
        return this.sedimentado;
    }

    public void setSedimentado(boolean sedimentado) {
        this.sedimentado = sedimentado;
    }
}
