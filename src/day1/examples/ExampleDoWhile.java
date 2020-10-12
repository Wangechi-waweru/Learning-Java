package day1.examples;

public class ExampleDoWhile {

    public static void main(String[] args) {

        int x = 10;
        do{
            System.out.println("x = " + x);
            x--;
        }while (x > 0);
    }
}
/* The do while loop runs at least once because the condition is checked after loop body. It verifies the condition after the execution of the statements inside the loop
 A while loop checks the condition before iteration of the loop .
 */