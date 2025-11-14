package devdojo.aulas.Operadores;

public class Aula19 {
    static void main(String[] args) {
        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; //bonus = bonus + 1000;
        bonus -= 1000; //bonus = bonus - 1000;
        bonus *= 2; //bonus = bonus * 2;
        bonus /= 2; //bonus = bonus / 2;
        bonus %= 2; //bonus = bonus % 2;
        System.out.println("bonus " + bonus);

        //++ --
        int count = 10;
        int count2 = 10;
        ++count;
        count2++;

        System.out.println("count " + ++count);
        System.out.println("count " + count2++);
        System.out.println(count2);

        //No caso COUNT ele incrementou o valor ++ antes, entao ja aparece com o valor;
        //No caso COUNT2 ele  incrementa depois, entt o valor so sera mostrado no proximo print, igual esta sendo representado na linha 21 e 22;

    }
}
