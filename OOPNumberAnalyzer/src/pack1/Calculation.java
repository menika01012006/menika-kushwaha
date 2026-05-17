package pack1;

public class Calculation {

    Number obj;

    public Calculation(int num) {

        obj = new Number(num);
    }

    protected int calculateAdd() {

        int temp = obj.getNumber();

        int sum = 0;

        while (temp != 0) {

            int digit = temp % 10;

            sum += digit;

            temp /= 10;
        }

        return sum;
    }

    protected int calculateCount() {

        int temp = obj.getNumber();

        int count = 0;

        while (temp != 0) {

            count++;

            temp /= 10;
        }

        return count;
    }

    protected int calculateReverse() {

        int temp = obj.getNumber();

        int reverse = 0;

        while (temp != 0) {

            int digit = temp % 10;

            reverse = reverse * 10 + digit;

            temp /= 10;
        }

        return reverse;
    }

    protected int calculateMultiple() {

        int temp = obj.getNumber();

        int multiply = 1;

        while (temp != 0) {

            int digit = temp % 10;

            multiply *= digit;

            temp /= 10;
        }

        return multiply;
    }

    protected int calculateFactorial(int digit) {

        int fact = 1;

        for (int i = 1; i <= digit; i++) {

            fact *= i;
        }

        return fact;
    }

    protected int getValue() {

        return obj.getNumber();
    }
}