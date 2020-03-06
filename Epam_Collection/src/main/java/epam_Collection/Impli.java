package epam_Collection;
import java.util.*;
import org.apache.logging.log4j.LogManager;

public class Impli<s> {
    int size = 0;
    private static final org.apache.logging.log4j.Logger S =LogManager.getLogger(List.class);
    static final int FIXED= 10;
    private Object a[];
    Random r=new Random();
    public Impli() {
       a = new Object[FIXED];
       for(int i=0;i<10;i++)
       {
       	a[size++] =String.valueOf(r.nextInt(100000));
       }
   }

   
   public void adding (s val) {
       if (size == a.length) {
           memoryAllocation();
       }
       a[size++] = val;
   }
    
    public s getting(int pos) {
    	try
 	   {
        if (pos >= size || pos < 0) {
           
        }
 	   }
 	   catch(Exception r)
 	   {
 		   System.out.println("Index was not present within the range: " + pos);
 		   S.info("Index was not present within the range: " + pos);
 		    }
        return (s) a[pos-1];
   }
    
   public s remove(int pos) {
	   
	   try
	   {
       if (pos >= size || pos < 0) {
          
       }
	   }
	   catch(Exception r)
	   {
		  //System.out.println("Index was not present within the range: " + pos);
		   S.error("Index was not present within the range: " + pos);
		    }
       Object item = a[pos];
       int del = a.length - ( pos + 1 ) ;
       System.arraycopy( a, pos + 1, a, pos, del ) ;
       size--;
       return (s) item;
   }
    
   //Get Size of list
   public int size() {
       return size;
   }
    
   //Print method
   @Override
   public String toString()
   {
        StringBuilder head = new StringBuilder();
         for(int i = 0; i < size ;i++) {
            head.append(a[i].toString());
            if(i<size-1){
                head.append("\n");
            }
        }
        return head.toString();
   }
   
   private void memoryAllocation() {
       int newSize = a.length * 4;
       a = Arrays.copyOf(a, newSize);
   }
}