package Designpattern_Factory;

public class CalculateFactory {
	
	//all the objects are created in one class or place in factory design pattern.
	
	public Calculate getCalculation(String type)
	{
	Calculate obj=null;
	
	if (type.toLowerCase().equals("add")) {
		obj= new Add();
	}
	else if (type.toLowerCase().equals("minus")) {
		obj= new Minus();
	}
	else {
		System.out.println("we dont do that");
	}
	return obj;

}
}
