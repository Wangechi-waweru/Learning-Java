package day1.examples;

public class ExampleArrays {

    public static void main(String[] args) {


        /*int a = 10;
        int b = 20;
        int c, d, e;
        c = 30;
        d = 40;
        e =50;*/

        int[] a = {10, 20 ,30 ,40, 50};

        System.out.println(a[2] + "  " + a[4]);

        //enhanced for

        for(int temp : a){
            System.out.println(temp);
        }

        System.out.println("--------------");

        int[] x = new int[5];
        x[3] = 25;
        x[0] = 12;

        for(int temp2 : x){
            System.out.println(temp2);
        }

        System.out.println("--------------");

        String[] st = {"one", "Two", "Three","Four"};
        for(String temp : st){
            System.out.println(temp);
        }

        System.out.println("--------------");

        String[] stx = new String[5];

        stx[3] = "25";
        stx[0] = "12";

        for(String temp3 : stx){
            System.out.println(temp3);

        }




    }
}
