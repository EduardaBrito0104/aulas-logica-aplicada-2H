public class Main {
    public static void main(String[] args) {
        // Aula introdutoria de Orientação á Objetos
        //Declaração de objeto
        Pessoa adao;
        // Instaciação do objeto
        adao = new Pessoa();
        // Ao mesmo tempo
        Pessoa qualquer = new Pessoa();
        // Definir formato do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        qualquer.falar();
        System.out.println(qualquer.falar("oi"));

        // Criar novos objetos
        // Declarar objetos
        Pessoa rainha;
        // instanciar objetos
        rainha = new Pessoa();
        // Definir forma do objeto
        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";
        // Definição do comportamento
        rainha.falar();
        rainha.comer();


    }
}