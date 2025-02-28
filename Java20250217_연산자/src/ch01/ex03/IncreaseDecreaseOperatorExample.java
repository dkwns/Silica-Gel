package ch01.ex03;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
//		증감연산자 ++
//		감소연산자 --
		
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x=" + x);
		
		System.out.println("--------------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("--------------------");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("--------------------");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
/*
 *      int a = 0;
 *      System.out.println(a);
 *      a = a+1;
 *      System.out.println(a);
 *      a = a+1;
 *      System.out.println(a);
 *      
 *      int b = 0;
 *      System.out.println();
 *      System.out.println(b);
 *      ++b;
 *      System.out.println(b);
 *      b++;
 *      System.out.println(b);
 */

	}

}
