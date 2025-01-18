public class Switch {
    static void switch_no_break() {

        int i = 1, j = -1;

        switch (i) {

            case 0, 1:
                System.out.println("hello");
                j = 1;

            case 2:
                j = 2;

            default:
                j = 0;

        }

        System.out.println("j = " + j);

    }

    static void switch_with_break() {
        int i = 1, j = -1;

        switch (i) {

            case 0, 1:
                System.out.println("hello");
                j = 1;
                break;

            case 2:
                j = 2;
                break;

            default:
                j = 0;
                break;

        }

        System.out.println("j = " + j);
    }

    public static void main(String[] args) {
        //
        // compare the differences between the two outputs
        //

        switch_no_break();
        switch_with_break();

    }

}
