package JavaPackage;

public class PR4 {
	public static void main(String[] args) {
		int i=2;
		while(makeDecision(i)){

		i=i*i;
		System.out.println(i);//4,16,256,65536
		}

		}

		public static boolean makeDecision(int i)//2,4,65536
		{
		if(i%3 != 0){ //This is because (4\) divided by \(3\) gives a quotient of \(1\) and a remainder of \(1\). So, \(4 \% 3 = 1\).
		return true;
		}else{
		return false;
		}
		}
}
