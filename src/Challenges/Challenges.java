package Challenges;
import java.util.*;

public class Challenges {
    //reverse the given input string
    public static String reverseString(String inputString){
        if (inputString.length() > 0) {
            StringBuilder backwardsString = new StringBuilder();
            for (int i = inputString.length() - 1; i >= 0; --i) {
                backwardsString.append(inputString.charAt(i));
            }
            return backwardsString.toString();
        }
        return "Empty input";
    }
    //accepts three integers as input and returns as output the largest of the three.
    public static int largestNumber(int first, int second, int third){
        if (first > second && first > third){
            return first;
        }
        else if (second > first && second > third){
            return second;
        }
        else{
            return third;
        }
    }

    public static int factorial(int inputNum){
        if (inputNum == 0 || inputNum == 1){
            return 1;
        }
        return inputNum * factorial(inputNum - 1);
    }

    public static int fibonacci(int entries){
        if (entries > 0) {
            int firstAddend = 0;
            int secondAddend = 1;
            int result = 1;

            for (int i = 1; i < entries; ++i){
                result = firstAddend + secondAddend;
                firstAddend = secondAddend;
                secondAddend = result;
            }
            return result;
        }
        return 0;
    }

    public static void  main(String[] args){
        System.out.println("Enter a word you would like to reverse: ");
        String input = new Scanner(System.in).nextLine();
        System.out.println(reverseString(input));

        System.out.println(largestNumber(-1,-2,-3));
        System.out.println(factorial(6));

        System.out.println(fibonacci(6));
    }
}
