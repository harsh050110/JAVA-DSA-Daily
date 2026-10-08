public class D36 {
    private String name;
    private int age;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

    void setAge(int age){
        if(age>=0){
            this.age = age;

        }else{
            System.out.println("Age cannot be negative!");
        }
    }
    int getAge(){
        return age;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {

        D36 s1 = new D36();

        s1.setName("Rahul");
        s1.setAge(20);

        s1.display();
    }
}