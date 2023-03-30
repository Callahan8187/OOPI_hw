import java.util.Scanner;

class Animal{
    String name;  
    double height;
    double weight;
    double speed;
    
    double distance(double x){
        double s = x* this.speed;  
        return s;  
    }
    double distance(double x, double y){  
        double s = x* y* this.speed;  
        return s;  
    }
    
    void show(){
        System.out.println("姓名:"+this.name+" |身高:"+this.height+"(公尺) |體重:"+this.weight+"(公斤) |速度:"+this.speed+"(公尺/分鐘)");
    }
  }

  public class A1106148_0324_1{
    public static void main(String [] args){

      Animal[] member = new Animal[4];

      member[0] = new Animal();
      member[0].name = "雪寶";
      member[0].height = 1.1;
      member[0].weight = 52;
      member[0].speed = 100;

      member[1] = new Animal();
      member[1].name = "驢子";
      member[1].height = 1.5;
      member[1].weight = 99;
      member[1].speed = 200;
      
      member[2] = new Animal();
      member[2].name = "安那";
      member[2].height = 1.7;
      member[2].weight = 48;
      member[2].speed = 120;
      
      member[3] = new Animal();
      member[3].name = "愛沙";
      member[3].height = 1.7;
      member[3].weight = 50;
      member[3].speed = 120;
      
      for(int i=0; i < member.length; i++){
        member[i].show();
      }      

      for(int n=0; n < member.length; n++){
        int x;
        System.out.printf("請輸入"+member[n].name+"跑步時間:");
        Scanner input = new Scanner(System.in);
        
        x = input.nextInt();
        input.nextLine();
        
        String acceleration;
        System.out.printf("請輸入"+member[n].name+"之加速度(僅輸入時間的話也可以):");
        acceleration = input.nextLine();
        
        if(acceleration.isBlank()){
          System.out.println(member[n].name+"的跑步距離為:"+member[n].distance(x));
          System.out.println("--------------------------");
        }else{
          double y = Double.parseDouble(acceleration);
          System.out.println(member[n].name+"的跑步距離為:"+member[n].distance(x,y));
          System.out.println("--------------------------");
        }
      } 
    }
  }