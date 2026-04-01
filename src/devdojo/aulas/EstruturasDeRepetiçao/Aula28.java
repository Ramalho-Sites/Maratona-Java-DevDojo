package devdojo.aulas.EstruturasDeRepetiçao;

public class Aula28 {
    // Print all even numbers from  0 to 1000000
    static void main(String[] args) {
        for (int  i = 0; i <= 1000000; i ++) // learn the shortcut type fori
            if(i % 2 == 0){  // odd i % 2 == 1
                System.out.println(i);
            }
    }
}
