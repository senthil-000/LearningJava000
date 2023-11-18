/*Class one  */ 
package designpattern;

public class Duck {

    public void  quack() {
        System.out.println(" Quack ");
    }

    public void fly() {
        System.out.println("Fly"); 
    }


    public void swim() {
        System.out.println("Swim");
    }

    public static void main(String[] args) {
        RubberDuck  rd = new RubberDuck();
        rd.fly();
    }
}