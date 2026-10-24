public class D46 {
    public static void main(String[]args){
        problem1(16);
        problem2(35);
    }
    static void problem1(int n){
        int i=1;
        while(i<n){
            i=i*2;
        }
        if(i==n){
            System.out.println("true");
    }else{
        System.out.println("false");
    }
}

    static void problem2(int n){
        int i=1;

        while(i<n){
            i=i*3;
        }
        if(i==n){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    
}
