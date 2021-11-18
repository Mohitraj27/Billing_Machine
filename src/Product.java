import java.util.*;
import java.util.ArrayList;
public class Product {
    private String pname; //pname is for Product Name
    private int qty; //qty is for Quantity of Product items
    private double price;
    private double totalPrice;

    //constructor
    Product(String pname, int qty,double price,double totalPrice){
        this.pname = pname;
        this.qty=qty;
        this.price=price;
        this.totalPrice=totalPrice;
    }
    //displayFormat
    public static void displayFormat(){
        System.out.print("\nName        Quantity     Price     Total Price\n");
    }

    //display
    public void display(){
        System.out.format("%-9s %8d %10.2f %10.2f\n",pname,qty,price,totalPrice);
    }
}
 class ShoppingBill{
    public static  void  main(String[] args){
System.out.println("Welcome to Billing Machine Application!!");
        //variables

        String productName = null;
        int quantity =0;
        double price = 0.0;
        double totalPrice=0.0;
        double overAllPrice=0.0;
        char choice='\0';
        //create Scanner class object
        Scanner scan=new Scanner(System.in);
        ArrayList<Product> product = new ArrayList<Product>();

        do {
            System.out.println("Enter product details,");
            System.out.print("Name: ");
            productName = scan.nextLine();
            System.out.print("Quantity: ");
            quantity = scan.nextInt();
            System.out.print("Price (per item):");
            price = scan.nextDouble();
            //calculate total price for that product
            totalPrice = price * quantity;
            //calculate overall Price
            overAllPrice += totalPrice;

            //create Product class object and add it to the list
            product.add(new Product(
                    productName, quantity, price, totalPrice));

            //ask for continue?
            System.out.print("Want to add more item?(y or n):");
            choice = scan.next().charAt(0);


            //read remaining characters don't store (no use)

            scan.nextLine();
        } while (choice =='y'|| choice=='Y');
        //display all product with its properties
        Product.displayFormat();
        for(Product p: product){
            p.display();}
        //overall price
        System.out.println("\n Total Net Amount = "+overAllPrice);

        //class Scanner
        scan.close();


        }}


