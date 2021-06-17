package ordenacao;

class MergeSort{

    void mergeList(int mergeList[], int esquerdaR, int meio, int direitaR){
        // "divide" a array em 2, para depois serem mescladas
        int num1 = meio - esquerdaR + 1;
        int num2 = direitaR - meio;
        // array temporaria para manipulação dos valores
        int[] esquerda = new int[num1];
        int[] direita = new int[num2];
        // faz a cópia dos dados para a matriz temporaria
        for (int i = 0; i < num1; ++i) {
            esquerda[i] = mergeList[esquerdaR + i];
        }
        for (int j = 0; j < num2; ++j) {
            direita[j] = mergeList[meio + 1 + j];
        }
        // primeiros indices das 2 metades
        int i = 0, j = 0;
        // condições de troca
        int k = esquerdaR;
        while (i < num1 && j < num2) {
            if (esquerda[i] <= direita[j]) {
                mergeList[k] = esquerda[i];
                i++;
            }
            else {
                mergeList[k] = direita[j];
                j++;
            }
            k++;
        }
        //Copia os valores de esquerda
        while (i < num1) {
            mergeList[k] = esquerda[i];
            i++;
            k++;
        }
        //Copia os valores de direita
        while (j < num2) {
            mergeList[k] = direita[j];
            j++;
            k++;
        }
    }
    //Metodo principal que fará a classificação dos valores
    void mergeSort(int[] mergeList, int esquerda, int direita){
        if (esquerda < direita) {
            // Necessario para encontrar a metade da array
            int meio =esquerda+ (direita-esquerda)/2;
            // Faz a classificação dos valores da primeira e segunda metade
            mergeSort(mergeList, esquerda, meio);
            mergeSort(mergeList, meio + 1, direita);
            // Mescla com os valores já classificados
            mergeList(mergeList, esquerda, meio, direita);
        }
    }
    // Ira fazer a impressão dos valores, independente do tamanho da array
    static void listarTudo(int[] mergeList){
        System.out.print("Lista ordenada com Merge Sort: ");
        for (int j : mergeList) System.out.printf("%d ", j);
    }
}