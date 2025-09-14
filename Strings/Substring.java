public class Substring {
    public static void main(String[] args) {
        String s="cbaaedgs";
        String p = "abc";
        int n=p.length();
        for(int i=0;i<=s.length()-n;i++){
            String str="";
            for(int j=i;j<i+3;j++){
                str+=s.charAt(j);
            }
            System.out.println(str);
        }
    }
}
