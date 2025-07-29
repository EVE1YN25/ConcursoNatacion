// ParticipanteSindicato.java
public class ParticipanteSindicato extends Participante {
    private String tipoSindicato;

    // Constructor
    public ParticipanteSindicato(String nombre, int edad, String genero, String condicionSalud, String tipoSindicato) {
        // Llama al constructor de la clase base Participante
        super(nombre, edad, genero, condicionSalud, "sindicato"); // "sindicato" es el tipo de entidad fijo para esta subclase
        this.tipoSindicato = tipoSindicato;
    }

    // Getter
    public String getTipoSindicato() {
        return tipoSindicato;
    }

    // Setter
    public void setTipoSindicato(String tipoSindicato) {
        this.tipoSindicato = tipoSindicato;
    }

    /**
     * Sobrescribe el método getInfo() para incluir la información específica del sindicato.
     * @return Una cadena con la información completa del participante del sindicato.
     */
    @Override
    public String getInfo() {
        return "Tipo: Sindicato\n" +
               "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + "\n" +
               "Género: " + getGenero() + "\n" +
               "Condición de Salud: " + getCondicionSalud() + "\n" +
               "Tipo de Sindicato: " + tipoSindicato + "\n" +
               "Puede Participar: " + (puedeParticipar() ? "Sí" : "No");
    }
}