public class Application {
    String name;
    double age;
    double hight;

    public Application (String name, double age, double hight){
        this.name = name;
        this.age = age;
        this.hight = hight;
    }
    public void checkUser(){
        if (this.name !=null){
        if (this.age > 30 && this.hight > 160){
            System.out.println("User is older then 30 and taller then 160");}
        else {System.out.println("User is 30 (or yunger) or 160 (or shorter)");}

    }
}}
