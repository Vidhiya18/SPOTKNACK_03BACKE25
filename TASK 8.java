public class Product { // Creating the parent class
    void price(){
        System.out.println("Product price is calculated");
    }
    void discount(){
        System.out.println("Product discount is calculated");
    }
}
public class Product { // Creating the child classs
    void price(){
        System.out.println("Product price is calculated");
    }
    void discount(){
        System.out.println("Product discount is calculated");
    }
}
class Clothing extends Cosmetics { // Creating the sub class of child
    void price() {
        System.out.println("product price is calculated");
    }
    void discount() {
        System.out.println("product discount is calculated");
    }
    void kurti() {
        System.out.println("product 2 is kurti" +  "The price of the kurti is:560");
    }
}
// Main class
public class Main {
    public static void main(String[] args) { // Main method
      //Creating objects for all classes
        Clothing c3 = new Clothing();
        c3.kurti();
        Cosmetics c2 = new Cosmetics();
        c2.Lipstick();
        Product p1 = new Product();
        p1.price();
        p1.discount();
    }
}
