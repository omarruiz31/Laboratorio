import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BilleteraParque billetera = new BilleteraParque(100);

        Premio camiseta = new Premio("Camiseta", 150);
        Premio sombrero = new Premio("Sombrero", 350);
        Premio tenis = new Premio("Tenis", 600);

        int opcion;

        do {
            System.out.println(
                    "\n--- Sistema de gestión del parque ---\n" +
                            "1. Agregar tickets\n" +
                            "2. Establecer tickets\n" +
                            "3. Comprar premio\n" +
                            "4. Cambiar día festivo (actual: " + (BilleteraParque.isFestivo() ? "Sí" : "No") + ")\n" +
                            "5. Salir\n" +
                            "Tickets actuales: " + billetera.getTickets() + "\n" +
                            "Seleccione una opción: "
            );

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de tickets a agregar: ");
                    int cantidad = sc.nextInt();
                    billetera.agregarTickets(cantidad);
                    System.out.println("Tickets actualizados: " + billetera.getTickets());
                    break;

                case 2:
                    System.out.print("Ingrese el número de tickets a establecer: ");
                    int nuevosTickets = sc.nextInt();
                    billetera.establecerTickets(nuevosTickets);
                    System.out.println("Tickets establecidos en: " + billetera.getTickets());
                    break;

                case 3:
                    System.out.println(
                            "\nPremios disponibles:\n" +
                                    "1. " + camiseta.getTitulo() + " (" + camiseta.calcularCostoFinal(BilleteraParque.isFestivo()) + " tickets)\n" +
                                    "2. " + sombrero.getTitulo() + " (" + sombrero.calcularCostoFinal(BilleteraParque.isFestivo()) + " tickets)\n" +
                                    "3. " + tenis.getTitulo() + " (" + tenis.calcularCostoFinal(BilleteraParque.isFestivo()) + " tickets)\n" +
                                    "Seleccione el premio que desea comprar: "
                    );
                    int opcionPremio = sc.nextInt();

                    switch (opcionPremio) {
                        case 1 -> billetera.comprarPremio(camiseta);
                        case 2 -> billetera.comprarPremio(sombrero);
                        case 3 -> billetera.comprarPremio(tenis);
                        default -> System.out.println("Opción no válida.");
                    }
                    break;

                case 4:
                    BilleteraParque.cambiarFestivo();
                    System.out.println(BilleteraParque.isFestivo()
                            ? "Se ha activado el modo festivo. Los precios están a mitad."
                            : "Modo festivo desactivado. Los precios vuelven a la normalidad.");
                    break;

                case 5:
                    System.out.println("Saliendo...!");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
