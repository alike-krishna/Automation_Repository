package JavaPackage;

public class PR3 {

	public static void main(String[] args) {
		int x=0;//0,1,2,3,4,5,6,7,8,9,10
		while(true){
		x = increment(x);

		System.out.println("Value of x is --"+x); //1,2,3,4,5,6,7,8,9,10,11

		if(x>10)//1,2,3,4,5,6,7,8,9,10,11
		break;//11 becomes exit from while loop

		}
		}

		public static int increment(int i){
		return i+1;
		}

}
