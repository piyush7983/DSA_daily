class Solution {
    int max=0;
    public int maxDistance(int[] nums1, int[] nums2) {
        
        
        for(int i=0;i<nums1.length;i++){
            binary(nums1,nums2,i);
        }
        return max;

    }
    public void binary(int nums1[],int []nums2,int i){

        int s=i;
        int e=nums2.length-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums2[mid]<nums1[i]){
                e=mid-1;
               

            }
            else if(nums2[mid]>=nums1[i]){
                s=mid+1;
                max=Math.max(max,mid-i);
            }
        }

    }
}
