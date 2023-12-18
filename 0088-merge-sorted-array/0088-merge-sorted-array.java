class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
      int left = m-1;
      int right = 0;

      while(left>=0 && right<n)
      {
          if(nums1[left]>nums2[right])
          {
                int temp = nums2[right];
                nums2[right] = nums1[left];
                nums1[left] = temp;
                left--;right++;
          } 
          else
          {
              break;
          }
      }

      Arrays.sort(nums1,0,m);
      Arrays.sort(nums2);
      int index = m;

      for(int num:nums2)
      {
          nums1[index++] = num;
      }
    }
}