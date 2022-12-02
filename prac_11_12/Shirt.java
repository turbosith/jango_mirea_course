package laby.prac_11_12;

import java.util.StringTokenizer;

public class Shirt {
    private String number;
    private String name;
    private String color;
    private String size;

    public Shirt(String line){

        int k1=0;
        StringTokenizer elem = new StringTokenizer(line, ",");
        while (elem.hasMoreTokens()) {
            number = elem.nextToken();
            name = elem.nextToken();
            color = elem.nextToken();
            size = elem.nextToken();
            k1++;
        }
    }


    @Override
    public String toString() {
        return "Shirt{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
