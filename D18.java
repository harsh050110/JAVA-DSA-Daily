public class D18 {
    
    public static void main(String[] args) {
        // Initialize the variable 'age' with a predefined value of 16
        int age = 16; 

        // Check if the age is less than 13
        if (age < 13) {
            System.out.println("You are a child."); 
        } 
        // Check if the age is between 13 and 19 (inclusive)
        else if (age <= 19) { // Teenagers fall into this category
            System.out.println("You are a teenager."); 
        } 
        // If the age is greater than 19
        else {
            System.out.println("You are an adult."); 
        }
    }
}

