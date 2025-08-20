import java.util.Scanner;
public class BasicOperations {
    public static void main(String[] args) {
        int n=5;
        int m=5;
        int[][] arr=new int[n][m];
        Scanner sc=new Scanner(System.in);

        int cnt=1;
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=cnt++;
            }
            // System.out.println();
        }
        // // row wise traversal
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
                // System.out.print(arr[i][arr[0].length-1-j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        // row wise zigzag traversal 1
        // int i=0;
        // while(i<arr.length){
        //     if(i%2==0){
        //         for (int j=0;j<arr[0].length;j++){
        //             System.out.print(arr[i][j]+" ");
        //         }
        //     }
        //     else{
        //        for (int j=arr[0].length-1;j>=0;j--){
        //             System.out.print(arr[i][j]+" ");
        //         } 
        //     }
        //     i++;
        //     System.out.println();
        // }

        // row wise zigzag traversal 2
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         System.out.print(arr[i][i%2==0?j:arr[0].length-1-j]+" ");
        //     }
        //     System.out.println();
        // }

        // COLUMN wise traversal
        // for(int i=0;i<arr[0].length;i++){
        //     for (int j=0;j<arr.length;j++){
        //         System.out.print(arr[j][i]+" ");
        //     }
        //     System.out.println();
        // }

        
        // column wise zigzag traversal
        
        // for(int i=0;i<arr.length;i++){
        //     for (int j=0;j<arr[0].length;j++){
        //             System.out.print(arr[j%2==0?i:arr.length-1-i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<arr.length;i++){
        //     for (int j=i;j<arr[0].length;j++){
        //         int temp=arr[i][j];
        //         arr[i][j]=arr[j][i];
        //         arr[j][i]=temp;
        //     }
        // }

        // transpose: column wise traversal

        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
