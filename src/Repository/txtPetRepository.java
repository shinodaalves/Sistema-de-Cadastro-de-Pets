package Repository;

import Model.Pet;
import Service.PetService;

import java.io.*;

public class txtPetRepository implements PetRepository {
    PetService petService;

    public txtPetRepository() {
    }

    public txtPetRepository(PetService petService) {
        this.petService = petService;
    }

    @Override
    public void cadastrar(Pet pet) {
        try (FileWriter fw = new FileWriter("src/Data/pets/aaa");
             BufferedWriter bw = new BufferedWriter(fw)) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
