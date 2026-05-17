package pack2;

import pack1.Calculation;

public class CheckNumber extends Calculation {

    public CheckNumber(int num) {
        super(num);
    }

    // Palindrome
    public void checkPalindrome() {

        int reverse = calculateReverse();

        if (reverse == getValue())

            System.out.println("Palindrome Number");

        else

            System.out.println("Not Palindrome");
    }

    // Spy Number
    public void checkSpy() {

        int sum = calculateAdd();

        int multiply = calculateMultiple();

        if (sum == multiply)

            System.out.println("Spy Number");

        else

            System.out.println("Not Spy Number");
    }

    // Strong Number

    public void checkStrong() {

        int temp = getValue();

        int sum = 0;

        while (temp != 0) {

            int digit = temp % 10;

            sum += calculateFactorial(digit);

            temp /= 10;
        }

        if (sum == getValue())

            System.out.println("Strong Number");

        else

            System.out.println("Not Strong Number");
    }

    // Armstrong
    int count = calculateCount();

    public void checkArmsrtong() {
        int temp = getValue();
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;

            sum += (int) Math.pow(digit, count);
            temp/=10;
        }
        if (sum == getValue()) {
            System.out.println("is Armstrong");
        } else {
            System.out.println("is not Armstrong");
        }
    }

    // diserium
    public void checkDiserium() {
        int temp = getValue();
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;

            sum += (int) Math.pow(digit, count);
            count--;
            temp/=10;
        }
        if (sum == getValue()) {
            System.out.println("is Diserium");
        } else {
            System.out.println("is not Diserium");
        }
    }

}