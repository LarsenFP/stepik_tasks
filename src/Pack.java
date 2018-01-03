import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Pack {
    //решение задачи про рюкзак

    public double pack(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int w = s.nextInt();
        double [][] data = new double[n][2];


        for(int i =0;i<data.length;i++){
            data[i][0] = s.nextInt();
            data[i][1] = s.nextInt();
        }

        Arrays.sort(data, Comparator.comparingDouble(a -> -a[0]/a[1]));

        for (int i = 0; i<data.length;i++){
            System.out.println("price is: " + data[i][0] + " value is: " + data[i][1]);
        }
        double sum_price = 0;
        double sum_weight = 0;

        for(int i = 0;i<n;i++){

            if(w>=sum_weight+data[i][1]){
                sum_price += data[i][0];
                sum_weight += data[i][1];
                System.out.println(data[i][0] + " rub " + " " + data[i][1] + " kg in the bag" );

            }else{
                double last_price = (w-sum_weight) * data[i][0]/data[i][1];
                sum_price += last_price;
                sum_weight=w;
                System.out.println(data[i][0]+ " rub " + " " + data[i][1] + " kg in the bag" + " 1");
            }
        }
        System.out.println(sum_price);


        return sum_price;

    }
}
