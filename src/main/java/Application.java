import Controller.*;
import Repository.PetRepository;
import Repository.PetRepositoryFactory;
import Repository.TxtPetRepository;
import Service.PetService;
import Repository.jdbc.DBPetRepository;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PetRepository petRepository = PetRepositoryFactory.escolherPeloConsole(sc);
        PetService petService = new PetService(petRepository);

        Controller.PersistenciaController persistencia = new Controller.PersistenciaController(petService);
        Controller.FormularioController formulario = new Controller.FormularioController();
        Controller.PetCadastroController cadastro = new Controller.PetCadastroController(petService,formulario);
        Controller.PetBuscaController busca = new Controller.PetBuscaController(petService);
        Controller.PetAlteracaoController alteracao = new Controller.PetAlteracaoController(petService);
        Controller.PetRemocaoController remocao = new Controller.PetRemocaoController(petService);

        Controller.MenuPrincipalController menuPrincipal = new Controller.MenuPrincipalController(persistencia, cadastro, busca, alteracao, remocao);
        menuPrincipal.iniciar(sc);


    }
}
