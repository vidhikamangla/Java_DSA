import java.util.Scanner;
public class Basics {
    public static void main(String[] args) {
        int n=5;
        int m=5;
        int[][] arr=new int[n][m];
        // int[][] arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        Scanner sc=new Scanner(System.in);

        int cnt=1;
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                // System.out.print("Enter element for row "+i+1+": ");
                arr[i][j]=cnt++;
            }
            System.out.println();
        }

        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
