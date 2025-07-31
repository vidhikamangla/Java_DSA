import java.util.Scanner;
public class BubbleSort {
    // public static void swap(int i,int j){
    //     int temp=i;
    //     i=j;
    //     j=temp;
    // }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int n=sc.nextInt();
        int [] arr=new int[n];

        for (int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<n-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
