package hidharun;
public class HelloApp {

    public static void main(String[] args) {

        String result;

        // Check if no arguments are provided
        if (args.length == 0) {
            result = "World";
        } else {
            StringBuilder names = new StringBuilder();

            // Enhanced for loop to iterate through arguments
            for (String name : args) {
                names.append(name).append(", ");
            }

            // Remove trailing comma and space
            names.setLength(names.length() - 2);

            result = names.toString();
        }

        // Display greeting
        System.out.println("Hello, " + result + "!");
    }
}