package Patterns;

public class DiamondPattern {
    public static void main(String[] args) {
        for (int i = 1; i <5; i++) {
        for (int j = i; j <= 5; j++) {
        System.out.print("  ");
                }
                        for (int k = 1; k < i; k++) {
        System.out.print("* ");
                }
                        for (int l = 1; l <= i; l++) {
        System.out.print("* ");
                }

                        System.out.println();
            }
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("  ");
            }
            for(int j=i; j<=5; j++){
                System.out.print("* ");
            }
            for(int j=5; j>i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
