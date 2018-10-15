package invoice;

/**
      A simple invoice formatter.
   */
   public class SimpleFormatter implements InvoiceFormatter
   {
      public String formatHeader()
      {
         total = 0;
         return "     I N V O I C E\n\n\n";
       }
    
       public String formatLineItem(LineItem item)
       {
          total += item.getPrice();
          double y = item.getCounter()*item.getPrice();
          return (String.format("%s %.0" + "f\n",  item.toString() + "( $ " + item.getPrice() + " each )  X   ", item.getCounter()));
         
       }
       
     
       public String formatFooter()
       {
    	  
          return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
       }
       
     
    
       private double total;
       
    }