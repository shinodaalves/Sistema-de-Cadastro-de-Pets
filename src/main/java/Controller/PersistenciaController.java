package Controller;

import Service.PetService;

public class PersistenciaController {
    private final PetService petService;

    public PersistenciaController(PetService petService) {
        this.petService = petService;
    }

    public int escolherPersistencia(int opcao) {
        petService.salvarPersistencia(opcao);
        return opcao;
    }
}
