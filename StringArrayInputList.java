import java.util.*;
import java.util.ArrayList;

public class StringArrayInputList {
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		List<String> words = new ArrayList<String>();
		int c = n;
		while(c!=-1)
		{
			words.add(sc.nextLine());
			c--;
		}
		words.remove(0);
		System.out.println(words);
		
		c=0;
		while (c!=n)
		{
			prnt(words.get(c));
			//System.out.println(words.get(c));
			c++;
		}
	}
	
	public static void prnt(String l)
	{
		String even = "",odd="";
        
        int t = 0;
        
        while(t!=l.length())
        {
            if (t==0 || t%2==0)
                    even = even+l.charAt(t);
            else
                    odd = odd+l.charAt(t);
            t++;
        }
        
        System.out.println(""+even+" "+odd+"");
	}
}
