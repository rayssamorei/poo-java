package POO.questao08;

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null, "Nome do personagem: ");
        String classe = JOptionPane.showInputDialog(null, "Classe do personagem: ");

        Personagem2 guerreiro = new Personagem2(nome, classe);
        guerreiro.mostrarStatus();
    }
}
