public class Veterinaria {
    public static void main(String[] args) {
        // Crear objetos de tipo Mascota
        Mascotas mascota1 = new Mascotas("KIRA", "Perro", 5, true);
        Mascotas mascota2 = new Mascotas("pelusa", "Gato", 3, false);
        Mascotas mascota3 = new Mascotas("Tai lung", "Gato", 2, true);

        // Mostrar información de cada mascota
        mascota1.mostrarInformacion();
        mascota2.mostrarInformacion();
        mascota3.mostrarInformacion();
    }
}
