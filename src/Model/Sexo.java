package Model;

public enum Sexo {
    MACHO,
    FEMEA;

    public static Sexo fromString(String valor) {
        if (valor == null) return null;

        String v = valor.trim().toUpperCase();

        switch (v) {
            case "MACHO":
                return MACHO;
            case "FEMEA":
                return FEMEA;
            default:
                throw new IllegalArgumentException("Tipo inválido: " + valor);
        }
    }

}
