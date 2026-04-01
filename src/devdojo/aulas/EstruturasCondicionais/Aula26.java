package devdojo.aulas.EstruturasCondicionais;

import java.util.Scanner;

public class Aula26 {
    static void main(String[] args) {
        //Using switch, print if the day is business day or weekend;
        //Giving the numbers 1 to 7, 1 being Sunday;
        Scanner Rebeca = new Scanner(System.in);
        byte day;

        System.out.println("Which day you wanna know is Businnes day or Weekend ? (1-7)");
        day = Rebeca.nextByte();

        switch (day) {
            case 1:
                System.out.println("Weekend");
                break;
            case 2:
                System.out.println("Business Day");
                break;
            case 3:
                System.out.println("Business Day");
                break;
            case 4:
                System.out.println("Business Day");
                break;
            case 5:
                System.out.println("Business Day");
                break;
            case 6:
                System.out.println("Business Day");
                break;
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Data Invalida ");
                break;

        }

    }
}
