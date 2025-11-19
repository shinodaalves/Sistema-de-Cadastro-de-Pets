package Repository;

import Service.PetService;

public class txtPetRepository implements PetRepository {
    PetService petService;

    public txtPetRepository() {
    }

    public txtPetRepository(PetService petService) {
        this.petService = petService;
    }

    @Override
    public void cadastrar() {

    }
}
