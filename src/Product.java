public class Product
{
    private double price;
    private String name;
    private int quant;

    public Product() { }

    public Product(double price, String name, int quant)
    {
        this.price = price;
        this.name = name;
        this.quant = quant;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public String getName()
    {
        return this.name;
    }

    public double getPrice()
    {
        return this.price;
    }

    public int getQuant()
    {
        return this.quant;
    }

    public void incrQuant(int quant)
    {
        this.quant = this.quant + quant;
    }

    public void decrQuant(int quant)
    {
        this.quant = this.quant - quant;
    }

    public void incrPrice(double price)
    {
        this.price = this.price + price;
    }

    public void decrPrice(double price)
    {
        this.price = this.price - price;
    }

    public double getNetPrice()
    {
        return this.quant * this.price;
    }


}