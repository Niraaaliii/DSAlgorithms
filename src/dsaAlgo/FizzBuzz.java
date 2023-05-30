package dsaAlgo;


public class FizzBuzz {

	public static void main(String[] args) {
        Result.fizzBuzz(15);
	}
}




class Result {


    public static void fizzBuzz(int n) {
    	
    for(int i=1;i<=n;i++){
            if(i%3==0 && i%5!=0){
                System.out.println("Fizz");
                
                //fizzBuzz(i-1);
            }
            else if(i%5==0 && i%3!=0){
                System.out.println("Buzz");
                //fizzBuzz(n-1);
            }
            else if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
                //fizzBuzz(n-1);
            }
            else if(i%3==0 || i%5==0){
                System.out.println(i);
                //fizzBuzz(n-1);
            }
            else{
                System.out.println(i);
            }
        }
    }

}
