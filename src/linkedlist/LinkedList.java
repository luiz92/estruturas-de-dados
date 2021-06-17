package linkedlist;

public class LinkedList implements EstruturaDados {

    private class Node {
        private Pessoa data;
        private Node next;
        public Node(Pessoa pessoa) {
            this.data = pessoa;
        }
        public Pessoa getData() {
            return data;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head;

    @Override
    public void adicionar(Pessoa pessoa) {
        Node node = new Node(pessoa);
        if (this.head == null) {
            this.head = node;
        } else if (this.head.getNext() == null) {
            this.head.setNext(node);
        } else {
            node.setNext(this.head.getNext());
            this.head.setNext(node);
        }
    }

    public void adicionarInicio(Pessoa pessoa) {
        Node node = new Node(pessoa);
        if (this.head != null) {
            node.setNext(this.head);
        }
        this.head = node;
    }

    public void adicionarFim(Pessoa pessoa) {
        Node newNode = new Node(pessoa);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node node = this.head;
            while (node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(newNode);
        }
    }

    @Override
    public void buscar(String nome) {
        Node node = this.head;
        while (node != null) {
            Pessoa pessoa = node.getData();
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Encontrado pessoa: " +pessoa);
            }
            node = node.getNext();
        }
    }

    @Override
    public void remover(Pessoa pessoa) {
        Node node = this.head;
        Node previous = null;
        while (node != null) {
            if (node.getData().equals(pessoa)) {
                if (previous == null) {
                    this.head = this.head.getNext();
                    System.out.println("Removido: " +pessoa);
                } else {
                    previous.setNext(node.getNext());
                    System.out.println("Removido: " +pessoa);
                }
                break;
            }
            previous = node;
            node = node.getNext();
        }
    }

    @Override
    public void remover(int index) {
        Pessoa pessoa = this.getPessoa(index);
        this.remover(pessoa);
    }

    @Override
    public void listarTodos() {
        System.out.println("Lista de pessoas existentes:");
        Node node = this.head;
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    @Override
    public Pessoa getPessoa(int index) {
        int cont = 0;
        Node node = this.head;
        while (node != null) {
            if (cont++ == index) {
                return node.getData();
            }
            node = node.getNext();
        }
        return null;
    }
}
