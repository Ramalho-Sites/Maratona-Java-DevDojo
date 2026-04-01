package devdojo.aulas.EstruturasDeRepetiçao;

public class Aula27 {
    static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println("Numero " + ++count); // increment ++ the same thing of count + 1 or count += 1
        }
        do {
            System.out.println("inside do while" + ++count);
        } while (count < 10);

        for (int i = 0; i < 10; ++i) {
            System.out.println("For:" + i);
        }
    }
}
