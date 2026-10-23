public class ContainerMostWater {
    public static int maxArea(int[] height) { // O(n)
        int st = 0, end = height.length-1;
        int maxWater = 0;
        while(st < end) {
            int ht = Math.min(height[end], height[st]);
            int width = end-st;
            int currArea = ht*width;
            maxWater = Math.max(maxWater, currArea);
            if(height[st] < height[end]) {  // updating the line with less height may give more area.
                st++;
            }
            else {
                end--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
