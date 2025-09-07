package test;

public class Car{
    private String name;
    private boolean isEngineOn;
    public Car(String name){
        this.name = name;
        this.isEngineOn=false;
    }
    //Engine class acts like a property of the car class;
    class Engine{
        public void start(){
            if(!isEngineOn){
                isEngineOn = true;
                System.out.println(name + " started");
            }else{
                System.out.println(name+" already started");
            }
        }

        public void stop(){
            if(isEngineOn){
                isEngineOn = false;
                System.out.println(name +" stop");

            }else{
                System.out.println(name+" already stop");
            }
        }

    }
}