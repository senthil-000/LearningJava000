package designpattern;

public class WhiteDuck extends Duck implements Flyable {

    WhiteDuck () {
        System.out.println("WhiteDuck");
    };

    public void fly (){
        System.out.println(" Fly");
    }
    
}
