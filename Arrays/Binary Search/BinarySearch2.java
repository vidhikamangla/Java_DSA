public class BinarySearch2 {
    public static void main(String[] args) {
        // int [] arr2={1,2,3,5,5,5,7,8,9,10,11};
        int [] arr={1,3,4,4,4,5,6};
        int k=4;
        int start=0;
        int end=arr.length-1;
        int ans=-1;

        // int mid=start+(end-start)/2;
        // System.out.println(mid);
        // mid=(end+start)/2;
        // System.out.println(mid);

        // start!=end is a wrong condition as the ele at start=end=k would never get checked, hence start>end should be the stopping condn
        while(start<=end){
            int mid=start+(end-start)/2;
            System.out.println("mid: "+mid);
            if(k>=arr[mid]){
                if(arr[mid]==k){
                    ans=mid;
                    if (arr[ans+1]!=k){
                        System.out.println("No duplicate found furthur");
                        break;
                    }
                    System.out.println("Element found at index: "+ans);
                }
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
            System.out.println("Rightmost (duplicate): "+ans);
            System.out.println("Upper bound index: "+ (ans+1));
            System.out.println("Upper bound element: "+ arr[(ans+1)]);
        }
    }
}
