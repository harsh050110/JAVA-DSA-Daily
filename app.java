public class app{
    public static void main(String[] args){
        int target = 15;
boolean found = false;
int [] arr ={1,2,3,4,5,6,7,8,9};
for(int i = 0; i < arr.length; i++) {
    if(arr[i] == target) {
        found = true;
        break;
    }
}

System.out.println(found ? "Found" : "Not Found");

    }
}