package Designpattern_Factory;

public class Minus implements Calculate {

	@Override
	public void calculate(int a, int b) {
		
		System.out.println(a-b);
	}

}
