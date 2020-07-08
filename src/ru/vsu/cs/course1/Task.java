package ru.vsu.cs.course1;


public class Task {
    public static int[] process(int[] arr) throws Exception {
        MyLinkedList<Integer> nlist = new MyLinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            nlist.addFirst(arr[i]);
        }
        int max = nlist.get(0);
        for (int i = 0; i<nlist.size; i++){
            if (max<=nlist.get(i)){
                max = nlist.get(i);
            }
        }
        int n = 0;
        for (int i = 0; i<nlist.size; i++){
            if (max==nlist.get(i)){
                n++;
            }
        }
        int [] array = new int [0];
        array[0] = n;

        return array;
    }

}
