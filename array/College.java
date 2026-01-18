package array;
public class College {
    int rollno;
    String name;
    public static void main(String[] args) {
        Student[]arr;
        arr=new Student[10];
        arr[0]=new Student(21, "Harsh");
        arr[1]=new Student(22, "Rahul");
        arr[2]=new Student(23, "Suresh");
        arr[3]=new Student(24, "Vikas");
        arr[4]=new Student(25, "Anil");
        arr[5]=new Student(26, "Ramesh");
        arr[6]=new Student(27, "Sandeep");
        arr[7]=new Student(28, "Prakash");
        arr[8]=new Student(29, "Deepak");
        arr[9]=new Student(30, "Amit");
        arr[2].name="Karan";
        arr[4].roll_no=90;
        for (int i = 0; i < 10; i++) {
            if(arr[i].name.startsWith("R")){
            System.out.println("Roll No.:"+arr[i].roll_no+" Name: "+arr[i].name);
        }
        }
}
}
