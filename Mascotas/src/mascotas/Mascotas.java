public class Mascotas {
    // Atributos privados (encapsulamiento)
    private String nombre;
    private String especie;
    private int edad;
    private boolean vacunado;

    // Constructor
    public Mascotas(String nombre, String especie, int edad, boolean vacunado) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.vacunado = vacunado;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    // Método abstracto (abstracción de comportamiento)
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Vacunado: " + (vacunado ? "Sí" : "No"));
        System.out.println("-------------------------");
    }
}
