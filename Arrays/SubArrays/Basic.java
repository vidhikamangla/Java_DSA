public class Basic {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length;j++){
                System.out.print("Cut: ("+i+", "+j+") ");
                for(int k= i; k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}