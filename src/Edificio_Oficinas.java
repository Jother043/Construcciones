public class Edificio_Oficinas implements Edificio{
    private int superficieOficinas;
    private int numeroOficianas;

    public Edificio_Oficinas(int superficieOficinas, int numeroOficianas) throws ConstruccionesException {
        this.setSuperficieOficinas(superficieOficinas);
        this.numeroOficianas = numeroOficianas;
    }

    public void setSuperficieOficinas(int superficieOficinas) throws ConstruccionesException {
        if(this.superficieOficinas < 0){
            throw new ConstruccionesException("La superficie del edificio de oficinas no puede ser 0. ");
        }
        this.superficieOficinas = superficieOficinas;
    }

    @Override
    public double getSuperficie() {
        return this.superficieOficinas;
    }

    public int getNumeroOficianas() {
        return numeroOficianas;
    }

    @Override
    public String toString() {
        return "Edificio_Oficinas{" +
                "superficieOficinas=" + superficieOficinas +
                ", numeroOficianas=" + numeroOficianas +
                '}';
    }
}
