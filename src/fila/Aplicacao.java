package fila;
import java.time.LocalDate;

public class Aplicacao {

    public static void main(String[] args) {
        Fila listFila = new Fila();
        var pessoa1 = new Pessoa("Luiz", "luiz@email.com.br", LocalDate.of(1992, 11, 2));
        var pessoa2 = new Pessoa("Ana", "ana@email.com.br", LocalDate.of(1988, 8, 8));
        var pessoa3 = new Pessoa("Pedro", "pedro@email.com.br", LocalDate.of(1995, 9, 5));
        var pessoa4 = new Pessoa("Caio", "caio@email.com.br", LocalDate.of(2000, 2, 3));

        listFila.adicionar(pessoa1);
        listFila.adicionar(pessoa2);
        listFila.adicionar(pessoa3);
                System.out.println();
        listFila.listarTodos();
        listFila.buscar("pedro");
        listFila.buscar("luiz");
                System.out.println();
        listFila.remover(pessoa2);
        listFila.remover(0);
                System.out.println();
        listFila.adicionar(pessoa4);
        listFila.listarTodos();
                System.out.println();
        final var pessoa = listFila.getPessoa(0);
        System.out.println("getPessoa: " +pessoa);
    }
}