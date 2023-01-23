public class Polideportivo implements Edificio, InstalacionDeportiva {

    private int superficieOficinas;
    private int tipoDeInstalacion;

    public Polideportivo(int superficieOficinas, int tipoDeInstalacion) throws ConstruccionesException {
        this.setSuperficieOficinas(superficieOficinas);
        this.setTipoDeInstalacion(tipoDeInstalacion);
    }

    public void setSuperficieOficinas(int superficieOficinas) throws ConstruccionesException {
        if (this.superficieOficinas < 0) {
            throw new ConstruccionesException("La superficie del edificio del polideportivo no puede ser 0. ");
        }
        this.superficieOficinas = superficieOficinas;
    }

    public void setTipoDeInstalacion(int tipoDeInstalacion) throws ConstruccionesException {
        if (this.tipoDeInstalacion < 0) {
            throw new ConstruccionesException(" el tipo no puede ser menor a 0");
        }
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    @Override
    public double getSuperficie() {
        return this.superficieOficinas;
    }

    @Override
    public int getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }


    @Override
    public String toString() {
        return "Polideportivo{" +
                "superficieOficinas=" + superficieOficinas +
                ", tipoDeInstalacion=" + tipoDeInstalacion +
                '}';
    }
}
