package Controller;

import java.util.Scanner;

public class MenuPrincipalController {

    private final PetCadastroController cadastroController;
    private final PetBuscaController buscaController;
    private final PetAlteracaoController alteracaoController;
    private final PetRemocaoController remocaoController;
    private final PersistenciaController persistenciaController;

    public MenuPrincipalController(PersistenciaController persistenciaController, PetCadastroController cadastroController, PetBuscaController buscaController, PetAlteracaoController alteracaoController, PetRemocaoController remocaoController) {
        this.persistenciaController = persistenciaController;
        this.cadastroController = cadastroController;
        this.buscaController = buscaController;
        this.alteracaoController = alteracaoController;
        this.remocaoController = remocaoController;
    }

    public void iniciar(Scanner sc) {
        boolean continuar = true;
        //Scanner sc = new Scanner(System.in);
        System.out.println("\nBem Vindo Ao Sistema de Cadastro de Pets");

        while (continuar) {
            System.out.println("\n1. Cadastrar novo pet");
            System.out.println("2. Buscar / listar pets");
            System.out.println("3. Alterar dados de um pet");
            System.out.println("4. Remover um pet");
            System.out.println("5. Sair");
            System.out.print("\nOpção Selecionada: ");
            int opcao = lerOpcaoUsuario(sc);
            continuar = executarOpcao(opcao, sc);
        }
        System.out.println("Encerrando o sistema. Até logo!");
    }

    public int lerOpcaoUsuario(Scanner sc) {
        while (true) {
            String entrada = sc.nextLine().trim();

            if (!entrada.matches("\\d+")) {
                System.out.println("Somente números! Tente novamente.");
                System.out.print("Opção Selecionada: ");
                continue;
            }

            int opcao = Integer.parseInt(entrada);

            if (opcao < 1 || opcao > 5) {
                System.out.println("Opção inválida! Digite um número entre 1 e 5.");
                System.out.print("Opção Selecionada: ");
                continue;
            }

            System.out.println("-----------------------------------------");
            return opcao;
        }
    }

    public boolean executarOpcao(int opcao, Scanner sc) {
        boolean continuar = true;

        switch (opcao) {
            case 1:
                cadastroController.cadastrarPet(sc);
                continuar = true;
                break;
            case 2:
                continuar = true;
                break;
            case 3:
                continuar = true;
                break;
            case 4:
                continuar = true;
                break;
            case 5:
                continuar = false;
                break;
        }
        return continuar;
    }

    public int lerOpcaoImplementacao(Scanner sc) {
        while (true) {
            String entrada = sc.nextLine().trim();

            if (!entrada.matches("\\d+")) {
                System.out.println("Somente números! Tente novamente.");
                System.out.print("Opção Selecionada: ");
                continue;
            }

            int opcao = Integer.parseInt(entrada);

            if (opcao < 1 || opcao > 2) {
                System.out.println("Opção inválida! Digite um número entre 1 e 2.");
                System.out.print("Opção Selecionada: ");
                continue;
            }

            System.out.println("-----------------------------------------");

            persistenciaController.escolherPersistencia(opcao);
        }
    }
}
