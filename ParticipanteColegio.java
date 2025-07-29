
// ParticipanteColegio.java
public class ParticipanteColegio extends Participante {
    private String nombreColegio;

    // Constructor
    public ParticipanteColegio(String nombre, int edad, String genero, String condicionSalud, String nombreColegio) {
        // Llama al constructor de la clase base Participante
        super(nombre, edad, genero, condicionSalud, "colegio"); // "colegio" es el tipo de entidad fijo para esta subclase
        this.nombreColegio = nombreColegio;
    }

    // Getter
    public String getNombreColegio() {
        return nombreColegio;
    }

    // Setter
    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }

    /**
     * Sobrescribe el método getInfo() para incluir la información específica del colegio.
     * @return Una cadena con la información completa del participante del colegio.
     */
    @Override
    public String getInfo() {
        return "Tipo: Colegio\n" +
               "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + "\n" +
               "Género: " + getGenero() + "\n" +
               "Condición de Salud: " + getCondicionSalud() + "\n" +
               "Nombre del Colegio: " + nombreColegio + "\n" +
               "Puede Participar: " + (puedeParticipar() ? "Sí" : "No");
    }
}