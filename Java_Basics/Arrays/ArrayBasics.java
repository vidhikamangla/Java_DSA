import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class ArrayBasics {
    static int a=2;
    public static void main(String[] args) {
        // int[] arr=new int[5];
        // int[] arr={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        // System.out.print("Length of array: ");
        // String str="abcd";
        // char s='a';
        // for (int i=0;i<str.length();i++){
        //     System.out.println(str.charAt(i));
        // }
        // System.out.println(s.getClass());

        // int n=sc.nextInt();
        // int[] arr=new int[n];
        // Integer[] arr2={1,2,3,4};
        // Collections.reverse(Arrays.asList(arr2));
        // System.out.println(Arrays.asList(arr2));
        // System.out.println(arr2.getClass());
        // System.out.println(Arrays.asList(arr2).getClass());

        // for (int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }
        // arr[1]=10;
        // System.out.println("------------");
        // for (int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // for (int i=0;i<arr.length/2;i++){
        //     int temp=arr[i];
        //     arr[i]=arr[arr.length-1-i];
        //     arr[arr.length-1-i]=temp;
        // }

        // System.out.println("------------");
        // for (int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

        // Array list
        ArrayList<Integer> arl=new ArrayList<>();
        arl.add(2);
        // arl.add(5);
        // System.out.println(arl);
        // System.out.println(arl.size());
        // Collections.reverse(arl);
        // System.out.println(arl);
        // int[] a={2};

        System.out.println(sum(arl,2));
        System.out.println(arl);
    }
    public static int sum(ArrayList<Integer> arl, int b){
        arl.set(0,arl.get(0)+b);
        return arl.get(0);
    }
    //array and arraylist automatically get passed by ref in a function
}
