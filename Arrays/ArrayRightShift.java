import java.util.Scanner;

public class ArrayRightShift {
    public static void reverse(int[] arr, int start, int end){
        int n = end - start + 1; 
        // 1 ->2 3 4 ->5 6
        for(int i=0; i<(n/2); i++){
            int temp = arr[start + i];
            arr[start + i] = arr[end - i];
            arr[end - i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        
        System.out.print("Enter the value of k: ");
        int k=sc.nextInt();

        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr,1,3);

        System.out.println("Updated Array:");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

        sc.close();
    }
}
