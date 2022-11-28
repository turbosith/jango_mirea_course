package laby.prac_9;



public class Main {
    public static void main(String[] args) {
        try{
            String fio = "Павлова ЕА";
            String INN = "123456289102";
            Client client = new Client(fio, INN);
            System.out.println(client);
        }catch (INNException e){
            System.out.println("Недействительный ИНН:  "+e.getMessage());
            System.out.println("dsws");
            return;
        }finally{
            System.out.println(1);
        }
    }
}
