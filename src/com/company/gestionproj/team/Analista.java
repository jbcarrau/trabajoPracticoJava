package com.company.gestionproj.team;

public class Analista {
    private String tipo;
    private Double valorHora;

    public Analista() {}

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorHora() {
        return valorHora;
    }
}

