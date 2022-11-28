package sum;

public class SumNumber {
    public static int sumNumber(int y, int sum) {
        if(y/10>=1) {
            int tempVar =y%10;
            int remain=y/10;
            sum+=tempVar;
            if(remain!=0) {
                sumNumber(remain, sum);
            }
            return sum;
        }
        else {
            return y;
        }

    }
}
