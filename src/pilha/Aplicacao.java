package pilha;
import java.time.LocalDate;

public class Aplicacao {
    public static void main(String[] args) {
        Pilha listPilha = new Pilha();
        var pessoa1 = new Pessoa("Luiz", "luiz@email.com.br", LocalDate.of(1992, 11, 2));
        var pessoa2 = new Pessoa("Ana", "ana@email.com.br", LocalDate.of(1988, 8, 8));
        var pessoa3 = new Pessoa("Pedro", "pedro@email.com.br", LocalDate.of(1995, 9, 5));
        var pessoa4 = new Pessoa("Caio", "caio@email.com.br", LocalDate.of(2000, 2, 3));

        listPilha.adicionar(pessoa1);
        listPilha.adicionar(pessoa2);
        listPilha.adicionar(pessoa3);
                System.out.println();
        listPilha.buscar("caio");
        listPilha.buscar("luiz");
                System.out.println();
        listPilha.remover(pessoa3);
        listPilha.remover(0);
                System.out.println();
        listPilha.adicionar(pessoa4);
        listPilha.listarTodos();
                System.out.println();
        final var pessoa = listPilha.getPessoa(0);
        System.out.println("getPessoa: " + pessoa);
    }
}

