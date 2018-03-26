
/*
    sum of multiples of both 3 & 5
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        int result = 0;

        for(int i=0; i<1000; i++){
            if (i%3 == 0 || i%5 == 0)  result += i;
        }
        System.out.println("result = "+result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");
    }
}
