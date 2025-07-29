// ConcursoNatacionApp.java
import java.util.ArrayList; // Necesario para usar ArrayList
import java.util.InputMismatchException; // Necesario para manejar errores de entrada de tipo
import java.util.Scanner; // Necesario para leer la entrada del usuario

public class ConcursoNatacionApp {

    // Lista para almacenar todos los participantes registrados
    private static ArrayList<Participante> listaParticipantes = new ArrayList<>();
    // Objeto Scanner para leer la entrada del usuario
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Cargar algunos participantes de ejemplo al inicio para pruebas
        cargarDatosIniciales();

        int opcion;
        do {
            mostrarMenu();
            try {
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea después de leer el entero

                switch (opcion) {
                    case 1:
                        registrarParticipante();
                        break;
                    case 2:
                        verListaParticipantes();
                        break;
                    case 3:
                        verParticipantesElegibles();
                        break;
                    case 4:
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                }
                System.out.println("\n------------------------------------\n"); // Separador
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número para la opción.");
                scanner.nextLine(); // Limpiar el buffer del scanner
                opcion = 0; // Para que el bucle continúe
            }
        } while (opcion != 4);

        scanner.close(); // Cerrar el scanner al finalizar el programa
    }

    /**
     * Muestra el menú principal de opciones al usuario.
     */
    private static void mostrarMenu() {
        System.out.println("----- Menú del Concurso de Natación -----");
        System.out.println("1. Registrar nuevo participante");
        System.out.println("2. Ver la lista de participantes registrados");
        System.out.println("3. Ver solo los participantes que pueden participar");
        System.out.println("4. Salir");
    }

    /**
     * Permite al usuario registrar un nuevo participante solicitando sus datos.
     */
    private static void registrarParticipante() {
        System.out.println("\n--- Registrar Nuevo Participante ---");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        int edad;
        while (true) {
            try {
                System.out.print("Edad (18-25): ");
                edad = scanner.nextInt();
                if (edad >= 18 && edad <= 25) { // Validar edad entre 18 y 25 años
                    break;
                } else {
                    System.out.println("Edad fuera del rango permitido (18-25).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número para la edad.");
                scanner.nextLine(); // Limpiar el buffer
            } finally {
                scanner.nextLine(); // Consumir el salto de línea pendiente
            }
        }

        System.out.print("Género (Masculino/Femenino/Otro): ");
        String genero = scanner.nextLine();

        String condicionSalud;
        while (true) {
            System.out.print("Condición de salud (buena/no): ");
            condicionSalud = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para facilitar la validación
            if (condicionSalud.equals("buena") || condicionSalud.equals("no")) { // Validar condición de salud
                break;
            } else {
                System.out.println("Condición de salud inválida. Por favor, ingrese 'buena' o 'no'.");
            }
        }

        System.out.println("Seleccione el tipo de entidad:");
        System.out.println("1. Colegio");
        System.out.println("2. Universidad");
        System.out.println("3. Empresa");
        System.out.println("4. Sindicato");

        int tipoEntidadOpcion;
        Participante nuevoParticipante = null; // Inicializar a null

        while (true) {
            try {
                System.out.print("Opción de entidad: ");
                tipoEntidadOpcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                switch (tipoEntidadOpcion) {
                    case 1:
                        System.out.print("Nombre del Colegio: ");
                        String nombreColegio = scanner.nextLine();
                        nuevoParticipante = new ParticipanteColegio(nombre, edad, genero, condicionSalud, nombreColegio);
                        break;
                    case 2:
                        System.out.print("Nombre de la Universidad: ");
                        String nombreUniversidad = scanner.nextLine();
                        nuevoParticipante = new ParticipanteUniversidad(nombre, edad, genero, condicionSalud, nombreUniversidad);
                        break;
                    case 3:
                        System.out.print("Nombre de la Empresa: ");
                        String nombreEmpresa = scanner.nextLine();
                        System.out.print("¿Es empresa pública? (sí/no): ");
                        boolean esPublica = scanner.nextLine().equalsIgnoreCase("sí");
                        nuevoParticipante = new ParticipanteEmpresa(nombre, edad, genero, condicionSalud, nombreEmpresa, esPublica);
                        break;
                    case 4:
                        System.out.print("Tipo de Sindicato: ");
                        String tipoSindicato = scanner.nextLine();
                        nuevoParticipante = new ParticipanteSindicato(nombre, edad, genero, condicionSalud, tipoSindicato);
                        break;
                    default:
                        System.out.println("Opción de entidad no válida. Intente de nuevo.");
                        continue; // Vuelve a pedir la opción
                }
                break; // Sale del bucle si la opción es válida
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número para la opción de entidad.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }

        if (nuevoParticipante != null) { // Si se creó un participante
            listaParticipantes.add(nuevoParticipante); // Añadir a la lista de participantes
            System.out.println("Participante registrado exitosamente.");
        } else {
            System.out.println("Error al registrar el participante.");
        }
    }

    /**
     * Muestra la información de todos los participantes registrados.
     */
    private static void verListaParticipantes() {
        System.out.println("\n--- Lista de Participantes Registrados ---");
        if (listaParticipantes.isEmpty()) {
            System.out.println("No hay participantes registrados aún.");
            return;
        }
        for (int i = 0; i < listaParticipantes.size(); i++) {
            System.out.println("----- Participante #" + (i + 1) + " -----");
            System.out.println(listaParticipantes.get(i).getInfo()); // Llama al getInfo() de la subclase correspondiente
            System.out.println(); // Salto de línea para separar
        }
    }

    /**
     * Muestra solo los participantes que cumplen con los requisitos de edad y salud.
     */
    private static void verParticipantesElegibles() {
        System.out.println("\n--- Participantes que PUEDEN PARTICIPAR ---");
        boolean hayElegibles = false;
        for (Participante p : listaParticipantes) {
            if (p.puedeParticipar()) {
                System.out.println("----- Participante Elegible -----");
                System.out.println(p.getInfo()); // Mostrar la información completa del participante elegible
                System.out.println();
                hayElegibles = true; // Se encontró al menos un elegible
            }
        }
        if (!hayElegibles) {
            System.out.println("No hay participantes elegibles registrados aún.");
        }
    }

    /**
     * Carga algunos datos de participantes iniciales para facilitar las pruebas.
     * Incluye al menos dos participantes por tipo de entidad, algunos elegibles y otros no.
     */
    private static void cargarDatosIniciales() {
        listaParticipantes.add(new ParticipanteColegio("Ana Garcia", 19, "Femenino", "buena", "Colegio Nacional Mejía"));
        listaParticipantes.add(new ParticipanteColegio("Juan Perez", 17, "Masculino", "buena", "Colegio Benalcázar")); // No elegible por edad
        listaParticipantes.add(new ParticipanteUniversidad("Maria Lopez", 22, "Femenino", "buena", "Universidad Central del Ecuador"));
        listaParticipantes.add(new ParticipanteUniversidad("Carlos Sanchez", 26, "Masculino", "buena", "Escuela Politécnica Nacional")); // No elegible por edad
        listaParticipantes.add(new ParticipanteEmpresa("Laura Gomez", 20, "Femenino", "buena", "Microsoft Ecuador", true)); // Empresa pública
        listaParticipantes.add(new ParticipanteEmpresa("Pedro Ruiz", 23, "Masculino", "no", "Amazon Web Services", false)); // No elegible por salud
        listaParticipantes.add(new ParticipanteSindicato("Sofía Torres", 21, "Femenino", "buena", "Sindicato de Trabajadores Petroleros"));
        listaParticipantes.add(new ParticipanteSindicato("David Herrera", 18, "Masculino", "buena", "Sindicato de Empleados Públicos"));
        System.out.println("Datos de ejemplo cargados.");
    }
}
