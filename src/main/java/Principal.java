public class Principal {
    public static void main(final String[] args) {

        CidadeRecord cidadeRecord = new CidadeRecord("Palmas");
        System.out.println("CidadeRecord: " + cidadeRecord.nome());

        CidadeMutavel cidadeMutavel = new CidadeMutavel("Palmas");
        System.out.println("CidadeMutavel antes: " + cidadeMutavel.getNome());
        cidadeMutavel.setNome("Porto Nacional");
        System.out.println("CidadeMutavel depois: " + cidadeMutavel.getNome());

        PessoaRecordShallow pessoaShallow = new PessoaRecordShallow("João", cidadeMutavel);
        System.out.println("PessoaRecordShallow: " + pessoaShallow.nome() + " - " + pessoaShallow.cidade().getNome());

        PessoaRecord pessoaRecord = new PessoaRecord("Maria", cidadeRecord);
        System.out.println("PessoaRecord: " + pessoaRecord.nome() + " - " + pessoaRecord.cidade().nome());

    }
}
