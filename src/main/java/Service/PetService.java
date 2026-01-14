package Service;

import Model.Pet;
import Model.Sexo;
import Model.Tipo;
import Repository.PetRepository;
import Repository.PetRepositoryFactory;

public class PetService {
    private PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public void cadastrarPet(String nome, Tipo TIPO, Sexo sexo, String endereco, int idade, int peso, String raca) {
        Pet pet = new Pet();
        pet.setNome(nome);
        pet.setTIPO(TIPO);
        pet.setSexo(sexo);
        pet.setEndereco(endereco);
        pet.setIdade(idade);
        pet.setPeso(peso);
        pet.setRaca(raca);
        petRepository.cadastrar(pet);
    }

    public void salvarPersistencia(int opcao) {
        this.petRepository = PetRepositoryFactory.escolherImplementacao(opcao);
    }
}
