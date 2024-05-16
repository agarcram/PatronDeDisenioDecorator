public class Main {
    public static void main(String[] args) {
        // Crear un pastel básico
        Pastel pastel = new PastelBasico();

        // Añadir glaseado al pastel
        pastel = new Glaseado(pastel);

        // Añadir frutas al pastel
        pastel = new Fruta(pastel);

        // Hornear el pastel con glaseado y frutas
        pastel.hornear();
    }
}