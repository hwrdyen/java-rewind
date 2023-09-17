public class Intro {
    public static void main(String[] args) {
        System.out.println("Intro Class");

        // variable type example:
        // variable_type();

        // String method example:
        // string_methods();

        // Math method example:
        // math_methods();

        // Short-hand if...else example:
        // ifelse_shorthand();

        // use switch method without break statement:
        // switch_nobreak_example();
        // use switch method with break statement:
        // switch_withbreak_example();

        // while and do...while loop example:
        // whileloop_methods();

        // for each loop example:
        // foreachloop_method();

        // break and continue example:
        // break_continue_method();

        // array example:
        array_example();

        // multi-dimension array example:
        array_multidimension_example();
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

    public static void string_methods() {
        String string_ex = "hello world!";

        // String Length => length()
        System.out.println("string_ex length is: " + string_ex.length());

        // all to uppercase => toUpperCase()
        System.out.println("string_ex to uppercase: " + string_ex.toUpperCase());

        // all to lowercase => toLowerCase()
        System.out.println("string_ex to lowercase: " + string_ex.toLowerCase());

        // find a character => indexOf()
        System.out.println("w located at: " + string_ex.indexOf("w"));

        // concatenation => .concat()
        String first_name = "John";
        String last_name = "Doe";
        System.out.println("firstName lastName: " + first_name.concat(" ").concat(last_name));

        // number + String => will return a string
        int test_int = 10;
        String test_string = "25";
        System.out.println("test_int + test_string: " + (test_int + test_string));

        // Backslash escape => \' --> '; \" --> "
        String test_backlashtxt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(test_backlashtxt);

        // New Line => \n
        String test_newlinetxt = "Thank you,\nnext!";
        System.out.println(test_newlinetxt);
    }

    public static void math_methods() {
        // Math.max(x, y) => find the highest value of x and y
        System.out.println("Which one is higher? 100 or 1? " + Math.max(100, 1));

        // Math.min(x, y) => find the lowest value of x and y
        System.out.println("Which one is lower? 100 or 1? " + Math.min(100, 1));

        // Math.sqrt(x) => return square root of x
        System.out.println("Square root of 64 is: " + Math.sqrt(64));

        // Math.abs(x) => return absolute value of x
        System.out.println("Absolute value of -4.712 is: " + Math.abs(-4.712));

        // Math.random() => return a random number between 0 and 1 (not included)
        System.out.println("Random number (0 to 1): " + Math.random());

        // Math.random() => return a random number between 0 and 100
        System.out.println("Random number (0 to 100): " + (int) (Math.random() * 101));
    }

    public static void ifelse_shorthand() {
        // Short-hand if...else
        int today_temp = 23;
        String weather = (today_temp > 25) ? "sunny day" : "windy day";
        System.out.println("Today\'s weather is: " + weather);
    }

    public static void switch_nobreak_example() {
        // use switch statement without break

        String curr_date = "Monday";
        switch (curr_date) {
            case "Monday":
                System.out.println("Today is Monday - no break statement");
                // will continue go to the next case because there is no break statement

            case "Tuesday":
                System.out.println("Today is Tuesday - no break statement");

            case "Wednesday":
                System.out.println("Today is Wednesday - no break statement");

            default:
                System.out.println("Today is default - no break statement");
        }
    }

    public static void switch_withbreak_example() {
        // use switch statement with break

        String curr_date = "Monday";
        switch (curr_date) {
            case "Monday":
                System.out.println("Today is Monday");
                break;

            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;

            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;

            default:
                System.out.println("Today is default");
        }
    }

    public static void whileloop_methods() {
        // while loop => check condition first then execute code inside
        int while_times = 1;
        while (while_times > 0) {
            System.out.println("This is while_time " + while_times);
            /*
             * won't show while_times 0,
             * because it won't go into the loop when while_times is not higher than 0
             */
            while_times--;
        }

        // do...while loop => execute once then check condition afterwards
        int dowhile_times = 0;
        do {
            System.out.println("This is dowhile_times " + while_times);
            /*
             * will show dowhile_time 0,
             * because it goes into the loop first
             * then check if dowhile_times is higher than 0
             */
        } while (dowhile_times > 0);
    }

    public static void foreachloop_method() {
        String[] cars = { "Volvo", "Toyota" };
        // loop through elements in an array
        for (String i : cars) {
            System.out.println(i);
        }
    }

    public static void break_continue_method() {
        // break method => break when the condition meets
        int break_step = 2;
        for (int i = 0; i <= 3; i++) {
            if (i == break_step) {
                break;
            }

            System.out.println("Break Step " + i);
        }

        // continue method => skip and move to the next iteration when the condition
        // meets
        int continue_step = 2;
        for (int i = 0; i <= 3; i++) {
            if (i == continue_step) {
                continue;
            }

            System.out.println("Continue Step " + i);
        }
    }

    public static void array_example() {
        // String array
        String[] string_array = { "Volvo", "BMW" };

        // int array
        int[] int_array = { 11, 22 };

        // Change string_array first element
        System.out.println("Original String array 1st element: " + string_array[0]);
        string_array[0] = "Benz";
        System.out.println("Updated String array 1st element: " + string_array[0]);

        // length => array length
        System.out.println("String array length is: " + string_array.length);
    }

    public static void array_multidimension_example() {
        // Update multi array element
        int[][] int_multiarray = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        System.out.println("Original multi array [1][2]: " + int_multiarray[1][2]); // 7
        int_multiarray[1][2] = 9;
        System.out.println("Updated multi array [1][2]: " + int_multiarray[1][2]); // 9

        // print out multi array
        for (int i = 0; i < int_multiarray.length; ++i) { // i = 0, i = 1
            for (int j = 0; j < int_multiarray[i].length; ++j) {
                /*
                 * j = 1,2,3,4 -> i = 0, length = 4
                 * j = 5,6,7 -> i = 1, length = 3
                 */
                System.out.println(int_multiarray[i][j]);
            }
        }
    }
}
