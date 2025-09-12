public class StringBasics {
    public static void main(String[] args) {
        String str="HiH";
        System.out.println(str);
        // 341 34 999 99
        // 999 99 343 34
        // charAt

        boolean isPalindrome=true;
        for (int i=0;i<str.length()/2;i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Is a Palindrome!");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
