public class Car implements Nameable{
String name;
    @Override
    public String getName() {
        return name;
    }
    public Car(String n){
        name=n;
    }
}
