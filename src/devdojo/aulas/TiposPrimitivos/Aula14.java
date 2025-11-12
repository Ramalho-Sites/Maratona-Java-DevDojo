package devdojo.aulas.TiposPrimitivos;
/*
Prática
-----------------------------------------------------------------------------------------
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
-Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>,na data <data>
-----------------------------------------------------------------------------------------
*/
public class Aula14 {
    static void main(String[] args) {
        String name = "Davi";
        String adress = "House Of Dragons";
        float wage = 600;
        String date = "12/11/2025";
        String result = "Eu "+name+",morando no endereço "+adress+",confirmo que recebi o salário de "+wage+",na data "+date;

        System.out.println(result);

    }
}
