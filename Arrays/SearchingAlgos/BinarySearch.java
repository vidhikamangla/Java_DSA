public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,6,7,7,8,9,10};
        // int [] arr={10,9,8,7,6,5,4,3,2,1};
        int k=5;
        int start=0;
        int end=arr.length-1;
        int ans=-1; 
        // IMPORTANT
        // int mid=(start+(end-start)/2);

        // instead of:-
        // int mid=(end+start)/2;

        // start!=end is a wrong condition as the ele at start=end=k would never get checked, hence start>end should be the stopping condn
        while(start<=end){
            int mid=(end+start)/2;
            if(k<=arr[mid]){
                if(arr[mid]==k){
                    ans=mid;
                    if (arr[ans-1]!=k){
                        System.out.println("No duplicate found furthur");
                        break;
                        
                    }
                    System.out.println("Element found at index: "+ans);
                }
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        if (ans==-1){
            System.out.println("Element not found.");
        }
        else{
            System.out.println("Final index: "+ans);
        }
    }
}
