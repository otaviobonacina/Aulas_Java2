 public class Exemplo {
    public static void main (String[]args){
        Pessoa pes = new Pessoa();
        pes.setNome("Otavio Bonacina");

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("fulano");
        pf.setCpf("123456789"); //salvar em string dados pessoais



        System.out.println("ola mundo");
        System.out.println(pes.getNome());

        ExemploFor.execute();
        ExemploWhile.execute();


    }
} 

