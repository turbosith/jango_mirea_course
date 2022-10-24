public class Hand {
    int dlina=0;
    public void setDlina(int n){
        this.dlina=n;
    }
    public void sognutHand(){
        this.dlina=this.dlina/2;
    }
    public void cut(){
        this.dlina=0;
    }
    public void getDlina(){
        System.out.println("Длинна руки "+this.dlina);
    }


}
