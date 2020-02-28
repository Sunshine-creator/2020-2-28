import  java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        int [] arr = {23,46,67,89,35,66};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void transform(int [] arr){
        int left =0;
        int right = arr.length-1;
        while(left<right){
            while(left<right && arr[left] % 2==0){
                left++;
            }
            while (left<right && arr[right] % 2!=0){
                right--;
            }
            int temp =arr[left];
            arr[left] =arr[right];
            arr[right]= temp;
        }
    }
}
