package Aula6;

public class TesteEstatico {
    private int id;
    private static int idEstatico;
    private static final double PI = 3.14;

    public int getId() {
        return id;
    }

    public static int getIdEstatico() {
        return idEstatico;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setIdEstatico(int idEstatico) {
        TesteEstatico.idEstatico = idEstatico;
    }
}
