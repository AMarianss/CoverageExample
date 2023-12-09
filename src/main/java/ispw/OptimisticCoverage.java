package ispw;


import java.util.Scanner;

public class OptimisticCoverage {

    private String[] nomiPersone;

    public void aggiungiPersone() {

        Scanner scanner = new Scanner(System.in);
        int i = 1;
        String buff;
        while (true) {
            System.out.println("Scrivi il nome della persona da voler aggiungere alla posizione" + i + "(esc se uscire): ");
            buff = scanner.nextLine();
            if (buff.equals("esc")) {
                System.out.println("Hai finito di inserire i nomi");
                break;
            } else {
                nomiPersone[i - 1] = buff;
            }
        }
    }
    public static void main(String[] args){
        OptimisticCoverage me = new OptimisticCoverage();
        me.aggiungiPersone();
        for (int i = 0; i < me.nomiPersone.length; i++) {
            System.out.println(me.nomiPersone[i]);
        }
    }
}