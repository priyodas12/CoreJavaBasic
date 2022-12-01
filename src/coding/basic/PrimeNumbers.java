package coding.basic;

import java.util.stream.IntStream;

public class PrimeNumbers {
    public static void main(String[] args) {

        IntStream.rangeClosed(0,100)
                .filter(PrimeNumbers::isPrime)
                .forEach(System.out::println);

        //System.out.println(isPrime(21));

    }

    public static boolean isPrime(Number number){
        if(number.intValue()==0 || number.intValue()==1){
            return false;
        }
        if(number.intValue()==2){
            return true;
        }
        for(int i=2;i<=number.intValue()/2;i++){
            if(number.intValue()%i==0) {
                return false;
            }
        }

        return true;

    }
}
