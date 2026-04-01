package devdojo.aulas.EstruturasCondicionais;

import java.util.Scanner;

public class Aula23and24 {
    static void main(String[] args) {
        // PROBLEM: I wanna know how much i gotta pay taxes in the Netherlands based on my salary annual;
        // 0 - 34712 = 9,7% || 34713 - 68507 = 37.35%  || over 68507 = 49.5%
        Scanner Rebeca = new Scanner(System.in); // "Rebeca" but any word works
        double annualSalary;
        double amountToBePaid;

        System.out.println("How much is your annual salary ? ");
        annualSalary = Rebeca.nextDouble();

        // Catch the tax based on conditions e.g 9.7%  = 9.7 / 100 = 0,097;
        // This is the formula I used in the others conditions

        if (annualSalary <= 34712) {
            amountToBePaid = annualSalary * 0.097;
        } else if (annualSalary >= 34713 && annualSalary <= 68507) {
            amountToBePaid = annualSalary * 0.3735;
        } else {
            amountToBePaid = annualSalary * 0.495;
        }
        System.out.println(amountToBePaid);
    }
}
