package com.company.gestionproj.team;

public class Tester {
    private String tipo;
    private Double valorHora;
    private int alcance;

    public Tester(){}

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public String getTipo() {
        return tipo;
    }

    public int getAlcance() {
        return alcance;
    }
}
