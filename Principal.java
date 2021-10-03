public class Principal {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Josué", 123, 2);

        Endereco end1 = new Endereco("Rua Sebastião Moreira da Silva", "Jardim dos Estados", 55);
        Endereco end2 = new Endereco("Rua Papuana", "Coqueiral", 105);

        p1.addEndereco(end1);
        p1.addEndereco(end2);

        p1.mostraInfo();
    }

}
