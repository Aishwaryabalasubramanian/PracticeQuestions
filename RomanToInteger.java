public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));

    }

    public static int romanToInt(String s) {
        int i = s.length()-1;
        int n=0,ans =0;
        while(i>=0){
            char currChar =s.charAt(i);
            switch(currChar){
                case 'I':
                    n=1;
                    break;
                case 'V':
                    n=5;
                    break;
                case 'X':
                    n=10;
                    break;
                case 'L':
                    n=50;
                    break;
                case 'C':
                    n=100;
                    break;
                case 'D':
                    n=500;
                    break;
                case 'M':
                    n=1000;
                    break;


            }
            if(n>=ans){
                ans+=n;
            }
            else{
                ans-=n;
            }
            i--;
        }
        return ans;

    }


}
