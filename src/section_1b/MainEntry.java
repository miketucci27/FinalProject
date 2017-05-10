package section_1b;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MyGenInterface<Integer, String> mgi1;
	MyGenInterface<Integer, Integer> mgi2;
	
	mgi1=new MyGenClass<Integer, String>(1, "Michael");
	mgi2=new MyGenClass<Integer, Integer>(1, 2017);
	
	Integer i1=MyRegularClass.getSum(10);
	Float f2=MyRegularClass.getSum(10f);
	
	System.out.println("mgi1.key: "+mgi1.getKey());
	System.out.println("mgi1.val: "+mgi1.getValue());
	System.out.println("mgi2.key: "+mgi2.getKey());
	System.out.println("mgi2.val: "+mgi2.getValue());
	System.out.println("i1: "+i1);
	System.out.println("f2: "+f2);
	}
}
