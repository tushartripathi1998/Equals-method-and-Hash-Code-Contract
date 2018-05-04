class Abc{
	
	private int x;
	private int y;
	Abc(int a,int b){x=a;y=b;}
	
	 @Override
	 public int hashCode() {
	 return y%15;
	 }

	 @Override
	 public boolean equals(Object other) {
		if (other!= null && other instanceof Abc) {
			Abc m=(Abc)other;
			return((this.x == m.x) && (this.y == m.y));
		}
		else
		return false;
	}
}

	
public class UseMarty{	
	
	public static void main(String[] args)
	{
	Abc a=new Abc(10,20);
	Abc b=new Abc(10,20);
	
	if(a.equals(b))
		System.out.print("yeah");
	else
		System.out.print("nay");
	
	System.out.println(a.hashCode()+" "+b.hashCode());
}
}