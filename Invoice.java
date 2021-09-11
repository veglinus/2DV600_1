public class Invoice {
    String partNumber;
    String desc;
    int amount;
    double price;

    public Invoice(String partNumber, String desc, int amount, double price) {
        this.partNumber = partNumber;
        this.desc = desc;
        this.amount = amount;
        this.price = price;
    }

    public double getInvoiceAmount() {

        if (this.amount < 0) {
            this.amount = 0;
        }
        if (this.price < 0) {
            this.price = 0;
        }

        return this.amount * this.price;
    }

    public String getPartNumber() {
        return partNumber;
    }
    public String getDesc() {
        return desc;
    }
    public int getAmount() {
        return amount;
    }
    public double getPrice() {
        return price;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}

class InvoiceTest {
    public static void main(String[] args) { // TODO

        // Let's make a guac
        var avocados = new Invoice("001", "An avocado", 3, 15.5);
        var fraiche = new Invoice("010", "Creme fraiche", 1, 13.9);

        double totalamount = avocados.getInvoiceAmount() + fraiche.getInvoiceAmount();
        
        System.out.println("The cost of my guacamole is very low! In total it costs " + totalamount);
        System.out.println("But somedays the avocados are very expensive.");

        avocados.price = 25;
        avocados.desc = "A ripe and ready to eat avocado";

        double newprice = avocados.getInvoiceAmount() + fraiche.getInvoiceAmount();
        System.out.println(avocados.desc + " is more expensive, the price of my guac then is actually " + newprice);

        double difference = newprice - totalamount;

        System.out.println("That's aproximately " + Math.round(difference) + " SEK more expensive.");;

    }
}