 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
 
abstract class Super {
     public abstract void m1() throws IOException;
}
 
class Sub extends Super {
    @Override
    public void m1() throws FileNotFoundException {  
 //      throw new FileNotFoundException();
    }
//    Ok (by itself)
//    @Override
//    public void m1() throws IOException {  
//        throw new FileNotFoundException();
//    }
    
//  Also Ok (by itself)
//  @Override
//  public void m1() throws IOException {
    // you can declare an exception and never throw it
//  }

}
 
public class Test {
     public static void main(String[] args) {
    	 LocalDate date = LocalDate.of(2068, 4, 15);
         System.out.println(date.getMonth() + ":" + date.getMonthValue());
         
         LocalDate date1 = LocalDate.parse("1980-03-16");
         LocalDate date2 = LocalDate.parse("1980-03-16");
         System.out.println(date1.equals(date2) + " : " + date1.isEqual(date2));
         // equals is object
         System.out.println(date1.equals("1980-03-16") + " : " + date1.isEqual(date2));
         
         Super s = new Sub();
     
         try {
             s.m1();
         } catch (FileNotFoundException e) {
             System.out.print("X");
         } catch (IOException e) {
             System.out.print("Y");
         } finally {
             System.out.print("Z");
         }
     }
}