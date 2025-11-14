package devdojo.aulas.Operadores;

public class Aula18 {
    static void main(String[] args) {
        // || OR !
        double currentAccount = 299;
        double savingsAccount = 3000;
        float plasystationFIvePrice = 500;

        boolean canBeBought = currentAccount > plasystationFIvePrice || savingsAccount > plasystationFIvePrice;
        System.out.println("canBeBought" + canBeBought);
    }
}
