import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BilleteraParque billera = new BilleteraParque(100);
        Scanner scanner = new Scanner(System.in);
            System.out.println("==Administrador de billeteras para parques temáticos== \n 1. Agregar tickets\n 2. Establecer tickets\n 3. Comprar premio\n 4. Establecer festivo\n 5. Salir");
            System.out.println("tu billetera tiene " + billera.getTickets());

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cuantos boletos quieres agregar");
                    billera.agregarTickets(scanner.nextInt());
                    System.out.println("Ahora tienes " + billera.getTickets() + " tickets");
                    break;

                case 2:
                    System.out.println("Cuantos tickets quieres tener");
                    billera.setTickets(scanner.nextInt());
                    System.out.println("ahora tienes " + billera.getTickets() + "tickets");
                    break;

                case 3:
                    System.out.println("1. Camiseta (150 tickets)\n 2. Sombrero (350 tickets)\n 3. Tenis (600 tickets)");
                    System.out.println("Que premio deseas comprar ");
                    int premio =  scanner.nextInt();
                    break;

                case 4:
                    System.out.println("Establece el festivo");


                    break;

                case 5:


                default:
                    System.out.println("No valido, selecciona otra opcion");
            }


    }
}
