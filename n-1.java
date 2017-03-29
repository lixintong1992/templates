import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfElements = in.nextInt();
        int array[] = new int[numberOfElements];
        int sumOfArray = 0;
        for(int i = 0; i < numberOfElements; i++) {
            array[i] = in.nextInt();
            sumOfArray += array[i];
        }
        System.out.println(sumOfArray);

        String double_str = String.format("%.4f", (double)sumOfArray);
        System.out.println(double_str);
        System.out.printf("%.6f", (1/(double)sumOfArray));

        String time12 = "07:05:45PM"
        int h = Integer.parseInt(time12.substring(0,2));
        System.out.printf("%02d" + time12.substring(2, 8), h);

        BigInteger t1= new BigInteger(in.nextInt()+"");
        t3 = t2.multiply(t2).add(t1);

        in.close();
    }
}