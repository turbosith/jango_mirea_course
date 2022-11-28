public class Planet implements Nameable{
    String name;
    public  Planet(String n){
        name=n;
    }
    @Override
    public String getName() {
        return name;
    }
}
