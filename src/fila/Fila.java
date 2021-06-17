package fila;

public class Fila implements EstruturaDados {
    private Pessoa[] listFila = new Pessoa[10];
    private int qtd = 0;

    @Override
    public void adicionar(Pessoa pessoa) {
        if (this.listFila.length == qtd+1) {
            this.aumentarCapacidade();
        }
        int cont = qtd;
        if (listFila[0] != null){ // Se não existir valor na fila
            while (cont != 0){ // Será feito a trocar dos valores
                listFila[cont] = listFila[cont-1]; // add o ultimo valor no indice +1
                cont--;
            }
        }
        this.listFila[0] = pessoa;
        qtd++;
    }

    private void aumentarCapacidade() {
        final var tempUsuarios = this.listFila;
        this.listFila = new Pessoa[listFila.length * 2];
        System.arraycopy(tempUsuarios, 0, this.listFila, 0, this.qtd);
    }

    @Override
    public void buscar(String nome) {
        if (listFila[qtd-1].getNome().equalsIgnoreCase(nome)) {
            System.out.println("Último item encontrado: " +listFila[qtd-1]);
        } else if (listFila[0].getNome().equalsIgnoreCase(nome)) {
            System.out.println("Primeiro item encontrado: " +listFila[0]);
        } else {
            System.out.println("Só é possível ver o Primeiro ou Último item adicionado!");
        }
    }

    @Override
    public void remover(Pessoa pessoa) {
        if (listFila[0] == pessoa){
            int cont = 0;
            System.out.println("Removido: " + listFila[0]);
            listFila[0] = null;
            while (cont != qtd){ // Será feito a trocar dos valores
                listFila[cont] = listFila[cont+1]; // add o ultimo valor no indice +1
                cont++;
            }
            listFila[cont] = null;
            qtd--;
        } else {
            System.out.println("Só é possível remover o último item adicionado, que é o 1º da fila!");
        }
    }

    @Override
    public void remover(int index) {
        if (0 == index){
            int cont = 0;
            System.out.println("Removido: " + listFila[0]);
            listFila[0] = null;
            while (cont != qtd){ // Será feito a trocar dos valores
                listFila[cont] = listFila[cont+1]; // add o ultimo valor no indice +1
                cont++;
            }
            listFila[cont] = null;
            qtd--;
        } else {
            System.out.println("Só é possível remover o último item adicionado, que é o 1º da fila!");
        }
    }

    @Override
    public void listarTodos() {
        int i=0;
        while (listFila[i] != null) {
            System.out.println(listFila[i]);
            i++;
        }
    }

    @Override
    public Pessoa getPessoa(int index) {
        int cont = 0;
        while (listFila != null) {
            if (cont++ == index) {
                return listFila[index];
            }
        }
        return null;
    }
}
