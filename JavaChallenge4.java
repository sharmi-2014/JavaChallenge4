package javachallenge;

import java.util.Arrays;

public class JavaChallenge4 {

	public static void main(String[] args) {
	int[] nums = {2,2,1};
	int[] nums1= {4,1,2,1,2};
	int[] nums2= {1};
	Arrays.sort(nums);
    //int length=nums.length;
    //System.out.println(length);
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i]!=nums[i+1]) {
				
			
		System.out.println(nums[i]+ " ");
		break;
			}
		}
		for(int j=0;j<nums1.length-1;j++) {
			if(nums1[j]!=nums1[j+1]) {
				System.out.println(nums1[j]+ " ");
				break;
			}
		}
		for(int k=0;k<nums2.length;k++) {
			if(nums2[k]!=nums2.length+1) {
				System.out.println(nums2[k]+ " ");
				break;
			}
			}
		}
		
	}
