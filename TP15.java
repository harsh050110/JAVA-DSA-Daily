public class TP15 {
    public static void main(String[] args){
        String bookTitle = "Java Programming";
        String authorName ="John Doe";

        int totalPages = 500;
        int membershipNumber = 12345;


        // solution 

        System.out.println("Book Title: "+bookTitle);
        System.out.println("Author Name: "+authorName);

        System.out.println("Total Pages: "+totalPages);
        System.out.println("Membership Number: "+membershipNumber);

        System.out.println("Library Book Summary: "+"Book by "+authorName+ " has "+totalPages+" pages."+"Borrowed by member number: "+"#"+membershipNumber);
    }
    
}
