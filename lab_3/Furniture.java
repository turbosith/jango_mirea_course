package laby.lab_3;

public abstract class Furniture {
    protected boolean broken = false;
    protected String name="";

    public Furniture(String name) {
        this.name = name;
    }

    public abstract void setBroken(boolean broken);

    public abstract boolean isBroken();

    public String toString(){
        return("Название мебели: " + name);
    }
}

class Chair extends Furniture {
    private String material;



    public void setMaterial(String material) {
        this.material = material;
    }

    public Chair(String name, String material) {
        super(name);
        setMaterial(material);
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void setBroken(boolean broken) {
        this.broken = broken;
        System.out.println("Стул сломан\n");
    }

    @Override
    public boolean isBroken() {
        return broken;
    }

    public String toString() {
        return (super.toString() + "\nМатериал: " + material);
    }
}

class Sofa extends Furniture{
    private String material;
    private String colour;

    public Sofa(String name, String material,String colour) {
        super(name);
        this.material = material;
        this.colour = colour;
    }

    public boolean isBroken() {
        return broken;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
        System.out.println("Диван сломан\n");
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String toString() {
        return(super.toString() + "\nМатериал: " + material + "\nЦвет: " + colour);
    }
}
