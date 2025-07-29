public class TwoPower {
    public static void main(String[] args) {
        int a=32;
        int cnt=0;
        while(a!=0){
            int bit=a&1;
            if(bit==1){
                cnt++;
            }
            a=a>>1;
        }
        if (cnt==1)
        System.out.println("Yes, the number is a power of 2");
        else
        System.out.println("a isnt the power of 2");
    }
}
