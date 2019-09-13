package Leetcode.Array;

public class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length-1;
        m--; n--;
        while (m >= 0 && n >= 0){
            nums1[i--] = nums1[m] >= nums2[n]? nums1[m--]: nums2[n--];
        }
        while (n>=0){
            nums1[i--] = nums2[n--];
        }
    }
}
