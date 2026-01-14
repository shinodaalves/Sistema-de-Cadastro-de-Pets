package Repository;

import Repository.jdbc.DBPetRepository;
import java.util.Scanner;

public class PetRepositoryFactory {

    public static PetRepository escolherImplementacao(int opcao) {
        if (opcao == 1) {
            System.out.println("Modo Selecionado: Banco de Dados");
            return new DBPetRepository();
        } else {
            System.out.println("Modo Selecionado: Arquivo de Texto");
            return new TxtPetRepository();
        }
    }

    public static PetRepository escolherPeloConsole(Scanner sc) {
        System.out.println("Selecione a Implementação Inicial:");
        System.out.println("1. Banco de Dados | 2. Arquivo de Texto");
        System.out.print("Opção: ");

        String entrada = sc.nextLine();
        int opcao;

        if (entrada.equals("1")) {
            opcao = 1;
        } else {
            opcao = 2;
        }

        return escolherImplementacao(opcao);
    }
}