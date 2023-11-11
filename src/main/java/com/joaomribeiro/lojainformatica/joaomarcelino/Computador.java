package com.joaomribeiro.lojainformatica.joaomarcelino;

public class Computador {
    private static String marca = "JoaoLuizMarcelinoRibeiro";
    private String hd;
    private String processador;

    public Computador() {
    }

    public static String getMarca() {
        return marca;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
}
