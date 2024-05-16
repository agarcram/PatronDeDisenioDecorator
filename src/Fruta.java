public class Fruta extends DecoradorPastel{
    public Fruta(Pastel pastel) {
        super(pastel);
    }

    @Override
    public void hornear() {
        super.hornear();
        System.out.println("Añadiendo frutas al pastel...");
    }
}
