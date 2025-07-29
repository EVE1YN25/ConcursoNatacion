// Participante.java
public abstract class Participante {
    private String nombre; //
    private int edad; //
    private String genero; //
    private String condicionSalud; // "buena" o "no"
    private String tipoEntidad; // "colegio", "universidad", "empresa publica", "empresa privada", "sindicato"

    // Constructor
    public Participante(String nombre, int edad, String genero, String condicionSalud, String tipoEntidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.condicionSalud = condicionSalud;
        this.tipoEntidad = tipoEntidad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getCondicionSalud() {
        return condicionSalud;
    }

    public String getTipoEntidad() {
        return tipoEntidad;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCondicionSalud(String condicionSalud) {
        this.condicionSalud = condicionSalud;
    }

    public void setTipoEntidad(String tipoEntidad) {
        this.tipoEntidad = tipoEntidad;
    }

    /**
     * Valida si el participante cumple con los requisitos de edad y condición de salud.
     * Requisitos: Edad entre 18 y 25 años, y condición de salud "buena".
     * @return true si puede participar, false en caso contrario.
     */
    public boolean puedeParticipar() {
        return (this.edad >= 18 && this.edad <= 25 && this.condicionSalud.equalsIgnoreCase("buena")); //
    }

    /**
     * Método abstracto para obtener la información completa del participante.
     * Cada subclase deberá implementar este método.
     * @return Una cadena con la información del participante.
     */
    public abstract String getInfo();
}