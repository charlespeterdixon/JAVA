import java.util.*;

public class day_8_learning_hash_maps {
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of Entries");
		int n = sc.nextInt();
		System.out.println("Fomat:\n"+"name\nnumber");
		
		int t = n;
		sc.nextLine();
		HashMap <String, Integer> ph_book = new HashMap<String, Integer>();
		
		while (n!=0)
		{
			ph_book.put(sc.nextLine(), Integer.parseInt(sc.nextLine()));
			n--;
		}
		
		System.out.println("Enter Query"+"\n"+"type stop to end");
		while (sc.hasNext())
		{
			String f = sc.nextLine();
			f = f.trim();
			Integer ph = ph_book.get(f);
			
			if (ph!=null)
				System.out.println(f+"="+ph);
			else if(f.equalsIgnoreCase("stop"))
				break;
			else
			System.out.println("Not found");
			
			//t--;
			//if (t==0)
			
				
		}
		System.out.println("-\nEnd");
		sc.close();
	}
}
