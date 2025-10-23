public class BilleteraParque {
    private int tickets;
    private static boolean festivo;

    public BilleteraParque(){
        this.tickets = 0;
    }

    public BilleteraParque(int tickets){
        this.tickets = tickets;
    }

    //Getters

    public int getTickets(){
        return tickets;
    }

    public static boolean getFestivo(){
        return festivo;
    }

    public void setTickets(int tickets){
        if (tickets > 0){
            this.tickets = tickets;
        }
    }

    public static void  setFestivo(){
        festivo = true;
    }

    public void agregarTickets(int tickets){
        if (tickets >= 0){
            this.tickets += tickets;
        }
    }

    public boolean removerTickets(int tickets){
        if (tickets >= 0 && this.tickets >= tickets){
            this.tickets -= tickets;
            return true;
        }
        else{
            return false;
        }
    }


}
