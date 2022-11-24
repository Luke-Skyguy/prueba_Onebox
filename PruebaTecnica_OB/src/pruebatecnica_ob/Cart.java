package pruebatecnica_ob;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Moth
 */
public class Cart { 
   //Constructors for the cart
    private int id;
    private List<Product> products;

    public Cart(int id) {
        this.id = id;
        this.products = new ArrayList<>();

    }

    public Cart(int id, List<Product> product) {
        this.id = id;
        this.products = product;
    }

    //Methods to add product
    public void addProduct(Product productToAdd) {
        products.add(productToAdd);
    }

    public void addProduct(List<Product> productToAdd) {
        for (Product prod : productToAdd) {
            addProduct(prod);
        }
    }

    //Methods to delete product
    public void dropProduct(int productId) {
        products.remove(getProductById(productId));
    }

    public void dropProduct(int[] productsId) {
        for (int prodId : productsId) {
            dropProduct(prodId);
        }
    }

    //Getters
    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int idProduct) {
        Product prod = null;
        for (Product searchedProduct : products) {
            if (searchedProduct.getId() == (idProduct)) {
                prod = searchedProduct;
            }
        }
        return prod;
    }

}
