package com.pratice;

public class Modulus {
	
	public static void increment()
	{
    int x=3;
    int x1=x++; //First assign the current value and then increment
    System.out.println(x1);
    System.out.println(x);
    int x2=++x;//First increment the value then assign the value
    System.out.println(x2);
   int b=7;
   b=b++; // assignment operator is higher precedence than post increment so the value remains the same 
//   int b1=b++;
//   System.out.println(b1);
   System.out.println(b);
   int b1=b;
   System.out.println(b1);
   
    
//	int b=7;
//	int a=b=5;
//	System.out.println(a);
//	System.out.println(b);
	}

	public static void main(String[] args) {
		increment();
		
		int x = 2;
        int y = 0;
        for (; y < 10; y++) {
        	System.out.println("y value: " +y);
            if (y % x == 0) {
                continue;
            } else if (y == 8) {
                break;
            } else {
                System.out.println(y + " ");
            }
        }
    }

}
