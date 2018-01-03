class Main {


    public static void main(String[] args) {
        new Main().run();
    }
    public void run(){
        int x = 1;
        int y = 0;

        y = y + x;

        x = x * 2;
        y = y + x;

        x = x * 2;
        //y = y + x;

        x = x * 2;
        y = y + x;

        //x = x * 2;
        y = y + x;

        System.out.println(y);
        // System.out.println(convertCelsiumToFahrenheit(41));
       // System.out.println(new int[][]{{1,2,3},{3,4,5}}[1][2]);
       // new HaffmansDecoding().haffmansdecode();

    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        //напишите тут ваш код
        double tf= (double)celsium * 9/5+ 32;

        return tf;
    }





}