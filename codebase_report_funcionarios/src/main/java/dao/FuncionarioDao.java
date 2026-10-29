package dao;

import model.Funcionario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDao {
    private final ConnectionFactory connectionFactory;

    public FuncionarioDao() {
        this.connectionFactory = new ConnectionFactory();
    }

    public List<Funcionario> getAllFuncionarios() {
        List<Funcionario> funcionarios = new ArrayList<>();

        try (Connection connection = connectionFactory.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM funcionarios");
             ResultSet data = statement.executeQuery()) {

            while (data.next()) {
                Funcionario funcionario = new Funcionario();

                funcionario.setId(data.getLong("id"));
                funcionario.setNomeCompleto(data.getString("nome_completo"));
                funcionario.setStatus(data.getString("status"));
                funcionario.setCargo(data.getString("cargo"));

                funcionarios.add(funcionario);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao executar query" + e.getMessage());
        }
        return funcionarios;
    }
}
