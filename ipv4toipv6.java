// vinayakrit
// Vinayak Patil
// java code for ipv4 to ipv6 compatible
// Note : Currently this program not working. Stay tunned it will be workable soon.
/*
198%16 = 6
198%10 = 12 => c
198 => c6


*/

import java.util.Scanner;

class ipv4toipv6
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int toint, x, y;
		String x1, y1;

		String array[] = new String[4]; 
		System.out.println("Enter IPV4 address : ");
		String ipv4 = scan.nextLine();
		String string = ipv4;
		String[] parts = string.split(".");
		String part1 = array[1] = parts[0]; 
		String part2 = array[2] = parts[1];
		String part3 = array[3] = parts[2]; 
		String part4 = array[4] = parts[3]; 

			System.out.println(array.length);
		for(int i=1; i<=4;i++)
		{
			toint = Integer.parseInt(parts[i]);
			x= toint/16;
			x1 = Integer.toHexString(x);
			System.out.println(x1);
			y= toint%16;
			y1 = Integer.toHexString(y);
			System.out.println(y1);
			x1=  x1.concat(y1);
			System.out.println(x1);
			array[i] = x1;

		}
		for(int i=0; i<array.length;i++)
		{
			System.out.println(array[i]);
			//s = array[i].concat(array[i]":");
			//array[i] = array[i].concat();
		}
	}

}
