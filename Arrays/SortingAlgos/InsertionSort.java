public class InsertionSort {
    public static void main(String[] args) {
        int[] arr= {1,3,4,2,8,9,4,0};
        for (int i=1;i<arr.length;i++){
            int ele=arr[i];
            for(int j=i-1;j>=0;j--){
                if (arr[j]>ele){
                    arr[j+1]=arr[j];
                    if(j==0){
                        arr[j]=ele;
                    }
                }
                else{
                    arr[j+1]=ele;
                    break;
                }
            }
        }

        for (int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
