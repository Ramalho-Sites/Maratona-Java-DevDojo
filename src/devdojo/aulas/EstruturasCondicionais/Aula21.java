package devdojo.aulas.EstruturasCondicionais;

public class Aula21 {
    static void main(String[] args) {
        int age = 10;
        if (age < 15){
            System.out.println("Categoria Infantil");
        } else if (age >= 15 && age < 18) {
            System.out.println("Categoria Juvenil");
        }else{
            System.out.println("Categoria Adulto");
        }
    }
}
