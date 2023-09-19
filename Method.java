public class Method {
    public static void main(String[] args) {
        /*
         * static means that the method belongs to the Main class
         * and not an object of the Main class.
         */
        System.out.println("Java Method!");

        // argument and parameter example:
        argument_example();

        // method overloading example:
        method_overloading_example();

        // method scope example:
        method_scope_example();

        // block scope example:
        block_scope_example();

        // recursion sum example:
        int sum_end = 4;
        recursion_sum_example(sum_end);
        /*
         * 4 + recursion_sum_example(3)
         * 4 + (3 + recursion_sum_example(2))
         * 4 + (3 + (2 + recursion_sum_example(1)))
         * 4 + 3 + 2 + 1 + recursion_sum_example(0) => 4 + 3 + 2 + 1 + 0
         * 
         * When sum_end equals to 0, program stops and return the result
         */

        // Halting condition example:
        int halt_start = 5, halt_end = 10;
        int halt_res = halting_sum_example(halt_start, halt_end);
        System.out.println("This is the halting condition example's result: " + halt_res);
        /*
         * 10 + halting_sum_example(5, 10-1)
         * 10 + 9 + halting_sum_example(5, 9-1)
         * ...
         * 10 + 9 + 8 + 7 + 6
         */

    }

    public static void parameter_example(String fname) {
        System.out.println("My name is " + fname);

        // Information can be passed to methods as parameter.
        // Parameters act as variables inside the method.
        // fname is a parameter
    }

    public static void argument_example() {
        parameter_example("James");
        parameter_example("Howard");

        // When a parameter is passed to the method, it is called an argument
        // James and Howard are arguments
    }

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void method_overloading_example() {
        /*
         * Multiple methods can have the same name
         * as long as the number and/or type of parameters are different.
         */

        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }

    public static void method_scope_example() {
        int x = 100;
        System.out.println(" x is: " + x);

        // variable "x" could be used anywhere inside this method
    }

    public static void block_scope_example() {
        if (true) {
            int x = 100;
            System.out.println(" x is: " + x);
        }
        // variable "x" could not be used outside the {}
    }

    public static int recursion_sum_example(int add_int) {
        if (add_int > 0) {
            return (add_int + recursion_sum_example(add_int - 1));
        } else {
            return 0;
        }
    }

    // Halting condition is when the function stops calling itself
    public static int halting_sum_example(int start, int end) {
        if (end > start) {
            return end + halting_sum_example(start, end - 1);
        } else { // when end <= start ==> halting condition
            return end;
        }
    }
}