public class human extends Animal{
    public String[] gender= new String[6];
    void show(){
        System.out.println("姓名:"+this.name+" |身高:"+this.height+"(公尺) |體重:"+this.weight+"(公斤) |性別:"+this.gender+"(男or女orX) |速度:"+this.speed+"(公尺/分鐘)");
    }
}
