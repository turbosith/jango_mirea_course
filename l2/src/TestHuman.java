public class TestHuman {
    public static void main(String[] args) {
        Leg ll  = new  Leg();
        Head hee  = new  Head();
        Hand haa = new  Hand();
        Human a1 = new  Human(18, hee,ll,haa);
        Leg l=a1.getLeg();
        Head he=a1.getHead();
        Hand ha=a1.getHand();
        ha.setDlina(90);
        ha.getDlina();
        ha.sognutHand();
        ha.getDlina();
        ha.cut();
        ha.getDlina();
        he.milkTeeth(true);
        he.getTeeth();
        he.snatchTeeth();
        he.getTeeth();
        l.setDlina(90);
        l.getDlina();
        l.sognutLeg();
        l.getDlina();
        l.cut();
        l.getDlina();
        a1.getAge();
        a1.makeYoung();
        a1.getAge();
        a1.makeOld();
        a1.getAge();
    }
}
