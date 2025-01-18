public class PrintMethods {
    public static void main(String[] args) {
        // https://www.w3schools.com/java/ref_output_printf.asp
        // %[arg$][flags][width][.precision]conversion

        // the formatting %-4.2f indicates:
        // 1. -: Fill empty spaces
        // 2. 4: Minimum number of characters the output should occupy
        // 3. 2: Precision of 2 decimals
        // 4. f: floating point representation
        System.out.printf("%-4.2f", 19.779); // prints 19.78
        System.out.println();

        // System.out.print("%-4.2f", 19.779); // print() will not work for the
        // formatting value
        // System.out.println("%-4.2f", 19.779); // println() will not work for the
        // formatting value

        int var;
        System.out.println(var = 22); // prints 22

    }

}
