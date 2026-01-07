package Repository;

import Model.Pet;
import Service.PetService;

import java.io.*;
import java.time.format.DateTimeFormatter;

public class TxtPetRepository implements PetRepository {

    @Override
    public void cadastrar(Pet pet) {
        int aux = 1;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmm");
        String[] petArray = new String[7];
        String nomeFormatado = pet.getNome().replace(" ", "").toUpperCase();
        String horaCadastro = pet.getDataCadastro().format(formatter);
        String idadeFormatado = pet.getIdade() + " anos";
        String pesoFormatado = pet.getPeso() + "kg";
        String nomeArquivo = horaCadastro + "-" + nomeFormatado + ".txt";
        petArray[0] = pet.getNome();
        petArray[1] = String.valueOf(pet.getTIPO());
        petArray[2] = String.valueOf(pet.getSexo());
        petArray[3] = pet.getEndereco();
        petArray[4] = idadeFormatado;
        petArray[5] = pesoFormatado;
        petArray[6] = pet.getRaca();

        try (FileWriter fw = new FileWriter("src/Data/pets/" + nomeArquivo);
             BufferedWriter bw = new BufferedWriter(fw)) {
            for (String s : petArray) {
                bw.write(aux++ + " - " + s);
                bw.newLine();
            }
            System.out.println("\nPet Cadastrado Com Sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar() {
        File file = new File("src/Data/pets/");
        try {
            file.delete();
            System.out.println("\nPet Deletado Com Sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
