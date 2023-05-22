public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        byte b = 127;
        short s = 16;
        int i; // declaring variable
        i = 32; // initializing variable
        long l = 64;

        System.out.println("\nVariables of type byte store" + b + "bits.\nDiapason: from -128 to 127");
        System.out.println("\nVariables of type byte store" + s + "bits.\nDiapason: from -32 768 to 32 767");
        System.out.println("\nVariables of type byte store" + i+ "bits.\nDiapason: from -2147483648 to 2 147 483 647");
        System.out.println("\nVariables of type byte store" + l + "bits.\nDiapason: from -9,223,372,036,836,854,775,808 to 9,223,372,036,836,854,775,807");

        System.out.println("Floating point primitives:");
        float f = 0.6f;
        double d = 0.5;

        System.out.println("\nVariables of type 'float' store 32 bits.");
        System.out.println("\nVariables of type 'float' store 64 bits.");

        char c;

        c = 81;

        System.out.println("Variables c contains" + c);
        c +=1;
        System.out.println(" value of variable c after 'c =+ 1;= " + c);
        c++;
        c++;
        System.out.println(" value of variable c after 'c++' = " + c);

        boolean boo;

        boo = true;

        System.out.println(boo);

        if (boo) System.out.println("boo is true");

        System.out.println("b + s = " + (b + s ));
        System.out.println("b + s = " + (127 + 16 ));




    }

}
