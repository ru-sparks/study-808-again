import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String javaworld = "JavaWorld";
        String java = "Java";
        String world = "World";
        java += world;
        System.out.println(java == javaworld);
        
        java = "Java";
        String java2 = "Java";
        System.out.println(java == java2);
        
        java = new String("Java");
        java2 = new String("Java");
        System.out.println(java == java2);
        
        
        
        
        
    }
}