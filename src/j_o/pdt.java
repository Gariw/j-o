package j_o;

public class pdt {
	public static void main(String[] args){
		
		test1 zmienna = new test1(2, 5, "Ala ma kota");
		test2 zmienna2 = new test2(3, 6, "Sierotka ma rysia", 7);
		System.out.println(zmienna.suma()+"\n"+zmienna2.suma());
		zmienna2.poka();
		zmienna2.wpis();
		zmienna2.poka();
		
		
		
		
	}

}
