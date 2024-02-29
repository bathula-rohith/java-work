package com.overloading;
// over riding
public class Od  extends Load{


	public void add( int x,int y)

	{
		super.add(x,y);
		int c=x*y;
		System.out.println(" the mulof the two number is:"+c);
		
	}
	public static void main(String[]g)
	{
   Od o = new Od();
   o.add(12,13);
 
}
}
