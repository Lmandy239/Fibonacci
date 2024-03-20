
public class Fibonacci {
	
	public static void main(String[] args) {
	
	int num = 0;
	int num2 = 1;
	int num3 = num + num2;
	

	for(int i = 0; i <= 20; i++) {
		System.out.println(i + ": " + num);
		num = num2; 
		num2 = num3;
		num3 = num + num2;
	}
		
	}
		
	

}
