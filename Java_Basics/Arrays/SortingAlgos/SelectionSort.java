import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the val of n: ");
        int n=sc.nextInt();
        int [] arr=new int[n];

        for (int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        
        for (int i=0;i<arr.length-1;i++){
            int max=Integer.MIN_VALUE;
            int max_index=0;
            for (int j=0;j<=n-1-i;j++){
                if (arr[j]>max){
                    max=arr[j];
                    max_index=j;
                }
            }
            int temp=arr[n-1-i];
            arr[n-1-i]=arr[max_index];
            arr[max_index]=temp;
        }
        for (int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
