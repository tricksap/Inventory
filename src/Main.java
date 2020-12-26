
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        Product prdct[] = new Product[10];
        Inventory inventory = new Inventory();
        int i=0;
        String name;
        while(choice !=6)
            {
                System.out.println();
                System.out.print("1.Enter new Product\n2.Decrease Quantity\n3.Increase Quantity\n4.Remove Product\n5.Show Inventory\n6.Quit\nChoice: ");
                choice = in.nextInt();
                System.out.println();

            if (choice == 1) {
                prdct[i] = new Product();
                System.out.print("enter name product:");
                name = in.next();
                prdct[i].setName(name);

                System.out.print("enter Price:");
                double price = in.nextDouble();
                prdct[i].setPrice(price);

                System.out.print("Enter Quantity:");
                int quant = in.nextInt();
                prdct[i].setQuant(quant);
                inventory.addProduct(prdct[i]);
            }
            if (choice == 2) {
                System.out.print("Name of the product: ");
                name = in.next();
                System.out.print("Quantity: ");
                int quant1 = in.nextInt();
                inventory.decrQntyPrdct(name, quant1);
            }

            if (choice == 3) {
                System.out.print("Name of the product: ");
                name = in.next();
                System.out.print("Quantity: ");
                int quant1 = in.nextInt();
                inventory.incrQntyPrdct(name, quant1);
            }

            if (choice == 4) {
                System.out.print("Name of the product you want to remove: ");
                name = in.next();
                inventory.removeProduct(name);
            }
            if (choice == 5) {
                inventory.showInventory();
            }
        }
    }
}
