public class OOP {
    public static void main(String[] args) {
        System.out.println("OOP class");

        /*
         * <Procedural programming & OOP programming>
         * - Procedural programming is about writing procedures or methods that perform
         * operations on the data. => programs are sequences of instructions to be
         * executed.
         * - Object-oriented programming is about creating objects that contain both
         * data and methods.
         */

        /*
         * <OOP advantages>
         * 1. OOP is faster and easier to execute
         * 2. OOP provides a clear structure for the programs
         * 3. OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the
         * code easier to maintain, modify and debug
         * 4. OOP makes it possible to create full reusable applications with less code
         * and shorter development time
         */

        /*
         * <Class and Object>
         * - Class is a template of an object
         * - Object is an instance of a class
         */

        /*
         * <Static and Public>
         * - static method means that it can be accessed without creating an object of
         * the class.
         * - public method means that it can only be accessed by objects
         */
        access_example();

    }

    // Static example
    static void static_example() {
        System.out.println("This is a static function");
    }

    // Public example
    public void public_example() {
        System.out.println("This is a public function");
    }

    // Access static and Public
    public static void access_example() {
        static_example();
        // public_example();
        // => not able to call directly because it is not a static method

        OOP myOOP = new OOP();
        myOOP.public_example();
    }
}
