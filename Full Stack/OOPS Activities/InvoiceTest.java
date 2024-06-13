

public class InvoiceTest {
    private String partNumber;
    private String part;
    private int quantity;
    private double price;

    InvoiceTest(String partNumber,String part,int quantity,double price)
    {
        this.partNumber = partNumber;
        this.part = part;
        this.quantity = quantity;
        this.price = price;
    }

    void setPartNumber(String partNumber)
    {
        this.partNumber = partNumber;
    }

    void setPart(String part)
    {
        this.part = part;
    }

    void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    void setPrice(int price)
    {
        this.price = price;
    }

    String getPartNumber()
    {
        return partNumber;
    }

    String getPart()
    {
        return part;
    }

    int getQuantity()
    {
        return quantity;
    }

    double getPrice()
    {
        return price;
    }

    double getInvoiceAmount()
    {
        if(quantity < 0)
        {
            quantity = 0;
        }
        if(price < 0)
        {
            price = 0;
        }
        double invoiceAmount = 0;
        invoiceAmount = quantity * price;

        return invoiceAmount;
    }


    public static void main(String[] args)
    {
        InvoiceTest item1 = new InvoiceTest("G513IH-4567", "Wireless Gaming KeyBoard", 2, 7500.00);
        System.out.println("The Invoice amount for the part " + item1.getPart() + " is " + item1.getInvoiceAmount());


        InvoiceTest item2 = new InvoiceTest("G513EG-9909", "Wireless Gaming Mouse", 1, 0);
        System.out.println("The Invoice amount for the part " + item2.getPart() + " is " + item2.getInvoiceAmount());


    }
}
