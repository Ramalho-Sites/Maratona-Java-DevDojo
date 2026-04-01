package devdojo.aulas.EstruturasCondicionais;

import java.util.Scanner;

public class Aula25 {
    static void main(String[] args) {
        Scanner Rebeca = new Scanner(System.in);
        byte day;
        // char, int, byte, short, enum, String

        System.out.println("Which a day: (1 - 7) ");
        day = Rebeca.nextByte();

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid!!!!");
                break;

        }
    }
}
