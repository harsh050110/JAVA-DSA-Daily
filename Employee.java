public class Employee{
    public int employee_id;
    public String employee_name;
    Employee(int employee_id, String employee_name){
        this.employee_id = employee_id;
        this.employee_name = employee_name;
    }
    public class array{
        public static void main(String[] args) {
            Employee[] arr = new Employee[3];
            arr[0]=new Employee(10012, "Rakesh");
            arr[1]= new Employee(21001, "Mohit");
            arr[2]= new Employee(23459, "Rajesh");
            for(int i =0; i<arr.length;i++){
                System.out.println("Employee ID"+":"+arr[i].employee_id+"    Employee Name"+":"+arr[i].employee_name);
            }
        }
    }
}