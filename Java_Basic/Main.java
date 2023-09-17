public class Main {
    // class name is case sensitive and should start with an uppercase letter
    // class name should match the file name
    public static void main(String[] args) {
        System.out.println("Hello World");

        // variable type example:
        // variable_type();

    }

    public static void variable_type() {
        // String type (text)
        String string_ex = "String Example";
        System.out.println(string_ex);

        // int type (integer - whole numbers)
        int int_ex = 10;
        System.out.println(int_ex);

        // float type (floating numbers)
        float float_ex = 10.5f;
        System.out.println(float_ex);

        // double type (double numbers) => could represent a much larger number than
        // float
        double double_ex = 10.55d;
        System.out.println(double_ex);

        // char type (single character)
        char char_ex = 'A'; // use single quotes
        System.out.println(char_ex);

        // boolean type (true or false)
        boolean boolean_ex = true;
        System.out.println(boolean_ex);

        // use comma-separated list to initialize varaible
        int x = 5, y = 2;
        System.out.println("x + y = " + (x + y));
    }

    public static void type_casting() {
        // widening casting: convert smaller type to a larger type
        int int_x = 12;
        double double_x = int_x;

        // narrowing casting: convert larger type to a smaller type
        // need to state the specific smaller type when convert from a larger type
        double double_y = 12.22d;
        int int_y = (int) double_x;
    }
}