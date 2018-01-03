import java.sql.Time;
import java.util.*;

public class HaffmansDecoding {
    Map<String,Character> symbols;
    Map<String, Character> keys;
    StringBuilder encodedString;
    StringBuilder  code;

    public static void main(String[] args){
        new HaffmansDecoding().run();
    }

    private void run() {
        Scanner input = new Scanner(System.in);

        int k = input.nextInt();
        int l = input.nextInt();
        symbols = new HashMap<>();

        for (int i=0; i<k; i++){
            String line = input.next();
            Character character = line.charAt(0);
            String code = input.next();
            symbols.put(code,character);
            //System.out.println(character + " : " + code);
        }

        long start = System.currentTimeMillis();
        StringBuilder codedString = new StringBuilder();
        codedString.append(input.next());


        keys = new TreeMap<String, Character>(symbols);





        code = new StringBuilder("");
        encodedString = new StringBuilder();
        decoding(codedString,code, encodedString);
        long finish = System.currentTimeMillis();
        System.out.println(finish-start + " ms");
    }


    public void decoding(StringBuilder codedString, StringBuilder code, StringBuilder encodedString){

        if(codedString.length()==0){
            System.out.println(encodedString);
            return;
        }

        while(!keys.containsKey(code.toString())){
            Character add = codedString.charAt(0);
            code.append(add.toString());
            //code.append(codedString.get(0));
            codedString.deleteCharAt(0);
        }
        encodedString.append(keys.get(code.toString()));

        code = new StringBuilder("");
        decoding(codedString,code,encodedString);


//        String add = codedString.get(0);
//
//        code += add;
//        //code.append(codedString.get(0));
//        codedString.remove(0);
//
//        if(keys.containsKey(code)){
//            encodedString.append(keys.get(code));
//
//            code = "";
//            decoding(codedString,code,encodedString);
//        }else{
//            decoding(codedString,code,encodedString);
//        }


    }




}
