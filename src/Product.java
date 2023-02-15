public class Product {
    private long id;
    private String namn;
    private double pris;
    private int antal;

    public Product() {
    }

    public Product(long id, String namn, double pris, int antal) {
        this.id = id;
        this.namn = namn;
        this.pris = pris;
        this.antal = antal;
    }

    public Product(String namn, double pris, int antal) {
        this.namn = namn;
        this.pris = pris;
        this.antal = antal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    @Override
    public String toString() {
        return id + ", " + namn + ", " + pris + ", " + antal;
    }
}
