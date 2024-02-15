package JavaHomeworks;

public class Product {
    private String ProductId;
    private String ProductName;
    private double price;
    private int stockQuantity;

    public void ProductDetails(){
        System.out.println("Product Details :"+ProductName+" ,ID "+ProductId+" "+",Price "+price);
    }
    Product(String productId,String productName,double price,int stockQuantity){
        this.price=price;
        this.ProductId=productId;
        this.ProductName=productName;
        this.stockQuantity=stockQuantity;
    }


    public int restock(int amount){
        this.stockQuantity=stockQuantity;
        stockQuantity=amount+stockQuantity;
        return stockQuantity;
    }

    public int sell(int amount){
        this.stockQuantity=stockQuantity;
        stockQuantity=stockQuantity-amount;
        int totalSale;
        totalSale= (int) (price*amount);
        return stockQuantity ;

    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public final String getProductId() {
        return ProductId;
    }
}
