package ordenacao;

public class BubbleSort{

    private final int[] bubbleList = {14, 11, 9, 1, 17, 0, 2, 5, 13, 6};

    public void selectionList(){
        int num = bubbleList.length;
        for (int i = 0; i < num-1; i++) { // Percorre indice por indice
            for (int j = 0; j < num - i - 1; j++) { // Verifica se o indice é menor do que os outros
                if (bubbleList[j] > bubbleList[j + 1]) { // Se for, realiza a troca
                    int temp = bubbleList[j];
                    bubbleList[j] = bubbleList[j + 1];
                    bubbleList[j + 1] = temp;
                }
            }
        }
        System.out.print("Lista ordenada Bubble Sort: ");
        for (int j : bubbleList) System.out.printf("%d  " ,j );
    }
}