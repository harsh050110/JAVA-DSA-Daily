public class TP13 {
    public static void main(String[] args){
        String studentName ="Harsh";
        int studentAge = 20;

        int CSO = 90;
        int OS = 80;
        int DBMS = 70;

        // calculating average marks

        int totalMarks = CSO + OS +DBMS;
        int averageMarks = totalMarks/3;

        System.out.println("Student Name: "+studentName);
        System.out.println("Student Age: "+studentAge);
        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Average Marks: "+averageMarks);
    }
}
