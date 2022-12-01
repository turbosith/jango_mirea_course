package laby.lab_3;

public class TestFurniture {
    public static void main(String[] args) {
    Chair chair=new Chair("Офисный","Дерево");
    System.out.println(chair);
    chair.setBroken(true);
    Sofa sofa = new Sofa("Удобство-3000", "Кожа","Черный");
    System.out.println(sofa);

    }

}
