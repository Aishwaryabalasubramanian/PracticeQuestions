package Practice.src;

public class FruitBasketII {
    public static void main(String[] args) {
//        int[] fruits={3,6,1};
//        int[] baskets={6,4,7};

        int[] fruits={5};
        int[] baskets={3};



        //System.out.print(numOfUnplacedFruits(fruits,baskets));
        System.out.print(numOfUnplacedFruitTypes(fruits,baskets));
    }
    public  static int numOfUnplacedFruits(int[] fruits, int[] baskets) {

        int n = fruits.length,fruit,temp=0,count=0;

        for(int i =0;i<n;i++){
            boolean flag= false;
            fruit=fruits[i];
            for(int j =0;j<n;j++){
                if(baskets[j]>=fruit){
                    baskets[j]=0;
                    flag=true;
                    break;
                }
                else if(baskets[i]!=0){
                    temp=baskets[j];
                }
            }
            if(!flag &&temp>0){
                count= count+(fruit-temp);
            }
        }
        return count;

    }

    public static int numOfUnplacedFruitTypes(int[] fruits, int[] baskets) {

        int n = fruits.length,fruit,temp=0,count=0;

        for(int i =0;i<n;i++){
            boolean flag= false;
            fruit=fruits[i];
            for(int j =0;j<n;j++){
                if(baskets[j]>=fruit){
                    baskets[j]=0;
                    flag=true;
                    break;
                }

            }
            if(!flag){
                count++;
            }
        }
        return count;

    }
}
