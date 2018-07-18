package com.company;
/*
    Consecutive prime sum
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int current = 1000000, counter = 0, tmp , result = 1000000;

        while(current > 0){
            tmp = countPrimeSum(current);
            if (tmp > counter ){
                counter = tmp;
                result = current;
            }
               current--;
        }

        System.out.println("result = "+ result);
        System.out.println("Execution time : "+(System.currentTimeMillis()-startTime)+" ms");

    }
    public static int countPrimeSum(int n){

        if (!isPrime(n)) return 0;

        int sum = 2, i =3, counter = 1;

        while(sum < n){

            if (isPrime(i)){
                sum += i;
                counter++;
            }
            i = nextOdd(i);
        }
        i =2;
        while(sum > n){

            if (isPrime(i)){
                sum -= i;
                counter--;
            }
            i = nextOdd(i);
        }
        return (sum == n)? counter : 0 ;
    }

    public static boolean isPrime(int n){
        for (int i=2; i*i <= n; i++){
            if(n % i == 0)
                return false;
        }
        return (n>1);
    }

    public static int nextOdd(int n){
        return  (n%2 == 0)? n+1 : n+2;
    }
}