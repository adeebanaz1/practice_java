package Array;

public class display_array {
    static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        

    }
    public static void main(String[] args) {
        int[]arr={3,6,4,8,9,2};
        display(arr);
    }
    
}
