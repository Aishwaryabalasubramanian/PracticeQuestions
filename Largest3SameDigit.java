package Practice.src;

public class Largest3SameDigit {
    public static void main(String[] args) {
        System.out.println(largestGoodInteger("222"));

    }
    public static String largestGoodInteger(String num) {


        int max=Integer.MIN_VALUE;
        for(int i =0;i<=num.length()-3;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
                int n = num.charAt(i)-'0';
                if(n>max)
                    max=n;
            }
        }
        if(max==Integer.MIN_VALUE){
            return "";
        }
        if(max==0){
            return "000";
        }
        return Integer.toString(max*111);

    }
}
