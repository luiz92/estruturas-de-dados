package ordenacao;

public class Aplicacao {
    public static void main(String[] args) {
        // MERGE SORT
        int[] mergeList = { 12, 11, 1, 13, 5, 6, 15, 7,19, 0};
        MergeSort mergerSort = new MergeSort();
        mergerSort.mergeSort(mergeList, 0, mergeList.length - 1);
        MergeSort.listarTudo(mergeList);

        //SELECTION SORT
        System.out.println();
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionList();

        //BUBBLE SORT
        System.out.println();
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.selectionList();
    }
}
