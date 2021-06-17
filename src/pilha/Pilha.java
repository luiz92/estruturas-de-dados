package pilha;

public class Pilha implements EstruturaDados {
    private Pessoa[] listPilha = new Pessoa[10];
    private int qtd = 0;

    @Override
    public void adicionar(Pessoa pessoa) {
        if (this.listPilha.length == qtd) {
            this.aumentarCapacidade();
        }
        this.listPilha[qtd++] = pessoa;
    }

    private void aumentarCapacidade() {
        final var tempUsuarios = this.listPilha;
        this.listPilha = new Pessoa[listPilha.length * 2];
        System.arraycopy(tempUsuarios, 0, this.listPilha, 0, this.qtd);
    }

    @Override
    public void buscar(String nome) {
        if (listPilha[qtd-1].getNome().equalsIgnoreCase(nome)) {
            System.out.println(listPilha[qtd-1]);
        } else {
            System.out.println("Só é possível ver o último item adicionado!");
        }
    }

    @Override
    public void remover(Pessoa pessoa) {
        if (listPilha[qtd-1] == pessoa){
            System.out.println("Removido: " +listPilha[qtd-1]);
            listPilha[qtd-1] = null;
            qtd--;
        } else {
            System.out.println("Este não é o último item adicionado\nSó é possível remover o último item adicionado!");
        }
    }

    @Override
    public void remover(int index) {
        if (qtd-1 == index){
            System.out.println("Removido: " +listPilha[qtd-1]);
            listPilha[qtd-1] = null;
            qtd--;
        } else {
            System.out.println("Só é possível remover o último item adicionado!");
        }
    }

    @Override
    public void listarTodos() {
        int i=0;
        while (listPilha[i] != null) {
            System.out.println(listPilha[i]);
            i++;
        }
    }

    @Override
    public Pessoa getPessoa(int index) {
        int cont = 0;
        while (listPilha != null) {
            if (cont++ == index) {
                return listPilha[index];
            }
        }
        return null;
    }
}
