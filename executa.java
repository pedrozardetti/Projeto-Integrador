package ProjetoIntegrador;

import javax.swing.JOptionPane;

public class executa {
  public static void main(String[] args) {

    String nome = JOptionPane.showInputDialog(
        null,
        "Digite o nome:",
        "**Entrada **",
        JOptionPane.QUESTION_MESSAGE);

    String peso_ = JOptionPane.showInputDialog(
        null,
        "Digite o peso:",
        "**Entrada **",
        JOptionPane.QUESTION_MESSAGE);

    String altura_ = JOptionPane.showInputDialog(
        null,
        "Digite a altura:",
        "**Entrada **",
        JOptionPane.QUESTION_MESSAGE);

    double peso, altura;
    peso = Double.parseDouble(peso_);
    altura = Double.parseDouble(altura_);

    imc i1 = new imc();// instanciar a classe Imc
    i1.setNome(nome);
    i1.setPeso(peso);
    i1.setAltura(altura);
    i1.setImc();
    i1.listar();

  }

}
