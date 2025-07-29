// ParticipanteEmpresa.java
public class ParticipanteEmpresa extends Participante {
    private String nombreEmpresa;
    private boolean esPublica; // true si es empresa pública, false si es privada

    // Constructor
    public ParticipanteEmpresa(String nombre, int edad, String genero, String condicionSalud, String nombreEmpresa, boolean esPublica) {
        // Determina el tipo de entidad basado en si es pública o privada
        super(nombre, edad, genero, condicionSalud, esPublica ? "empresa publica" : "empresa privada");
        this.nombreEmpresa = nombreEmpresa;
        this.esPublica = esPublica;
    }

    // Getters
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public boolean isEsPublica() {
        return esPublica;
    }

    // Setters
    public void setEsPublica(boolean esPublica) {
        this.esPublica = esPublica;
        // Actualiza el tipo de entidad en la clase base si cambia el estado pública/privada
        super.setTipoEntidad(esPublica ? "empresa publica" : "empresa privada");
    }

    /**
     * Sobrescribe el método getInfo() para incluir la información específica de la empresa.
     * @return Una cadena con la información completa del participante de la empresa.
     */
    @Override
    public String getInfo() {
        return "Tipo: Empresa " + (esPublica ? "Pública" : "Privada") + "\n" +
               "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + "\n" +
               "Género: " + getGenero() + "\n" +
               "Condición de Salud: + " + getCondicionSalud() + "\n" +
               "Nombre de la Empresa: " + nombreEmpresa + "\n" +
               "Puede Participar: " + (puedeParticipar() ? "Sí" : "No");
    }
}
