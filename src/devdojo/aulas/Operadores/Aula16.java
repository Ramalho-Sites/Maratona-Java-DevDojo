package devdojo.aulas.Operadores;

public class Aula16 {
    static void main(String[] args) {
        // %
        int  modulo = 21 % 7;
        System.out.println(modulo);

        //< > <= >= != ==
        boolean isTenLowerThanTwenty = 10 < 20;
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLowerOrEqualThanTwenty = 10 <= 20;
        boolean isTenGreaterOrEqualThanTwenty = 10 >= 20;
        boolean isTenDifferentThanTwenty = 10 != 20;
        boolean isTenEqualTwenty = 10 == 20;

        System.out.println("isTenLowerThanTwenty"+ isTenLowerThanTwenty);
        System.out.println("isTenGreaterThanTwenty" + isTenGreaterThanTwenty);
        System.out.println("isTenLowerOrEqualThanTwenty" + isTenLowerOrEqualThanTwenty);
        System.out.println("isTenGreaterOrEqualThanTwenty" + isTenGreaterOrEqualThanTwenty);
        System.out.println("isTenDifferentThanTwenty" + isTenDifferentThanTwenty);
        System.out.println("isTenEqualTwenty " + isTenEqualTwenty );

    }
}
