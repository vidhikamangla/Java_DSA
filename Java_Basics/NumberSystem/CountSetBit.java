public class CountSetBit {
    public static void main(String[] args) {
        int a=41;
        int cnt=0;
        while(a!=0){
            int bit=a&1;
            if(bit==1){
                cnt++;
            }
            a=a>>1;
        }
        System.out.println("No of set bits: "+cnt);
    }
}
