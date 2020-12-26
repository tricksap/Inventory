import java.util.HashMap;
import java.util.Map;
//sadasdas
public class Inventory
{
    private Map<String, Product> map;

    public Inventory()
    {
        this.map = new HashMap<String, Product>();
    }

    public boolean addProduct(Product prdct)
    {
        if (this.map.containsKey(prdct.getName()))
        {
            return false;
        }
        this.map.put(prdct.getName(), prdct);
        return true;
    }

    public void removeProduct(String name)
    {
        this.map.remove(name);
    }

    public void decrQntyPrdct(String name, int qnty)
    {
        this.map.get(name).decrQuant(qnty);
    }

    public void incrQntyPrdct(String name, int qnty)
    {
        this.map.get(name).incrQuant(qnty);
    }

    public void decrPricePrdct(String name, double price)
    {
        this.map.get(name).decrPrice(price);
    }

    public void incrPricePrdct(String name, double price)
    {
        this.map.get(name).incrPrice(price);
    }

    public void showInventory()
    {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %25s %20s %15s", "Product Name:", "Product price:", "Product Quantity:", "Total Cost:");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for (Product prdct: this.map.values())
        {
            System.out.format("%10s %20s %20s %20s",prdct.getName(),prdct.getPrice(),prdct.getQuant(),(prdct.getQuant() * prdct.getPrice()));
            System.out.println("");
        }
        System.out.println("-----------------------------------------------------------------------------");
    }

}