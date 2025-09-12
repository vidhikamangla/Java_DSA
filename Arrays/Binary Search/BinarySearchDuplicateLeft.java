public class BinarySearchDuplicateLeft {
    public static void main(String[] args) {
        // int [] arr={1,2,3,5,5,5,7,8,9,10,11};
        int [] arr={1,2,3,4,4,5,6};
        int k=4;
        int start=0;
        int end=arr.length-1;
        int ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            System.out.println("mid: "+mid);
            if(k==arr[mid]){
                ans=mid;
                if(arr[mid-1]!=k){
                    System.out.println("Break");
                    break;
                }
                end=mid-1;
            }
            else if(k>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        if (ans==-1){
            System.out.println("Element not found.");
        }
        else{
            System.out.println("Leftmost index of the element: "+ans);
        }
    }
}