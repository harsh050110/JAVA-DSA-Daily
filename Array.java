public class Array {
    public static void main(String[] args) {
        int[] arr;
        arr= new int[6];
        arr[0]=10;
        arr[1]=90;
        arr[2]=84;
        arr[3]=4;
        arr[4]=67;
        arr[5]=100;

        for(int i=0; i<arr.length; i++){
            System.out.println("Element at index"+i+":"+arr[i]);
        }

    }
}

