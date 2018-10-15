package invoice;

import java.util.*;
import javax.swing.event.*;
   
   /**
      An invoice for a sale, consisting of line items.
   */
   public class Invoice
    {
      /**
        Constructs a blank invoice.
       */
       public Invoice()
       {
          items = new ArrayList<>();
          listeners = new ArrayList<>();
          counter = 0;
          check = null;
       }
    
      /**
          Adds an item to the invoice.
          @param item the item to add
       */
       
     
       public void addItem(LineItem item)
       {
          items.add(item);
        	  check = item;
          item.incrementCounter();
        // Notify all observers of the change to the invoice
        
        	  ChangeEvent event = new ChangeEvent(this);
              for (ChangeListener listener : listeners)
                 listener.stateChanged(event);
          
         
          
       }
    
       /**
          Adds a change listener to the invoice.
          @param listener the change listener to add
       */
       public void addChangeListener(ChangeListener listener)
       {
          listeners.add(listener);
       }
    
       /**
          Gets an iterator that iterates through the items.
          @return an iterator for the items
       */
       public Iterator<LineItem> getItems()
       {
          return new
             Iterator<LineItem>()
             {
                public boolean hasNext()
                {
                   return current < items.size();
                }
    
                public LineItem next()
                {
                   return items.get(current++);
                }
    
                public void remove()
                {
                   throw new UnsupportedOperationException();
                }
  
                private int current = 0;
             };
       }
       
       public double getCounter()
       {
    	   return counter;
       }
    
       public String format(InvoiceFormatter formatter)
       {
          String r = formatter.formatHeader();
          Iterator<LineItem> iter = getItems();
          LineItem  first = items.get(0);
          
        	  while (iter.hasNext())
        	  {
        		  LineItem  sh = iter.next();
 
        		  if((sh.isEqual(first))||(sh.isEqual(check)))
        		  {
        			  r = formatter.formatLineItem(sh);
        			  


        		  }
        		  else
        		  {
        			  r = formatter.formatLineItem(sh);
        			  r += formatter.formatLineItem(check);
        		  }
        			  
          
        	  }
        	 
        		  
          
        	 
          return r + formatter.formatFooter();
       }
    
       private ArrayList<LineItem> items;
       private ArrayList<ChangeListener> listeners;
       private double counter;
       public LineItem check;
    }