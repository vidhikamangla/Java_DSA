// Ques 20: 
// n = 7 

//       * 
//     *   *
//   *       *
// *           *
//   *       *
//     *   *
//       *
public class Pattern20 {
    public static void main(String args[]){
        int n=7;
        int row=1;
        int nlsp=n/2;
        int nrsp=-1;

        while(row<=n){
            int i=1;
            while(i<=nlsp){
                System.out.print(" "+" ");
                i++;
            }
            System.out.print("* ");
            if (n>row && row>1){
                int j=1;
                while (j<=nrsp){
                    System.out.print(" "+" ");
                    j++;
                }
                System.out.print("* ");
            }
            if (row<=n/2){
                nlsp-=1;
                nrsp+=2;
            }
            else{
                nlsp+=1;
                nrsp-=2;
            }
            row++;
            System.out.println();
        }
    }
}
