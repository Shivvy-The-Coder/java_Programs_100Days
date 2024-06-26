package Day1;

/**

    This is the first question of my 100 days coding journey.

    leetcode Qno 1121
  
 
 Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.

 

Example 1:

Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]
Example 2:

Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
Output: [22,28,8,6,17,44]
 

Constraints:

1 <= arr1.length, arr2.length <= 1000
0 <= arr1[i], arr2[i] <= 1000
All the elements of arr2 are distinct.
Each arr2[i] is in arr1.  **/



import java.util.Arrays;
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2)
    {
        int j=0,i=0;
        for (int p=0;p<arr2.length;p++)
            {
                j=i;
                while(j<arr1.length && i<=j)
                {
                    if(arr2[p]==arr1[j])
                        {
                            int temp=arr1[j];
                            arr1[j]=arr1[i];
                            arr1[i]=temp;

                            i++;
                        }
                    j++;
                }

            }
            int arr[]= new int[arr1.length-i];
            for(int k=i;k<arr1.length;k++)
                {
                   arr[k-i]=arr1[k];
                }
            Arrays.sort(arr);
            for(int k=i;k<arr1.length;k++)
                {
                    arr1[k]=arr[k-i];
                }
        return arr1;
    }
}