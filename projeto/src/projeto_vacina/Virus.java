/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_vacina;

/**
 * Classe para objetos do tipo Virus.
 * @author Murilo Gomes Munhoz (22.120.035 - 5)
 * 
 */

    public class Virus {

    private int tempoContaminado;

    /**
     * Método construtor
     */
    public Virus() {
    }


    public Virus(int tempoContaminado) {
        this.tempoContaminado = tempoContaminado;
    }

    public int getTempoContaminado() {
        return tempoContaminado;
    }

 
    public void setTempoContaminado(int tempoContaminado) {
        this.tempoContaminado = tempoContaminado;
    }

}

