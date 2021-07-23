import java.util.*;

public class day_8_loop_array_reversal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		System.out.println("Enter values");
		int arr[] = new int[n];
		int i; String num = "";
		for (i = arr.length - 1; i >= 0; i--) {
			
			arr[i] = sc.nextInt();
			num = arr[i] +" "+num;
		}
		System.out.println(num);
		sc.close();
	}
}
