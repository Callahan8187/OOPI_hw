import java.util.*;

public class A1106148_0224_2{
    public static void main(String[] argv){
        double degreesC,degreesF;
        System.out.println("請輸入攝氏溫度為幾度:");
        Scanner input = new Scanner(System.in);
        degreesC = input.nextDouble();

        degreesF = (degreesC * 9/5) + 32;
        System.out.println("換算成華氏溫度的結果為:"+degreesF);

    }
}