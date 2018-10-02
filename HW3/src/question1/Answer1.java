package question1;

import java.time.*;
import java.util.*;

public class Answer1 {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		ZonedDateTime current = ZonedDateTime.now();
		
		ZoneId c = ZoneId.systemDefault();
		int  bYear;
		System.out.println("Enter birth year: ");
		bYear = in.nextInt();
		int bMonth;
		System.out.println("Enter the number of birthday month: ");
		bMonth = in.nextInt();
		int bDay;
		System.out.println("Enter birth day  number: ");
		bDay = in.nextInt();
		
		ZonedDateTime birth = ZonedDateTime.of(bYear, bMonth, bDay, 12, 12, 12, 12, c);
		
		Answer1 a1 = new Answer1();
		 int l1 = a1.days(current, birth);		
		 System.out.println(l1);
	}
	
	public int days(ZonedDateTime c, ZonedDateTime b)
	{
		int[] daysInaMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int m = 0;  //current
		int n = 0;  //birth
		for ( int i = 0 ; i < (c.getMonthValue() - 1) ; i++)
		{
			m = m + daysInaMonth[i];
		}
		
		for ( int i = 0 ; i < (b.getMonthValue() - 1) ; i++)
		{
			n = n + daysInaMonth[i];
		}
		
		int year = b.getYear() + 1;
		int temp = 0;
		
		for  ( int i = year ; i < (c.getYear() + 1) ; i++ )
		{
			if ( ( i % 400 == 0 || i % 100 != 100) && (i%4 ==0))
			{
				temp = temp + 1;
				
				if( i == c.getYear() && c.getMonthValue() < 2)
				{
					temp--;
				}
			}
		}
		
		n = n + b.getYear()*365 + b.getDayOfMonth();
		m = m + c.getYear()*365 + c.getDayOfMonth() + temp;
		

		
		return (m - n);
		
	}
	
	

}
