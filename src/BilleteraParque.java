public class BilleteraParque {
    private int tickets;
    private boolean festivo;

    public BilleteraParque(int tickets, boolean festivo){
        tickets = 0;
        festivo = false;
    }

    //Getters

    public int getTickets(){
        return tickets;
    }

    public boolean getFestivo(){
        return festivo;
    }

    public void setTickets(int tickets){
        this.tickets = tickets;
    }

    public void  setFestivo(boolean festivo){
        this.festivo = festivo;
    }

    public void agregarTickets(int tickets){
        if (tickets >= 0){
            this.tickets += tickets;
        }
    }

    public boolean removerTickets(int tickets){
        if (tickets >= 0){
            this.tickets -= tickets;
            return true;
        }
        else{
            return false;
        }
    }


}
