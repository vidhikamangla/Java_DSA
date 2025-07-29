import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int arr[]= new int[3];
        Scanner sc=new Scanner(System.in);
        int sum=0;

        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("sum: "+sum);
        sc.close();
    }
}
