package com.xrca.strategy;

public class Sorter<T> {

    public void sort(T[] arr, Comparator<T> comparator) {
        // 每一次冒泡后，尾部的排序完成数量就会加1
        for (int i = 0; i < arr.length - 1; i++) {
            // 只需循环到未排序(length - i)的尾部的前一个
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private void swap(T[] arr, int i, int j) {
        T o = arr[j];
        arr[j] = arr[i];
        arr[i] = o;
    }
}
