package org.lxb;

public class half_search {

    //一个增序的数组 使用二分查找寻找 其中 target 属于 [a,b]
    public static int search_bi(int[] arr, int target) {

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

    //一个增序的数组 使用二分查找寻找 其中 target 属于 [a,b)
    public static int search_kai(int[] arr, int target) {

        /**
         * 在这里将 arr.length - 1 改为 arr.length 是要符合左闭右开区间的要求
         * 保证在开始时候最右边的元素在讨论的范畴之内
         */
        int left = 0, right = arr.length;


        if(target < arr[left] || target >= arr[right]) {
            return -1;
        }

        while(left < right) {
            int middle = left + ((right - left) >> 1);
            if(arr[middle] < target) {
                left = middle + 1;
            } else if(arr[middle] > target) {
                right = middle;
            } else {
                return middle;
            }
        }

        return -1;
    }



    public static void main(String[] args) {
        int arr[] = {1,5,6,9,10,15};
        //int c = search_bi(arr,0);
        int c = search_kai(arr,15);

        System.out.println("c = " + c);
    }
}
