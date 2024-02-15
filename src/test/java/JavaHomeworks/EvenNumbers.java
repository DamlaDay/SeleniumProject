package JavaHomeworks;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {


        //Create an ArrayLost of Even Numbers from 1 to 500 using a loop.
        ArrayList<Integer> evenNumbers=new ArrayList<>();
        for (int i = 2; i <= 500 ; i=i+2) {
            evenNumbers.add(i);
        }
        for (int i = evenNumbers.size()-1; i > 0 ;i--) {
            if(evenNumbers.get(i)%5==0){
                evenNumbers.remove(i);
            }
        }
        System.out.println(evenNumbers);

    }
}
