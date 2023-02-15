import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Rakblad", 14, 1);
        Product product2 = new Product("Gräsklippare", 500, 5);

        // Product product3 = new Product("Låda", 50, 5);
        // Product product4 = new Product("Rep", 40, 5);

        Warehouse warehouse = new Warehouse("Super-Warehouse", "Superway 5B", new ArrayList<Product>());
        //warehouse.createProduct(product1);
        //SingletonWriter.getInstance().read("src/file.cfg");
        warehouse.getProducts("Robot");
        // warehouse.getLager().add(product2);
        // warehouse.getLager().add(product3);
        // warehouse.getLager().add(product4);


        Freight freight1 = new Freight();
        Freight freight2 = new Freight();

    }
}