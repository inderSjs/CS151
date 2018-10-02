package question2;

import java.util.*;

public class Tester {
	public static void main(String[] args)
	{
		BankAccount b1 = new BankAccount(121, 1);
		BankAccount b2 = new BankAccount( 141, 100);
		BankAccount b3 = new BankAccount(188, 1234567);
		BankAccount b4 = new BankAccount( 1491, 10500);
		BankAccount b5 = new BankAccount(161, 6500);
		BankAccount b6 = new BankAccount( 1561, 4800);
		int x = b1.compareTo(b2);
		System.out.println(x);
		ArrayList<BankAccount> al = new ArrayList();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		al.add(b5);
		al.add(b6);
		Collections.sort(al);
		for ( int i = 0 ; i < (al.size() - 1); i++)
		{
			System.out.println(al.get(i).getBalance());
		}

	}
}
