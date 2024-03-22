package controller;

import java.sql.SQLException;
import java.sql.PreparedStatement; // Dentro da conexão permite executar comandos SQL
import javax.swing.JOptionPane;

public class UsuarioDao extends ConectarDao {

    String sql;
    PreparedStatement ps; // objeto para executar o sql

    public UsuarioDao() {
        super();
    }

    /**
     *
     */
    public void criarBanco() {
        try {
            sql = "CREATE TABLE IF NOT EXISTS NIVEIS (idNivel int not null,"
                    + "dsNivel varchar(20) not null, "
                    + "primary key(idNivel) ) ";
            ps = con.prepareStatement(sql); // prepara o objeto que irá executar o comando SQL
            ps.execute(); // Executa o comando SQL
            sql = "CREATE TABLE IF NOT EXISTS USUARIOS ("
                    + "cpf varchar(12) not null ,"
                    + "nome varchar(50) not null ,"
                    + "email varchar(50) not null ,"
                    + "celular varchar(20) not null ,"
                    + "idNivel int not null, "
                    + "primary key (cpf) )";
            ps = con.prepareStatement(sql); // prepara o objeto que irá executar o comando SQL
            ps.execute(); // Executa o comando SQL
            ps.close(); // Fecha o objeto
            con.close(); // Fecha a conexão
            JOptionPane.showMessageDialog(null, "Banco criado com sucesso...");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados " + err.getMessage());
        }
    }
}
