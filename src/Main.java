public abstract class Main {
    private static Edificio[] edificios = new Edificio[5];

    public static void main(String[] args) {
        try {
            edificios = new Edificio[]{new Polideportivo(2, 3), new Polideportivo(5, 8), new Polideportivo(1, 5), new Edificio_Oficinas(2, 4), new Edificio_Oficinas(7, 10)};
        } catch (ConstruccionesException e) {
            throw new RuntimeException(e);
        }

        for (Edificio e : edificios) {
            System.out.println(e);
        }
    }
}