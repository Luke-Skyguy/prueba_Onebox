package pruebatecnica_ob;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Moth
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ttl config for 10 minutes
        java.security.Security.setProperty("networkaddress.cache.ttl", "10");

        Product milk = new Product(1, "milk", 5);
        Product oats = new Product(2, "oats", 3);
        Product cheese = new Product(3, "cheese", 4);
        List<Product> dairyProducts = new ArrayList(List.of(milk, cheese));

        Cart cart = new Cart(1);
        //Insert single product
        cart.addProduct(oats);
        //Insert list of products
        cart.addProduct(dairyProducts);

        System.out.println("-------Once te products are created--------");
        System.out.println("-------------------------------------------");

        //Print all products
        System.out.println(cart.getProducts());
        //Print a product by id
        System.out.println(cart.getProductById(1));
        
        System.out.println("\n-------Once te products are deleted--------");
        System.out.println("-------------------------------------------");

        //delete list of products
        int[] idsToDelete = {1, 2};
        cart.dropProduct(idsToDelete);

        //show current products
        System.out.println(cart.getProducts());

        //search a deleted product
        System.out.println(cart.getProductById(1));

    }

}
