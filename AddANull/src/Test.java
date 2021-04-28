import java.util.ArrayList;
import java.util.List;
 
public class Test {
     public static void main(String[] args) {
    	 
    	 // Array contains nulls
         Boolean [] arr = new Boolean[2];
         List<Boolean> list = new ArrayList<>();
         list.add(arr[0]);
         list.add(arr[1]);
         // note directly adding a 'null' also compiles:
         list.add(null);
         
         // Compiles because boolean
         // Throws on null value
         if(list.remove(0)) {
             list.remove(1);
         }
 
         System.out.println(list);
     }
}