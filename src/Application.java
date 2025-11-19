import Controller.*;
import Repository.PetRepository;
import Repository.txtPetRepository;
import Service.PetService;

public class Application {
    public static void main(String[] args) {
        PetRepository petRepository = new txtPetRepository();
        PetService petService = new PetService(petRepository);

        FormularioController formulario = new FormularioController();
        PetCadastroController cadastro = new PetCadastroController(petService,formulario);
        PetBuscaController busca = new PetBuscaController(petService);
        PetAlteracaoController alteracao = new PetAlteracaoController(petService);
        PetRemocaoController remocao = new PetRemocaoController(petService);

        MenuPrincipalController MenuPrincipal = new MenuPrincipalController(cadastro, busca, alteracao, remocao);
        MenuPrincipal.iniciar();

    }
}
