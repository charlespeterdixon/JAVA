import java.util.*;
public class practice_set_diagonal_sum_sub{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the elements of the array");
		
		int dia[][]=new int [3][3];
		int rht_dia = 0, lft_dia = 0;
		for (int i = 0; i<3; i++)
        {
            for (int j = 0; j<3; j++)
            {
                dia[i][j] = sc.nextInt();
                
                if (i==j)
                {    rht_dia = dia[i][j]+rht_dia;
                     if (i+j == (3-1))
                        lft_dia = dia[i][j]+lft_dia;
                }
                else if((i+j)==(3-1))
                    lft_dia = dia[i][j]+lft_dia;
            }
        }
		prnt(dia);
		int sum = Math.abs((rht_dia - lft_dia));
		System.out.println("\n"+sum);
		sc.close();
	}
	public static void prnt(int[][]dia)
	{
		System.out.println("Your inputed matrix \n");
		for (int i = 0; i<dia.length; i++)
		{	for (int j = 0 ; j<dia.length; j++)
				System.out.print(dia[i][j]+"  ");
			System.out.println();
		}
	}
}
