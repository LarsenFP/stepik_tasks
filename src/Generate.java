import java.util.Random;

public class Generate {

    public static void main(String[] args){
        new Generate().run();
    }

    private void run() {
        StringBuilder stringBuilder=new StringBuilder();
        int n = 2000;
        Random random = new Random();
        for (int i=0;i<n;i++){
            stringBuilder.append((char)('a'+random.nextInt(26)));
        }
        System.out.println(stringBuilder.toString());

    }
}
