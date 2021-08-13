package linkedlist;

public class LinkedList {
	
static Node head;
	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		node.link = null;
		
		if (head==null) //first element
		{
			head = node;
		}
		else
		{
			Node temp = head;
			
			while (temp.link!=null) //searching for the last element
			{
				temp = temp.link;
			}
			temp.link = node; //it will re-assign the value of last object that has the null address to the current object address
		}
	}
	
	public void print()
	{
		Node temp = head;
		
		while(temp.link!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.link;
		}
		System.out.println(temp.data);
	}
	
	public void delete(int del)
	{
		Node prev = null, temp = head;
		
		if (temp.data == del && temp.link!=null)
		{
			head =  temp.link;
		}
		
		while(temp !=null && temp.data!=del)
		{
			prev = temp;
			temp = temp.link;
		}
		
		if (temp == null)
		{
			System.out.println("Not found");
		}
		
		//when found
		prev.link = temp.link; //reassignment of the object reference of the last object reference to the next object reference
	}
	
	public int count(int delete)
	{
		Node temp = head; int c = 0;
		while(temp!=null)
		{
			if (temp.data==delete)
			{
				c++;
			}
			
			temp = temp.link;
		}
		return (c);
	}
}
