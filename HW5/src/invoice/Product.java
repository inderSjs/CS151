package invoice;

/**
      A product with a price and description.
   */
   public class Product implements LineItem
   {
      /**
         Constructs a product.
         @param description the description
         @param price the price
       */
       public Product(String description, double price)
       {
          this.description = description;
          this.price = price;
          this.counter = 0.0;
       }
       public double getPrice() { return price; }
       public String toString() { return description; }
       
       public void incrementCounter()
       {
    	   counter++;
       }
       
       
       public double getCounter()
       {
    	   return counter;
       }
       public boolean isEqual(LineItem that)
       {
    	   if(this.price==that.getPrice())
    	   {
    		   return true;
    	   }
    	   return false;
       }
       private String description;
       private double price;
       private double counter;
    }
