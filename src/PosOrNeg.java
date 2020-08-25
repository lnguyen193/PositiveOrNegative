import java.util.Scanner;

public class PosOrNeg {
    public static void main(String[] args){
        //Test Data
        //Enter a number: 35
        //35 is positive.
        Scanner data = new Scanner(System.in);

        String dataNum = "Enter a number:";
        System.out.println(dataNum);

        int number = data.nextInt();
        String testData = "";

        if (number < 0){
            testData = "negative";

        } else if (number >= 0){
            testData = "positive";
        }
        System.out.println(number + " is " + testData);
    }
}
