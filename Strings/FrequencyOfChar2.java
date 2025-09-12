import java.util.*;
public class FrequencyOfChar2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int [] arr=new int[26];
        // arr=frequencyArray(arr,str); (no need as array gets updated by ref)
        frequencyArray(arr, str);
        // System.out.println(arr[0]);
        sc.close();
    }

    public static void frequencyArray(int[] freqArr,String str){
        for(int i=0;i<str.length();i++){
            int index=str.charAt(i)-'a';
            freqArr[index]++;            
        }
    }
}