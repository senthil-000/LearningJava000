/*Class one  */ 
package designpattern;

public class Duck {

    Flybehavier flybehavier;

/* 
    public void  quack() {
        System.out.println(" Quack ");
    }
*/

    public void performFly() {
        flybehavier.fly(); 
    }
 
    public void swim() {
        System.out.println("Swim");
    }

    public void setBehavier(Flybehavier fb) {
        flybehavier = fb;
    }

    public static void main(String[] args) {
        Duck rd = new RubberDuck();
        Duck wd = new WhiteDuck();
        
        wd.setBehavier(new FlyRockerPowered());
        rd.setBehavier(new NoFly());
        wd.performFly();
        rd.performFly();
        
    }
}