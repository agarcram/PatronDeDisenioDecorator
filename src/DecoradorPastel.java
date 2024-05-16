abstract public class DecoradorPastel implements Pastel{
    private Pastel pastel;

    public DecoradorPastel(Pastel pastel) {
        this.pastel = pastel;
    }
    @Override
    public void hornear() {
        pastel.hornear();
    }
}
