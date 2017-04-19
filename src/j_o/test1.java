package j_o;

import java.util.Scanner;

public class test1 {
	protected int liczba1;
	protected int liczba2;
	protected String napis;
	protected Scanner odczyt;
	public test1(int l1, int l2, String n){
		liczba1 = l1;
		liczba2 = l2;
		napis = n;
	}
	
	public void poka(){
		System.out.println("l1 = "+liczba1 + "\nl2 = " + liczba2 + "\nnapis: " + napis);
	}
	
	public void wpis(){
		
		odczyt = new Scanner(System.in);
		System.out.print("Podaj liczbe l1 = ");
		liczba1 = odczyt.nextInt();
		odczyt.nextLine();
		System.out.print("Podaj liczbe l2 = ");
		liczba2 = odczyt.nextInt();
		odczyt.nextLine();
		System.out.print("Podaj napis : ");
		napis = odczyt.nextLine();
		while(napis.isEmpty()){
			napis = odczyt.nextLine();
		}
		odczyt.close();
	}

	public int suma(){
		return liczba2 + liczba1;
	}
}
