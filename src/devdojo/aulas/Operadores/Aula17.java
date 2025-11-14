package devdojo.aulas.Operadores;

public class Aula17 {
    static void main(String[] args) {
        // && (AND)
        int age = 35;
        float  wage = 3500F;
        boolean isLegalOlderThanTrirty = age >= 30 && wage >= 4500;
        boolean isLegalYoungerThanTrirty = age < 30 && wage >= 3000;

        System.out.println("isLegalOlderThanTrirty" + isLegalOlderThanTrirty);
        System.out.println("isLegalYoungerThanTrirty" + isLegalYoungerThanTrirty);
    }
}
