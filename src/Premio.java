public class Premio {

    private String titulo;
    private int costoBase;

    public Premio(String titulo, int costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCostoBase() {
        return costoBase;
    }

    public int calcularCostoFinal(boolean diaFestivo) {
        if (diaFestivo) {
            return costoBase / 2;
        }
        return costoBase;
    }
}
