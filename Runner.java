package linkedlist;
import java.util.*;
public class Runner {
public static void main(String args[])
{
	LinkedList list = new LinkedList();
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("enter the elements");
	
	while (true)
	{
		int element = sc.nextInt();
		if(element==0)
		{
			break;
		}
		list.insert(element);
	}
	System.out.println("The elements inputed: ");
	list.print();
	
	System.out.println("Enter the number to be deleted: ");
	
	int del = sc.nextInt();
	list.delete(del);
	
	System.out.println("The new list: ");
	list.print();
	
	sc.nextLine();
	System.out.println("do you want to delete all the occurences of "+del);
	String choice = sc.nextLine();
	
	if (choice.equalsIgnoreCase("yes"))
	{
		int c =  list.count(del);
		while(c!=1)
		{
			list.delete(del);
			c--;
		}
		
		System.out.println("The new list: ");
		list.print();
	}
	else
		{System.out.println("Okay.");}
	sc.close();
	}
}
