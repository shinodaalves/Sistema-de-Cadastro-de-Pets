package Controller;

import Model.Sexo;
import Model.Tipo;
import Service.PetService;

import java.util.Scanner;

public class PetCadastroController {
    private final PetService petService;
    private final FormularioController formularioController;

    public PetCadastroController(PetService petService, FormularioController formularioController) {
        this.petService = petService;
        this.formularioController = formularioController;
    }

    public void cadastrarPet(Scanner sc) {
        String[] respostas = formularioController.lerRespostas(sc);

        String nome = respostas[0];
        Tipo tipo = Tipo.valueOf(respostas[1].toUpperCase());
        Sexo sexo = Sexo.valueOf(respostas[2].toUpperCase());
        String endereco = respostas[3];
        int idade = Integer.parseInt(respostas[4]);
        int peso = Integer.parseInt(respostas[5]);
        String raca = respostas[6];

        petService.cadastrarPet(nome, tipo, sexo, endereco, idade, peso, raca);

    }
}
