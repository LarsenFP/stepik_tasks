//По данному числу 1≤n≤1091≤n≤109 найдите максимальное число kk, для которого nn можно представить как сумму kk различных натуральных слагаемых. Выведите в первой строке число k, во второй — k слагаемых.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DifferentSummands {

    //разложение числа на максимальное число слагаемых
    public void numbers(){
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int k=1;
        int n=0;

        StringBuilder summands = new StringBuilder();
        while(number-k>=0){
            number = number-k;
            if(number-k<=0){
                k=k+number;
                n++;
                summands.append(k).append(" ");
                break;
            }
            summands.append(k).append(" ");
            k++;
            n++;
        }
        System.out.println(n);
        System.out.println(summands);
    }





}
