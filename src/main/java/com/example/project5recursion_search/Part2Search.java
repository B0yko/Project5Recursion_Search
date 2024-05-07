package com.example.project5recursion_search;

import java.util.ArrayList;

public class Part2Search {

    public static int recLinearSearch(ArrayList<String> list, String key, int beginIdx, int endIdx) {
        if (beginIdx > endIdx) {
            return -1;
        }
        if (list.get(beginIdx).equals(key)) {
            return beginIdx;
        } else {
            return recLinearSearch(list, key, beginIdx + 1, endIdx);
        }
    }

    public static int binarySearch(int[] a, int search) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == search) {
                return mid;
            } else if (a[mid] < search) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] a, int search, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (a[mid] == search) {
            return mid;
        } else if (a[mid] < search) {
            return recursiveBinarySearch(a, search, mid + 1, high);
        } else {
            return recursiveBinarySearch(a, search, low, mid - 1);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("grape");
        String key = "orange";
        int index = recLinearSearch(list, key, 0, list.size() - 1);
        System.out.println("Index of " + key + " in the list: " + index);

        int[] array = {2, 3, 5, 10, 16, 24, 32, 48, 96, 120, 240, 360, 800, 1600};
        int searchElement = 10;
        int binarySearchIndex = binarySearch(array, searchElement);
        System.out.println("Index of " + searchElement + " in the array using binary search: " + binarySearchIndex);

        int[] arrayForTrace = {2, 3, 5, 10, 16, 24, 32, 48, 96, 120, 240, 360, 800, 1600};
        int keyForTrace = 10;
        int indexForTrace = recursiveBinarySearch(arrayForTrace, keyForTrace, 0, arrayForTrace.length - 1);
        System.out.println("Index of " + keyForTrace + " in the array using recursive binary search: " + indexForTrace);
    }
}