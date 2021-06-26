package activities;

public class Activity2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] input = {10, 77, 10, 54, -11, 10};
int sum = 0, fixednumber = 10;
System.out.println(result(input, sum, fixednumber));
	}
	
	public static boolean result (int[] input, int sum, int fixednumber) {
		for (int i=0; i<input.length; i++) {
			if (input[i] == fixednumber) {
				sum = sum + input[i];
			}
		}
		System.out.println("sum ofall 10s is " + sum);
		boolean x=false;
		if (sum== 30) {
			x=true;
		}
		return (x);
				
		
	}

}
