package Controller;

import Model.Pet;
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
        String[] respostas = formularioController.lerFormulario(sc);
        respostas = formularioController.respostas;
        String nome = respostas[0];
        Tipo tipo = Tipo.valueOf(respostas[1].toUpperCase());
        Sexo sexo = Sexo.valueOf(respostas[2].toUpperCase());
        String endereco = respostas[3];
        double idade = Double.parseDouble(respostas[4]);
        double peso = Double.parseDouble(respostas[5]);
        String raca = respostas[6];
        for (String resposta : respostas) {
            System.out.println(resposta);
        }

        petService.cadastrarPet(nome, tipo, sexo, endereco, idade, peso, raca);

    }
}
