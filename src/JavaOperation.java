import java.util.Scanner;

public class JavaOperation {
    public static void main(String[] args) {
        int a,b ;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter integer value of variable a : ");
        a = input.nextInt();
        System.out.println("Enter integer value of variable b: ");
        b = input.nextInt();


         double resultPlus = a + b;
         double resultMinus = a - b;
         double resultDivide = a / b;
         double resultMultiply = a * b;
         double resultModule = a % b;

         System.out.println("resultPlus:" + resultPlus);
         System.out.println("resultMinus:" + resultMinus);
         System.out.println("resultDivide:" + resultDivide);
         System.out.println("resultMultiply:" + resultMultiply);
         System.out.println("resultModule:" + resultModule);


        a++;
        System.out.println("a after postfix increment:" + a);
        b--;
        System.out.println("a after postfix decrement:" + b);
        ++a;
        System.out.println("a after prefix increment:" + a);
        --b;
        System.out.println("a after prefix increment:" + b);


        System.out.println("initial: " + a );//100
        System.out.println("2nd:" + ++a );//101
        System.out.println("1st:"+ a++ );//101
        System.out.println("3rd" + a );//102

        a += 5;
        a = a + 5;
        a -= 5;
        a *= 5;
        a/= 5;
        a%= 5;

        boolean b1, b2;

        if (a > b) System.out.println("a > b");
        if (a < b) System.out.println("a < b");
        if (a >= b) System.out.println("a >= b");
        if (a <= b) System.out.println("a <= b");
        if (a == b) System.out.println("a == b");
        if (a != b) System.out.println("a != b");

        b1 = true;
        b2 = false;
// AND
        if (b1 & b2 ) System.out.println("b1 & b2 = true");// not typed
        if (b1 && b2 ) System.out.println("b1 && b2 = true");// not typed
        // OR
        if (b1 | b2 ) System.out.println("b1 | b2 = true");// typed
        if (!(b1 & b2 )) System.out.println("!(b1 & b2) = true");// typed

        if (b1 || b2 ) System.out.println("b1 || b2 = true");// typed


    }

}
