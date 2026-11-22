public class P38 {
    public static void main(String[] args) {
        int i = 72915;
        int a =i;
        int count =0;
        while(i!=0){
            i=i/10;
            count++;
        }
        System.out.println("Total digit: "+count);
    }
}
