package laby.prac_9;



public class Main {
    public static void main(String[] args) {
        try{
            String fio = "Евдокимов ДИ";
            String INN = "12345628910";
            Client client = new Client(fio, INN);
            System.out.println(client);
        }catch (INNException e){
            System.out.println("Недействительный ИНН:  "+e.getMessage());

        }finally{

        }
    }
}
