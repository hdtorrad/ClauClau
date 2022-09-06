
public class Wappers 
{
	public static void main(String[] args) 
	{
		Short s = 90;
		Byte b = 9;
		Boolean bol = true;
		Double  d= 5.69851;
		Float  f = 5.65f;
		Integer i = 900;
		
		System.out.println(s.hashCode());
		System.out.println(b.getClass());
		System.out.println(bol.toString());
		System.out.println(d.isInfinite());
		System.out.println(f.isNaN());
		System.out.println(i.floatValue());
		
	}
}
