import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

class LambdaExpressions {
    public static void main(String[] args) {
        // Addition
        BinaryOperator<Integer> addition = (a, b) -> a + b;
        int resultAddition = addition.apply(5, 3);
        System.out.println("Addition: " + resultAddition);

        // Subtraction
        BinaryOperator<Integer> subtraction = (a, b) -> a - b;
        int resultSubtraction = subtraction.apply(10, 4);
        System.out.println("Subtraction: " + resultSubtraction);

        // Multiplication
        BinaryOperator<Integer> multiplication = (a, b) -> a * b;
        int resultMultiplication = multiplication.apply(6, 7);
        System.out.println("Multiplication: " + resultMultiplication);

        // Division
        BinaryOperator<Double> division = (a, b) -> a / b;
        double resultDivision = division.apply(12.0, 3.0);
        System.out.println("Division: " + resultDivision);
    }
}
interface StringTransformer {
    String transform(String input);
}

 class LambdaExpressions2 {
    public static void main(String[] args) {
        StringTransformer uppercaseTransformer = input -> input.toUpperCase();
        StringTransformer lowercaseTransformer = input -> input.toLowerCase();

        String result = uppercaseTransformer.transform("Hello, World!");
        System.out.println("Uppercase: " + result);

        result = lowercaseTransformer.transform("Hello, World!");
        System.out.println("Lowercase: " + result);
    }
}
class LambdaExpressions3 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 7 even? " + isEven.test(7));

        Function<Integer, String> intToString = n -> Integer.toString(n);
        System.out.println("Integer to String: " + intToString.apply(42));

        Consumer<String> printMessage = message -> System.out.println("Message: " + message);
        printMessage.accept("Hello, World!");

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println
