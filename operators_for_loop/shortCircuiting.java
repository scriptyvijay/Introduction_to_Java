package operators_for_loop;

public class shortCircuiting {
    public static void main(String[] args) {
        int a = 60, b = 80;

        if (a++ > 60 && b++ > 80) { // OR and &&
            System.out.println("Inside If");
        } else {
            System.out.println("Inside Else");
        }
        System.out.println("a is " + a + " b is " + b);
    }
}
