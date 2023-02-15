import java.util.ArrayList;
import java.util.Arrays;

public class Warehouse {

    private long id;
    private String name;
    private boolean kapacitet;
    private String adress;
    private int saldo = 100;


    private ArrayList<Product> lager;

    public Warehouse() {
    }

    public Warehouse(String name, String adress, ArrayList<Product> lager) {
        this.name = name;
        this.kapacitet = kapacitet;
        this.adress = adress;
        this.lager = lager;
    }

    public Warehouse(long id, String name, String adress, ArrayList<Product> lager) {
        this.id = id;
        this.name = name;
        this.kapacitet = kapacitet;
        this.adress = adress;
        this.lager = lager;
    }

    public void popSaldo(int pop){
        this.saldo = this.saldo - pop;
    }

    public void createProduct(Product product){
        lager.add(product);
        //TODO add to file the product

        SingletonWriter.getInstance().write("src/file.cfg",  product.getNamn());
    }

    public void getProducts(String product){
        String fullText = SingletonWriter.getInstance().getFullList("src/file.cfg");
        String[] sentence = fullText.split("\n");
        boolean found = false;
        for (int i = 0; i < sentence.length; i++) {
            String text = sentence[i];
            String[] word = text.split(" ");
            int nr = Integer.parseInt(word[0]);
            String productName = word[1];
            if (productName.equals(product)) {
                System.out.println("There is " + nr + " " + product + " in stock");
                found = true;
                break;
            }
        }
        if(found != true){
            System.out.println("Not found.");
        }

    }

    public void getAmount(){
        System.out.println(lager.size());
    }

    public long getId() {
        return id;
    }

    public int getSaldo() {
        if(saldo == 0){
            System.out.println("noll i saldo");
        }
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isKapacitet() {
        return kapacitet;
    }

    public void setKapacitet(boolean kapacitet) {
        this.kapacitet = kapacitet;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public ArrayList<Product> getLager() {
        return lager;
    }

    public void setLager(ArrayList<Product> lager) {
        this.lager = lager;
    }
}
