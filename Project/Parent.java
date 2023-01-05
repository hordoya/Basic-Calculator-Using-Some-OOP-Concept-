public class Parent{
	private double a,b;
	private int c,d;
	public void seta(double a)
	{
		a=a;
	}
	public void setb(double b)
	{
		b=b;
	}
	public void setc(int c)
	{
		c=c;
	}
	public void setd(int d)
	{
		d=d;
	}
	public double seta()
	{
		return a;
	}
	public double getb()
	{
		return b;
	}
	public int getc()
	{
		return c;
	}
	public int getd()
	{
		return d;
	}
	public Parent(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	public Parent(int c,int d)
	{
		this.c=c;
		this.d=d;
	}
	public Parent(int c)
	{
		this.c=c;
	}
	public Parent(double a)
	{
		this.a=a;
	}
}