package br.com.newton.nome;

import javax.swing.*;

public class Main {

    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog("Digite o nome");
        String sobreNome = JOptionPane.showInputDialog("Digite o sobrenome");

        String nomeCompleto = nome + " " + sobreNome;

        JOptionPane.showMessageDialog(null, "Nome Completo: "+nomeCompleto, "Informação" ,JOptionPane.ERROR_MESSAGE);

    }
}
