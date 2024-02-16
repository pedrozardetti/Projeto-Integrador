package ProjetoIntegrador;

import javax.swing.JOptionPane;

public class imc {

  public String nome;
  public double peso;
  public double altura;
  public double imc;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getImc() {
    return imc;
  }

  public void setImc() {
    this.imc = peso / Math.pow(altura, 2);
  }

  public void listar() {

    JOptionPane.showMessageDialog(null, getNome() + "\n" + getPeso() + "\n" + getAltura() +
        "\n" + getImc(), "Saida do Imc", JOptionPane.INFORMATION_MESSAGE);

  }
}
