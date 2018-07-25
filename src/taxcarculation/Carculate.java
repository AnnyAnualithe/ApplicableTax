
package taxcarculation;

public class Carculate {
    int quantity = 0;
    String productName = null;
    float price=0.0f;
    boolean isImported=false;
    boolean isExmpted = false;
    float taxSales =0.0f;
    public void Carculate(int quantity,String productName,float price,boolean isImported,boolean isExmpted){
        this.quantity = quantity;
        this.productName = productName;
        this.price = price;
        this.isImported = isImported;
        this.isExmpted = isExmpted;
    }
    public void CalculateSale()
    {
        float totalTax = 0.0f;
        if(isImported)
            totalTax = 0.05f;
        if(!isExmpted)
            totalTax = 0.1f;
        if(isImported && !isExmpted)
        totalTax = 0.15f;
        
        taxSales = totalTax * price;
    }
    public String toString()
    {
        float total = price * quantity;
        return quantity + " " + productName + " at "+total;
    }
}
