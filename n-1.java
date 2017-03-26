import java.io.*;
import java.util.*;

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

        in.close();
    }
}