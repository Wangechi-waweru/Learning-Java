package day1.examples;

public class ExampleIf {

    public static void main(String[] args) {

        int x= 20;
        int y = 30;

        if(x < y){
            System.out.println("X is less than Y");
        } else if (x == y){
            System.out.println("X is equal to y");
        } else{
            System.out.println("X is greater than Y");
        }
    }
}