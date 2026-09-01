public class TO91 {
    public static void main(String[] args){
        int a = 3, b = 4;

        int c = a-- + ++b - --a -b++;
         
        System.out.println(c);
        // Operator	Meaning
// a++	Use a, then increment
// ++a	Increment a, then use it
// a--	Use a, then decrement
// --a	Decrement a, then use it
    }
    
}


