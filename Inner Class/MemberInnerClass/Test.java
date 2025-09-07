package test;

public class Test{
    public static void main(String [] args){
        Car c = new Car("BMW");
        Car.Engine e = c.new Engine();
        e.start();
        e.stop();
    }
}