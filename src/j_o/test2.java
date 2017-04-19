package j_o;

public class test2 extends test1{

	private int liczba3;
	
	public test2(int l1, int l2, String n, int l3) {
		super(l1, l2, n);
		liczba3 = l3;
	}
	
	
	public int suma(){
		return liczba3 + super.suma();
	}
	
	public void poka(){
		super.poka();
		System.out.println("l3 = " + liczba3);
	}

}
