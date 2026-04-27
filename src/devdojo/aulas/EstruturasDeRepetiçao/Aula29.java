package devdojo.aulas.EstruturasDeRepetiçao;

public class Aula29 {
    static void main(String[] args) {
        // Given a total number,e.g 50, print the first 25
        int maxNumber = 50;
        for (int i = 0; i <= maxNumber; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
