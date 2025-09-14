public class FrequencyOfChar {
    public static void main(String[] args) {
        String str="aAAbBcabccb";
        // char asci=97;
        // System.out.println(asci);
        int [] arr=new int[123];
    }

    public static int[] frequencyArray(int[] arr,String str){
        for(int i=0;i<str.length();i++){
            // int index=str.charAt(i)-'a';
            int index=str.charAt(i);
            arr[index]++;            
        }
        for(int i=0;i<123;i++){

            // type casting: doubt
            // char ascii=(char)(i+'a');
            char ascii=(char)(i);
            if(arr[i]>0){
                System.out.println("Char: "+(ascii));
                System.out.println("Count: "+arr[i]);
            }
        }
        return arr;
    }
}