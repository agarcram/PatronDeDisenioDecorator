//La clase abstracta indica que no se debe crear una instancia directa de esta clase.

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
