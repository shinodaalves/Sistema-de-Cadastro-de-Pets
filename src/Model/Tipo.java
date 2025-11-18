package Model;

public enum Tipo {
    CACHORRO,
    GATO;

    public static Tipo fromString(String valor) {
        if (valor == null) return null;

        String v = valor.trim().toUpperCase();
        boolean isValido;

        switch (v) {
            case "CACHORRO":
                return CACHORRO;
            case "GATO":
                return GATO;
            default:
                return null;
        }
    }
}
