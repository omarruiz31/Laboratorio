public class BilleteraParque {
    private int saldoTickets;
    private static boolean diaFestivo = false;

    public BilleteraParque() {
        this.saldoTickets = 0;
    }

    public BilleteraParque(int saldoTickets) {
        this.saldoTickets = saldoTickets;
    }

    public int getTickets() {
        return saldoTickets;
    }

    public void setTickets(int saldoTickets) {
        if (saldoTickets >= 0) {
            this.saldoTickets = saldoTickets;
        }
    }

    public void establecerTickets(int saldoTickets) {
        setTickets(saldoTickets);
    }

    public static boolean isFestivo() {
        return diaFestivo;
    }

    public static void cambiarFestivo() {
        diaFestivo = !diaFestivo;
    }

    public void agregarTickets(int cantidad) {
        this.saldoTickets += cantidad;
    }

    public boolean removerTickets(int cantidad) {
        if (cantidad > 0 && this.saldoTickets >= cantidad) {
            this.saldoTickets -= cantidad;
            return true;
        }
        return false;
    }

    public boolean comprarPremio(Premio premio) {
        int costo = premio.calcularCostoFinal(diaFestivo);

        if (this.saldoTickets >= costo) {
            this.saldoTickets -= costo;
            System.out.println("Has comprado: " + premio.getTitulo() + " por " + costo + " tickets.");
            System.out.println("Tickets restantes: " + this.saldoTickets);
            return true;
        } else {
            System.out.println("No tienes suficientes tickets para este premio.");
            return false;
        }
    }
}
