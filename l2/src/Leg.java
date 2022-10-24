public class Leg {
    int dlina;
    public void setDlina(int n){
        this.dlina=n;
    }
    public void sognutLeg(){
        this.dlina=this.dlina/2;
    }
    public void getDlina(){
        System.out.println("Длина ноги "+this.dlina);
    }
    public void cut(){
        this.dlina=0;
    }

}
