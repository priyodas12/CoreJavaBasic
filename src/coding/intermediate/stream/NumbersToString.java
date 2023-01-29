package coding.intermediate.stream;

import java.util.Arrays;
import java.util.List;

public class NumbersToString {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        String result= nums.stream()
                .map(i->{
                    if(i%2==0){
                        return i*i;
                    }else{
                        return i;
                    }
                }).map(Object::toString)
                .reduce("",(a,b)-> a.toString()+"-"+b.toString());

        System.out.println(result);
    }
}
