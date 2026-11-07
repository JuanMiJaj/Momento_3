
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String[] referencias = {"Chaqueta", "Short", "Camisa", null, null};
        Scanner leer = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Listar Referencias");
            System.out.println("2. Buscar Referencia");
            System.out.println("3. Agregar Referencia");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            if (leer.hasNextInt()) {
                opcion = leer.nextInt();
                leer.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("-----Referencias-----");
                        for (String prenda : referencias) {
                            if (prenda != null) {
                                System.out.println(prenda);
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Copie la prenda que desea encontrar");
                        String buscar = leer.nextLine();
                        boolean encontrado = nombreFuncion(referencias, buscar);
                        if (encontrado) {
                            System.out.println("El Articulo existe");
                        } else {
                            System.out.println("El articulo no existe");
                        }
                        break;
                    case 3:
                        System.out.println("Agregue prenda");
                        String agregar = leer.nextLine();
                        boolean agregado = false;
                        for (int i = 0; i < referencias.length; i++) {
                            if (referencias[i] == null) {
                                referencias[i] = agregar;
                                agregado = true;
                                System.out.println("La prenda: " + agregar + " se agrego correctamente");
                                break;
                            }
                        }
                        if (!agregado) {
                            System.out.println("No hay espacio en el inventario");
                        }
                        break;
                    case 4:
                        System.out.println("Chao pescado");
                        break;
                    default:
                        System.out.println("Que solo hay 4 opciones gva");
                        break;
                }
            } else {

                System.out.println("Don tonto no sabe que es un numero?");
                leer.nextLine();
            }

        } while (opcion != 4);

        leer.close();
    }

    public static boolean nombreFuncion(String[] referencias, String buscar) {
        for (int i = 0; i < referencias.length; i++) {
            if (referencias[i] != null) {
                if (referencias[i].equals(buscar)) {
                    return true;
                }
            }
        }
        return false;
    }

}
