
public class Assignment1_1 {

	int add(int x ,  int y)
	{
		while(y!=0)
		{
		 int carry = x&y;
		 x = x^y;
		 y = carry<<1;
		}
		
		return x;
		
	}
	
	
	public static void main(String[] args) {
		
		Assignment1_1 a = new Assignment1_1();
	int	 sum = a.add(1, 2);
		 System.out.println(sum);

	}
	


}
