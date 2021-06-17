package linkedlist;
import java.time.LocalDate;

public class Aplicacao {

    public static void main(String[] args) {
        LinkedList listLinked = new LinkedList();
        var pessoa1 = new Pessoa("Luiz", "luiz@email.com.br", LocalDate.of(1992, 11, 2));
        var pessoa2 = new Pessoa("Ana", "ana@email.com.br", LocalDate.of(1988, 8, 8));
        var pessoa3 = new Pessoa("Pedro", "pedro@email.com.br", LocalDate.of(1995, 9, 5));
        var pessoa4 = new Pessoa("Caio", "caio@email.com.br", LocalDate.of(2000, 2, 3));

        listLinked.adicionar(pessoa1);
        listLinked.adicionar(pessoa2);
        listLinked.adicionar(pessoa3);
        listLinked.listarTodos();
                System.out.println();
        listLinked.buscar("pedro");
        listLinked.buscar("luiz");
                System.out.println();
        listLinked.remover(pessoa2);
        listLinked.remover(0);
                System.out.println();
        listLinked.adicionar(pessoa4);
        listLinked.listarTodos();
                System.out.println();
        final var pessoa = listLinked.getPessoa(0);
        System.out.println("getPessoa: " +pessoa);
    }
}