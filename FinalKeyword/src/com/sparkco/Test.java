package com.sparkco;

// The 'final' keyword has a few applications....

// Cannot inherit this class
final public class Test {
	// dynamic final must be set on the same line or in a constructor	
	final boolean flag2;
	// static final must be set on the same line
	static final boolean flag3 = false;
	
	public Test(boolean flag2) {
		this.flag2 = flag2;
	}
	
	public Test() {
		this.flag2 = false;
	}
	
	
	// A static final is a setting that 
    public static void main(String[] args) {
        final boolean flag;
        // Legal: set once somewhere in the body
        flag = false;
        
        while(flag) {
            System.out.println("Good Morning!");
        }
        System.out.println("Done."); 
        
    }
}