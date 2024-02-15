package JavaHomeworks;

public class ProductTester {
    public static void main(String[] args) {





        //2.Create a Product Class for an Inventory System
        Product p1=new Product("1234","Apple14",1499.99,100);
        p1.ProductDetails();
        p1.setPrice(1399.99);
        int restockApple=p1.restock(75);
        System.out.println(restockApple);
        int sellApple=p1.sell(15);
        System.out.println(sellApple);
        p1.ProductDetails();

    }
}
