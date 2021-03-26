package JavaTrain1;

public class Abc {
	
	static int count;
	private String flag;
	protected char var = 'A';
	long block = 123456;
	
	public static int meth()
	{
		count = 2;
		return count;
	}
	
	public String meth1()
	{
		flag = "Kaustav";
		return flag + "  " + block;
	}
	public char meth2()
	{
		return var;
	}

}
