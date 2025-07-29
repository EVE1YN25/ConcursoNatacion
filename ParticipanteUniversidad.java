// ParticipanteUniversidad.java
public class ParticipanteUniversidad extends Participante {
    private String nombreUniversidad;

    // Constructor
    public ParticipanteUniversidad(String nombre, int edad, String genero, String condicionSalud, String nombreUniversidad) {
        // Llama al constructor de la clase base Participante
        super(nombre, edad, genero, condicionSalud, "universidad"); // "universidad" es el tipo de entidad fijo para esta subclase
        this.nombreUniversidad = nombreUniversidad;
    }

    // Getter
    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    // Setter
    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    /**
     * Sobrescribe el método getInfo() para incluir la información específica de la universidad.
     * @return Una cadena con la información completa del participante de la universidad.
     */
    @Override
    public String getInfo() {
        return "Tipo: Universidad\n" +
               "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + "\n" +
               "Género: " + getGenero() + "\n" +
               "Condición de Salud: " + getCondicionSalud() + "\n" +
               "Nombre de la Universidad: " + nombreUniversidad + "\n" +
               "Puede Participar: " + (puedeParticipar() ? "Sí" : "No");
    }
}
