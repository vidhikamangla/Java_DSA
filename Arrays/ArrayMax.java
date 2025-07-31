import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        int arr[]= new int[3];
        Scanner sc=new Scanner(System.in);
        int max=Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max= arr[i];
            }
        }
        System.out.println("max element: "+max);
        sc.close();
    }
}
