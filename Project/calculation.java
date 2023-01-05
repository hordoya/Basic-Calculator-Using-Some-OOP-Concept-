import java.lang.Math; 
public class calculation extends Parent implements calculator {
	//double a,b;
	calculation(int a,int b)
	{
		super(a,b);
	}
	calculation(double c,double d)
	{
		super(c,d);
	}
	calculation(int a)
	{
		super(a);
	}
	calculation(double c)
	{
		super(c);
	}
	public int add(int a,int b)
	{
		return a+b;
	}
	public double add(double c,double d)
	{
		return c+d;
	}
	public int subtract(int a,int b)
	{
		return a-b;
	}
	public double subtract(double c,double d)
	{
		return c-d;
	}
	public int multiplication(int a,int b)
	{
		return a*b;
	}
	public double multiplication(double c,double d)
	{
		return c*d;
	}
	public double division(double c,double d)
	{
		return c/d;
	}

	public double log(int a)
	{
		return	Math.log(a);
	}
	public double log(double c)
	{
		return	Math.log(c);
	}
	public double root(int a)   
	{
		return Math.sqrt(a);
	}
	public double root(double c)   
	{
		return Math.sqrt(c);
	}
	int y=1;
	public int apowb(int a,int b)
	{
		for(int i=0;i<b;i++)
		{
			y*=a;
		}
		return y;
	}
	double h=1;
	public double apowb(double c,double d)
	{
		
		return Math.pow(c,d);
	}
}