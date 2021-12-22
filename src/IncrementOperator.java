
public class IncrementOperator {

	public static void main(String[] args) {
        int x = 1;       
        x = x++ + ++x + x++ + ++x + ++x;       
        System.out.println("Value of x : " + x);
        boolean evenOrOdd = x%2==0;
        System.out.println("The value of x is even:  "+evenOrOdd);
        
        
        
		// TODO Auto-generated method stub

	}

}
