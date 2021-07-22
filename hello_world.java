import java.io.*; //for buffered reader
import java.util.Scanner;  //for scanner class input
import java.util.stream.Stream;
import java.util.ArrayList;//this package is required to use the array list feature
import static java.util.stream.Collectors.toList; // required for make list

import java.util.List;					
public class hello_world {
 public static void main(String args[])throws IOException
 {
	 BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
	 int arr = Integer.parseInt(br.readLine().trim()); //trim cleans up the empty spaces
	 
	 //trying to add a list using buffered reader
	 System.out.println("Inputing Array list using List ");
	 List<Integer> arr3 = Stream.of(br.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());
	 
	 System.out.println(arr3);
	 System.out.println(arr3.get(2));
	 
	 System.out.println("Hello_World!");
	 
	 System.out.println(arr);
	 
	 Scanner sc = new Scanner (System.in);
	 ArrayList<Integer> arr2 = new ArrayList<Integer>();
	 while (sc.hasNextInt())
	 	{
		 	arr2.add(sc.nextInt());
	 	}
	 
	// it basically acts a stack
	 System.out.println (arr2);
	 System.out.println (arr2.get(2));
	 sc.close();
 }
}
