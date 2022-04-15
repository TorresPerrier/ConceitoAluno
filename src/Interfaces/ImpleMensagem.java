package Interfaces;

import javax.swing.*;
import java.util.Objects;

public class ImpleMensagem implements Mensagem{


    public void Const(){

        String consta;

        consta = JOptionPane.showInputDialog("Informe o conceito obtido: ");
        if (Objects.equals(consta, "a")){
            JOptionPane.showMessageDialog(null, "Parabéns, você atingiu todos os indicadores de avaliação com excelência");
        } else if (Objects.equals(consta, "b")){
            JOptionPane.showMessageDialog(null, "Parabéns, você obteve aproveitamento satisfatório nos indicadores de avaliação");
        } else if (Objects.equals(consta, "c")) {
            JOptionPane.showMessageDialog(null, "Você não atingiu o mínimo esperado para aprovação");
        }

    }

}
