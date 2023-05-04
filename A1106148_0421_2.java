import java.util.*;
public class A1106148_0421_2{
    public static void main(String[] args){
        
        String date;
        System.out.println("請輸入正確的日期格式，格式範例:YYYY/MM/DD 或 MM/DD/YYYY:");
        System.out.println("Example:2023/05/01");
        System.out.print(":");
        Scanner input = new Scanner(System.in);
        date = input.next();

        if(date.matches("[0-9]{1,4}[/]{1}[0-1]{0,1}[0-9]{1}[/]{1}[0-3]{0,1}[0-9]{1}")){  
            System.out.println("輸入成功! 您所輸入的日期為:"+date);
        }else if(date.matches("[0-1]{0,1}[0-9]{1}[/]{1}[0-3]{0,1}[0-9]{1}[/][0-9]{1,4}")){  
            System.out.println("輸入成功! 您所輸入的日期為:"+date);
        }else{
            System.out.println("您輸入之日期格式有誤!");
        }
    }
}        