package array;

class Student {
    public int roll_no;
    public String name;

    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}
public class Main{
    public static void main(String[] args) {
        Student[] arr;
        arr = new Student[5];
        arr[0] = new Student(1, "Arts");
        arr[1] = new Student(2, "Raul");
        arr[2] = new Student(3,"Shea");

        for(int i=0; i<3; i++){
            System.out.println(i+arr[i].name+":"+arr[i].roll_no);
        }
    }
}