class Singleton
{  
	private static Singleton singletonObject;	
	/** A private Constructor prevents any other class from instantiating. */
	private Singleton()
	{
		  //	 Optional Code
	}
	public static synchronized Singleton getSingletonObject()
	{
	    if (singletonObject == null)
	    {
	    	singletonObject = new Singleton();
	    }
	    return singletonObject;
	}
	public Object clone()throws CloneNotSupportedException
	{
	    throw new CloneNotSupportedException(); 
	}	  
}
public class SingletonObjectDemo
{
	public static void main(String args[])
	{
//		Singleton obj = new Singleton();	Compilation error not allowed	
		//create the Singleton Object..
		Singleton obj = Singleton.getSingletonObject();
		
		
		// Your Business Logic
		System.out.println("Singleton object obtained");
	}
}
class Hello
{
	 Singleton obj1 = Singleton.getSingletonObject();
	 //System.out.println("Singleton object obtained");
}