package DesignPattern_Singleton;

public class singletontest {

	public static void main(String[] args) {
		singleton obj1=singleton.getinstance();//creating single instance.
		singleton obj2=singleton.getinstance();
		
	
		System.out.println(obj1.hashCode());//these two objects have same hashcode because only one object is created in sington pattern.
		System.out.println(obj2.hashCode());
	}

}
