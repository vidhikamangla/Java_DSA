public class BinarySearch {
    public static void main(String[] args) {
                // {0,1,2,3,4,5,6,7,8,9}
        int [] arr={1,2,3,4,6,7,7,8,9,10};
        int k=7;
        int start=0;
        int end=arr.length-1;
        int ans=-1; 
        int mid=end+start/2;
        // IMPORTANT
        // int mid=(start+(end-start)/2);

        // instead of:-
        // int mid=(end+start)/2;

        // start!=end is a wrong condition as the ele at start=end=k would never get checked, hence start>end should be the stopping condn
        System.out.println(arr[start]+" "+ arr[mid]+ " "+arr[end]);
        while(start<=end){
            mid=(end+start)/2;
            if(k==arr[mid]){
                ans=mid;
                break;
                // mid=(end+start)/2;
                // System.out.println("1: "+arr[start]+" "+ arr[mid]+ " "+arr[end]);
                // System.out.println("1: "+start+" "+ mid+ " "+end);
            }
            else if(k<arr[mid]){
                end=mid-1;
                // mid=(end+start)/2;
                // System.out.println("2: "+arr[start]+" "+ arr[mid]+ " "+arr[end]);
                // System.out.println("2: "+start+" "+ mid+ " "+end);
            }
            else{
                start=mid+1;
                // mid=(end+start)/2;
                // System.out.println("3: "+arr[start]+" "+ arr[mid]+ " "+arr[end]);
                // System.out.println("3: "+start+" "+ mid+ " "+end);
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
