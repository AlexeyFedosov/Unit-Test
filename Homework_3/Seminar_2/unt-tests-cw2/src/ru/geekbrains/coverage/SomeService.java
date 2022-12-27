package ru.geekbrains.coverage;

public class SomeService {

    public String fizzBuzz(int i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return "" + i;
        }
    }

    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6) {
            return true;
        } else if (nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }

    public double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        double price = 0;
        if (purchaseAmount >= 0){
            if (discountAmount >= 0 && discountAmount <= 100){
                price = purchaseAmount - ((purchaseAmount / 100) * discountAmount);
            }
            else {
                throw new ArithmeticException("Не верная скидка! 0% - 100%");
            }
        } else {
            throw new ArithmeticException("Отрицательная сумма заказа!!!");
        }

        return price; // Метод должен возвращать сумму покупки со скидкой
    }

    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return b + c;
        }
        if (b == 13){
            return a + c;
        } else if (c == 13){
            return a + b;
        } else {
            return a + b +c;
        }
    }

    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean numberInInterval(int n) {
        if (n >= 25 && n <= 100) {
            return true;
        } else {
            return false;
        }
    }

}
