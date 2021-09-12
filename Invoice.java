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