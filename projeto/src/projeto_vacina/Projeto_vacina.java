/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_vacina;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * Classe main do tipo projeto vacina.
 * @author Murilo Gomes Munhoz (22.120.035 - 5)
 * 
 */
public class Projeto_vacina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mundo m = new Mundo();
        
    UIManager UI=new UIManager();
    
    UI.put("OptionPane.background", Color.white);
    UI.put("Panel.background", Color.white);


        
        ImageIcon iconVirus = new ImageIcon("src\\projeto_vacina\\virus.png");
        ImageIcon iconSaudaveis = new ImageIcon("src\\projeto_vacina\\saudaveis.png");
        ImageIcon iconDoentes = new ImageIcon("src\\projeto_vacina\\doentes.png");
        ImageIcon iconMorte = new ImageIcon("src\\projeto_vacina\\caixao.png");
        
        int result = JOptionPane.showConfirmDialog((Component) null, "BEM VINDO!!\nOK para começar\nCANCEL para cancelar",
        "Corona Vacina", JOptionPane.OK_CANCEL_OPTION,0, iconVirus);
        
        if(result == 0){
        switch (m.desenhaMundo()) {
        
        case 1:
        JOptionPane.showMessageDialog(null,"Não há mais pessoas doentes","Atenção", 0, iconSaudaveis);
        break;
        case 2:
        JOptionPane.showMessageDialog(null,"Não há mais pessoas saudavéis","Atenção",0, iconDoentes);
        break;
        case 3:
        JOptionPane.showMessageDialog(null,"Não há mais pessoas vivas","Atenção",0, iconMorte);
        break;
        default:
        break;
        
        }
        }
        else if(result == 2){
        System.out.println("A simulção foi cancelada!!!!");
        }
        }

    }


    
            


