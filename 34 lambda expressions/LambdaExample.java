package lambdaexpressions.exercises;

public class LambdaExample {
    public static void main(String[] args) {
        NumericOperator addition = Integer::sum;
        int sum = addition.operate(5, 3);
        System.out.println("Sum: " + sum);

        NumericOperator maximum = Math::max;
        int max = maximum.operate(5, 3);
        System.out.println("Max: " + max);

        StringFormatter toUpperCase = String::toUpperCase;
        String uppercaseString = toUpperCase.format("hello world");
        System.out.println("Uppercase: " + uppercaseString);
    }
}
