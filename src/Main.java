
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        List<Product> Products = new ArrayList<Product>();
        Product newPrdct;
        Inventory inventory = new Inventory();

        while (choice != 8) {
            System.out.println();
            System.out.print("1.Enter new Product\n2.Decrease Quantity\n3.Increase Quantity\n4.Remove Product\n5.Show Inventory\n6.Write in a File\n7.Read a stored File\n8.Quit\nChoice: ");
            choice = in.nextInt();
            System.out.println();
            switch(choice)
            {
                case 1:
                    newPrdct = new Product();
                    Products.add(newPrdct);
                    System.out.print("enter name product:");
                    String name = in.next();
                    newPrdct.setName(name);

                    System.out.print("enter Price:");
                    double price = in.nextDouble();
                    newPrdct.setPrice(price);

                    System.out.print("Enter Quantity:");
                    int quant = in.nextInt();
                    newPrdct.setQuant(quant);
                    inventory.addProduct(newPrdct);
                    break;

                case 2:
                    System.out.print("Name of the product: ");
                    name = in.next();
                    System.out.print("Quantity: ");
                    int quantDec = in.nextInt();
                    inventory.decrQntyPrdct(name, quantDec);
                    break;

                case 3:
                    System.out.print("Name of the product: ");
                    name = in.next();
                    System.out.print("Quantity: ");
                    int quantInc = in.nextInt();
                    inventory.incrQntyPrdct(name, quantInc);
                    break;

                case 4:
                    System.out.print("Name of the product you want to remove: ");
                    name = in.next();
                    inventory.removeProduct(name);
                    break;

                case 5:
                    inventory.showInventory();
                    break;

                case 6:
                    inventory.writeInAFile();
                    break;

                case 7:
                    Scanner reader = new Scanner(new FileReader("C:\\Users\\Patrick\\Desktop\\test\\inventory.txt"));
                    reader.nextLine(); // this will read the first line
                    while (reader.hasNext()) {
                        newPrdct = new Product();
                        Products.add(newPrdct);
                        newPrdct.setName(reader.next());

                        newPrdct.setPrice(Double.parseDouble(reader.next()));
                        newPrdct.setQuant(Integer.parseInt(reader.next()));
                        reader.next();//read the last element (total cost)

                        inventory.addProduct(newPrdct);
                    }
                        System.out.println("Transfer Done");
                    break;

                case 8:
                    System.out.println("Thankyou!!");
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}

