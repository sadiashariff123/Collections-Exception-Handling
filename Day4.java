package Exceptions;

public class Day4 {

	public static void main(String[] args) {
		
		try {
			int[] a = null;
			System.out.println(a[1]);
		} catch(NullPointerException e) {
			System.out.println("Your array is null!");
		}
		

	}

}
