import java.util.*;
public class day_10_int_to_bin {
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		n = binary(n);
	}
	public static int binary( int n)
	{
		if (n==0)
		{
			System.out.print("0");
			return (n);
		}
		else if (n%2==0)
		{
			System.out.print("0");
			return binary(n/2);
		}
		else
		{
			System.out.print("1");
			return binary(n/2);
		}
	}
}
