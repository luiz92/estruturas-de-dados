package ordenacao;

class SelectionSort{
    private final int[] sortList = {5, 19, 14, 2, 8, 6, 9, 0, 11, 13};

    public void selectionList(int sortList[]){
        for (int i = 0; i < sortList.length-1; i++){ // Percorre indice por indice
            int menorIndice = i;
            for (int x = i+1; x < sortList.length; x++) { // Verifica se o indice menor do que os outros
                if (sortList[x] < sortList[menorIndice]) { // Se for, armazena para troca
                    menorIndice = x;
                }
            }
            int temp = sortList[menorIndice]; // Realiza a troca dos valores
            sortList[menorIndice] = sortList[i];
            sortList[i] = temp;
        }
        // Ao final, exibe a lista ordenada
        System.out.print("Lista ordenada Selection Sort: ");
        for (int j : sortList) System.out.printf("%d  " ,j );
    }
}
