public class CheckOddEven {
    public static void main(String[] args) {
        int a=4;
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        // Bit Operator
        if((a&1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
