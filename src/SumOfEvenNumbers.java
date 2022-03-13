import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfEvenNumbers {
    public static void main(String[] args) throws IOException {
        int number ,i ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter the limit: ");
        number = Integer.parseInt(br.readLine());
        i=2;
        System.out.println(" List of even numbers : ");
        // the while loop will execute until the condition becomes false
            while(i<= number){
                System.out.println( i+ "");
                i =i+2 ;    //increments i by 2 
            }

    }
}
