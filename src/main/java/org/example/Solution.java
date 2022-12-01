package org.example;

public class Solution {
    public Solution(){

    }

    public int maxArea(int[] height) {

        int firstHeight = 0;
        int lastHeight = height.length - 1;
        int result = 0;

        while(firstHeight < lastHeight){

            int length = lastHeight - firstHeight;
            int width = Math.min(height[firstHeight], height[lastHeight]);
            int area = length * width;

            if(result < area){

                result = area;
            }

            if(height[firstHeight] < height[lastHeight]){

                firstHeight ++;
            }else{

                lastHeight --;
            }
        }

        return result;
    }
}