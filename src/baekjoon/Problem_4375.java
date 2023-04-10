package baekjoon;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/4375
 * 2와 5로 나누어 떨어지지 않는 정수 n(1 ≤ n ≤ 10000)가 주어졌을 때, 1로만 이루어진 n의 배수를 찾는 프로그램을 작성하시오.
 */
public class Problem_4375 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int n = sc.nextInt();
            int num = 0;
            for(int i=1;; i++) {
                num = num * 10 + 1;
                num %= n;
                if(num == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
