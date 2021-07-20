/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_vacina;

/**
 * Classe para objetos do tipo Hospital.
 * @author Murilo Gomes Munhoz (22.120.035 - 5)
 * 
 */

public class Hospital {
    private int cor;


    public Hospital(){
    }

 
    public Hospital(int cor) {
        this.cor = cor;
    }
    

    public int getCor() {
        return cor;
    }


    public void setCor(int cor) {
        this.cor = cor;
    }

}

