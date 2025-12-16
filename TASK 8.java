public class Product {
    void price(){
        System.out.println("Product price is calculated");
    }
    void discount(){
        System.out.println("Product discount is calculated");
    }
}
public class Product {
    void price(){
        System.out.println("Product price is calculated");
    }
    void discount(){
        System.out.println("Product discount is calculated");
    }
}
class Clothing extends Cosmetics {
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
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.price();
        p1.discount();
        Cosmetics c2 = new Cosmetics();
        c2.Lipstick();
        Clothing c3 = new Clothing();
        c3.kurti();
    }
}
