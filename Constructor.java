public class Constructor {
    int cos_x;
    int cos_y;

    public Constructor(int y) {
        // this is a constructor
        // constructor's name must match class file name
        // constructor cannot have a return type

        cos_x = 5;
        cos_y = y;
    }

    public static void main(String[] args) {
        Constructor myConstructor = new Constructor(12); // Create an object of class Constructor (This will call the
                                                         // constructor)
        System.out.println(myConstructor.cos_x); // Print the value of x
        System.out.println(myConstructor.cos_y); // Print the value of x
    }
}
