public class Test {
     public static void main(String[] args) {
    	 // byte is a signed int type of a single byte
    	 //  the computer number line is circular, with the
    	 // weld-point joining max to min

    	 // One more than max int and the result is the lowest possible single-byte int
         System.out.println((byte) (127 + 1));
         System.out.println(Byte.MAX_VALUE);
         System.out.println(Byte.MIN_VALUE);
         // This goes to -128 then adds 20 to that resulting in -108
         byte b1 = (byte) (127 + 21);
         System.out.println(b1);
     }
}