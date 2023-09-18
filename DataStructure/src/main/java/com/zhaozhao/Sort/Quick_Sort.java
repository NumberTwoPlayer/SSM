package com.zhaozhao.Sort;

/**
 * @author 刘梹晨
 * @Classname Quick_Sort
 * @Date 2023/9/7 11:41
 *
 * 关于快速排序的实现代码
 */

public class Quick_Sort {
    public static void Sort(int[] arr, int leftBount, int rightBount) {
        if (leftBount >= rightBount) {
            return;
        }
        int mid = quick_Sort(arr, leftBount, rightBount);
        Sort(arr, leftBount, mid - 1);
        Sort(arr, mid + 1, rightBount);
    }

    public static int quick_Sort(int[] arr, int leftBount, int rightBount) {
        int left = leftBount;
        int right = rightBount - 1;
        int pivot = arr[rightBount];
        while (left <= right) {
            while (left <= right && arr[left] <= pivot)
                left++;
            while (left <= right && arr[right] >= pivot)
                right--;
            if (left <= right)
                swap(arr, left, right);
            System.out.println("left--->" + left + "right--->" + right);
        }
        System.out.println("--");
        print(arr);
        System.out.println();
        swap(arr,left,rightBount);
        return left;
    }

    public static void swap(int[] arr, int left, int right) {
        int test = arr[left];
        arr[left] = arr[right];
        arr[right] = test;
    }
    public static void print(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
