package org.lxb;

public class half_search {

    //一个增序的数组 使用二分查找寻找 其中 target 属于 [a,b]
    public static int search(int[] arr, int target) {

        int left = 0, right = arr.length - 1;

        if(target < arr[left] || target > arr[right]) {
            return -1;
        }

        while(left <= right) {
            int middle = left + ((right - left) >> 1);
            if(arr[middle] < target) {
                left = middle + 1;
            } else if(arr[middle] > target) {
                right = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,6,9,10,15};
        int c = search(arr,0);
        System.out.println("c = " + c);
    }
}
