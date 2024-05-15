//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class ArrayFunHouseRunner
{
	public static void main( String args[] )
	{
		int[] one = new int[]{4,10,0,1,7,6,5,3,2,9};

		System.out.println(Arrays.toString(one));
		System.out.println("sum of spots 3-6  =  " + App.getSum(one,3,6));
		System.out.println("sum of spots 2-9  =  " + App.getSum(one,2,9));
		System.out.println("# of 4s  =  " + App.getCount(one,4));
		System.out.println("# of 9s  =  " + App.getCount(one,9));

		int[] two = new int[]{4,2,3,4,6,7,8,9,0,10,0,1,7,6,5,3,2,9,9,8,7};

		System.out.println(Arrays.toString(two));
		System.out.println("sum of spots 3-6  =  " + App.getSum(two,3,6));
		System.out.println("sum of spots 2-9  =  " + App.getSum(two,2,9));
		System.out.println("# of 4s  =  " + App.getCount(two,4));
		System.out.println("# of 9s  =  " + App.getCount(two,9));

		System.out.println("The array after deletion of 9s :: " + Arrays.toString(App.removeVal(two,9)) );


	}
}