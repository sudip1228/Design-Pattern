package DesignPattern_Singleton;

public class singleton {

	private  static singleton single;
	
	private singleton() {//set no args constructor private
		
	}
	
	public static singleton getinstance() {//creates single object if object is null.If not null it returns the same object or old object and doesnot create the second object.
		if (single ==null)
				{
			single = new singleton();
				}
		return single;
				
	}
	
}
