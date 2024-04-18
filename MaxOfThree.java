public class MaxOfThree {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;
        int max;

        // Using the conditional operator to find the maximum number
        max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        System.out.println("The maximum number is: " + max);
    }
}
