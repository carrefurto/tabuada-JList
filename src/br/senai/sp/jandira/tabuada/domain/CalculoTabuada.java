package br.senai.sp.jandira.tabuada.domain;

import java.util.ArrayList;
import java.util.List;

public class CalculoTabuada {
    private int multiplicando;
    private int minimoMultiplicador;
    private int maximoMultiplicador;

    public int getMultiplicando() {
        return multiplicando;
    }

    public void setMultiplicando(int multiplicando) {
        this.multiplicando = multiplicando;
    }

    public int getMinimoMultiplicador() {
        return minimoMultiplicador;
    }

    public void setMinimoMultiplicador(int minimoMultiplicador) {
        this.minimoMultiplicador = minimoMultiplicador;
    }

    public int getMaximoMultiplicador() {
        return maximoMultiplicador;
    }

    public void setMaximoMultiplicador(int maximoMultiplicador) {
        this.maximoMultiplicador = maximoMultiplicador;
    }

    public List<String> calcularTabuada() {
        List<String> linhasTabuada = new ArrayList<>();
        for (int i = minimoMultiplicador; i <= maximoMultiplicador; i++) {

            int resultado = multiplicando * i;
            linhasTabuada.add(multiplicando + " x " + i + " = " + resultado);

            
        }
        return linhasTabuada;
    }
}