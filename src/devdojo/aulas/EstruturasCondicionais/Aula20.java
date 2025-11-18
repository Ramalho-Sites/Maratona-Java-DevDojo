package devdojo.aulas.EstruturasCondicionais;

public class Aula20 {
    static void main(String[] args) {
        int age = 20;
        boolean authorizedForBuyDriks = age >= 18;

        if (authorizedForBuyDriks){
            System.out.println("Tome aqui sua cachaça");
        }

        //SE NAO
        if (!authorizedForBuyDriks){
            System.out.println("Voce nao pode comprar vc nao tem 18 anos!");
        }

    }
}
