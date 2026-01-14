package Repository.jdbc;

import Repository.PetRepository;
import lombok.extern.log4j.Log4j2;
import Model.Pet;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class DBPetRepository implements PetRepository {

    @Override
    public void cadastrar(Pet pet) {
        String sql = "INSERT INTO `petshop`.`Pets` (`nome`, `tipo`, `sexo`, `endereco`, `idade`, `peso`, `raca`) VALUES ('%s', '%s', '%s', '%s', '%d', '%d', '%s');".formatted(pet.getNome(), pet.getTIPO(), pet.getSexo(), pet.getEndereco(), pet.getIdade(), pet.getPeso(), pet.getRaca());

        try (Connection conn = Repository.jdbc.ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Database rows affected {}", rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
