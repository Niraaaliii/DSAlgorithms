package dsaAlgo;

public class RecursivePower {
	
	public static void main(String[] args) {
		System.out.println(power(2,3));
	}
	
	public static double power(double x,int n) {
		
		if (n == 0) {
            return 1;
        } else if (isOdd(n)) {
            return x * power(x, n - 1);
        } else if (isEven(n)) {
            double temp = power(x, n / 2);
            return temp * temp;
        } else if (isNeg(n)) {
            return 1 / power(x, -n);
        } else {
            return 0;
        }		
	}

	public static Boolean isEven(int n) {
		
		if(n%2 == 0) {
			return true;
		}
		return false;
		
	}
	
	public static Boolean isOdd(int n) {
		
		if(n%2 != 0) {
			return true;
		}
		return false;
		
	}
	
	public static Boolean isNeg(int n) {
		
		if(n<0) {
			return true;
		}
		return false;
		
	}
}
