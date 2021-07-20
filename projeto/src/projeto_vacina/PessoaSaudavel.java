/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_vacina;

import java.util.Random;

/**
 * Classe para objetos do tipo Pessoa Saudavel.
 * @author Murilo Gomes Munhoz (22.120.035 - 5)
 *
 */

public class PessoaSaudavel extends Pessoa implements IMovable{
    public boolean vacina;
    int tempo;

    public PessoaSaudavel() {
    }
    
    public PessoaSaudavel(boolean vacina, int x, int y, int cor) {
        super(x, y, cor);
        this.vacina = vacina;
        
    }

    public PessoaSaudavel(boolean vacina, int tempo, int x, int y, int cor) {
        super(x, y, cor);
        this.vacina = vacina;
        this.tempo = tempo;
    }

    public PessoaSaudavel(int x, int y, int cor) {
        super(x, y, cor);
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }






    @Override
    public void mover() {
        Random random = new Random();
        int op = random.nextInt(3);
        int posY = super.getY() + 1;
        int posY2 = super.getY()- 1;
        int posX = super.getX() + 1;
        int posX2 = super.getX() - 1;

        switch (op) {
            case 0:
                super.setY(posY);
                break;
            case 1:
                super.setY(posY2);
                break;
            case 2:
                super.setX(posX);
                break;
            case 3:
                super.setX(posX2);
                break;
        }
    }
    
}

