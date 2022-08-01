import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter Number : ");
        double num = inp.nextDouble();

        Outer o = new Outer();
        Outer.Inner  in = o.new Inner();

        in.Private(num);
    }
}
