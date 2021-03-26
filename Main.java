package JavaTrain;
import JavaTrain1.*;
import JavaTrain2.*;

public class Main {

	public static void main(String[] args) {
		Abc obj = new Abc();
		System.out.println(obj.meth1());
		System.out.println(obj.meth2());
		System.out.println(Abc.meth());
		
		Bank b = new Bank();
		System.out.println(Bank.bName());
		b.take();
		System.out.println(b.show());

	}

}
