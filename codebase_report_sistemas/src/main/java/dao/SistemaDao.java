package dao;

import model.Sistema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SistemaDao {
    private final ConnectionFactory connectionFactory;

    public SistemaDao() {
        this.connectionFactory = new ConnectionFactory();
    }

    public List<Sistema> getAllSistemas() {
        List<Sistema> sistemas = new ArrayList<>();

        try (Connection connection = connectionFactory.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM sistemas");
             ResultSet data = statement.executeQuery();
        ) {
            while (data.next()) {
                Sistema sistema = new Sistema();

                sistema.setId(data.getLong("id"));
                sistema.setNome(data.getString("nome"));
                sistema.setEmpresa(data.getString("empresa"));
                sistema.setResponsavel(data.getString("responsavel"));

                sistemas.add(sistema);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao executar query" + e.getMessage());
        }
        return sistemas;
    }
}
