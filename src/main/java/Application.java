import Controller.*;
import Repository.PetRepository;
import Repository.jdbc.DBPetRepository;
import Service.PetService;

public class Application {
    public static void main(String[] args) {
        //PetRepository petRepository = new TxtPetRepository();
        PetRepository petRepository = new DBPetRepository();
        PetService petService = new PetService(petRepository);

        Controller.FormularioController formulario = new Controller.FormularioController();
        Controller.PetCadastroController cadastro = new Controller.PetCadastroController(petService,formulario);
        Controller.PetBuscaController busca = new Controller.PetBuscaController(petService);
        Controller.PetAlteracaoController alteracao = new Controller.PetAlteracaoController(petService);
        Controller.PetRemocaoController remocao = new Controller.PetRemocaoController(petService);

        Controller.MenuPrincipalController MenuPrincipal = new Controller.MenuPrincipalController(cadastro, busca, alteracao, remocao);
        MenuPrincipal.iniciar();


    }
}
