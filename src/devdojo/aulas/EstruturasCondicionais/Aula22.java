package devdojo.aulas.EstruturasCondicionais;

public class Aula22 {
    static void main(String[] args) {
        // if salary > 2000 "buy ps5" or "don´t buy ps5"
        double salary = 3000;
        String shouldBuyMessage = "buy ps5";
        String shouldNotBuyMessage = "don´t buy ps5";

        // (condition) ?  <true> : <false>    exactly type e.g STRING ALL OR INT ALL
        String result = salary > 2000 ? shouldBuyMessage : shouldNotBuyMessage;

        System.out.println(result);
    }
}
