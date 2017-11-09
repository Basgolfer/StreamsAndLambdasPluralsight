package Section1;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaExpressions {

    public static void main (String[] args) {


        //An anonymous class in java. Allows you to pass code in as a parameter
        Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        //Instead of using an anonymous class you can use a lambda expression
        //No need for a return statement as long as you don't use curly braces and don't have multiple lines.
        //Allows you to pass code in as a parameter
        //You can omit the types of parameters which is the statement after the one below.
        Comparator<String> comparator1 = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());
        Comparator<String> comparator2 = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        //Anonymous class
        Runnable r = new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (i++ < 10) {
                    System.out.println("It works!");
                }
            }
        };

        //Lambda Expression of above
        Runnable run = () -> {
            int i = 0;
            while (i++ < 10) {
                System.out.println("It works!");
            }
        };

        //Normal lambda expression
        Function<Person, Integer> f = person -> person.getAge();

        //Method references lambda. Code does the same as the code above.
        //Can be used with both static methods and non-static methods.
        Function<Person, Integer> f1 = Person::getAge;

        //Normal
        Consumer<String> printer = s-> System.out.println(s);

        //Method reference
        Consumer<String> printer1 = System.out::println;



    } // end method main
} // end Class Lambda Expressions

