
package taxcarculation;

import java.util.ArrayList;
import java.util.Scanner;


public class TaxCarculation {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Carculate> list = new ArrayList<Carculate>();
        int number=1;
        while(true)
        { 
            Carculate cal = new Carculate();
            System.out.println("Product"+number);
            System.out.println("Enter The Product Name:");
            String productName = input.next();
            cal.productName = productName;
            System.out.println("Enter The Product Quantity");
            int quantity = input.nextInt();
            cal.quantity = quantity;
            System.out.println("Enter The Price:");
            float pr = input.nextFloat();
            cal.price = pr;
            System.out.print("This Product Is It Imported[y/n]:");
            String imp = input.next();
            if(imp.toLowerCase().equals("y")){
                cal.isImported=true;
            }
            System.out.print("This Product Is It Exmpted[y/n]:");
            String exemp = input.next();
            if(imp.toLowerCase().equals("y")){
                cal.isExmpted=true;
            }
            cal.CalculateSale();
            list.add(cal);
            number++;
            System.out.print("Do you Want To Continue To Shop[y/n]:");
            String add = input.next();
            if(add.toLowerCase().equals("n"))
                break;
        }
        float totalPrice = 0.0f;
        float salesTax = 0.0f;
        for (int i = 0; i < list.size(); i++) {
            Carculate cal = list.get(i);
            totalPrice += cal.price;
            salesTax += cal.taxSales;
            System.out.println(cal);
        }

        System.out.println("Sales Taxes:" + salesTax);
        System.out.println("Total: " + (totalPrice + totalPrice + salesTax));
    }
    
}
