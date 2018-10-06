package academy.learnProgramming;

public class Main {
    public static void main(String[] args) {
//    print size of arguments

        System.out.println("args size = " + args.length);
/*
*printing arguments
*second line
 */
        for (int i = 0; i<args.length; i++) {
            System.out.println("args[" + i + "]=" + args[i]);
        }
        int addition = sum(1,2);
        System.out.println("sum of 1&2 = " + addition);

    }
    public static int sum(int a, int b){
        return a+b;
    }
}
