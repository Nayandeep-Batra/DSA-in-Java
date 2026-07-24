public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int st = 0, end = height.length-1;
        int maxArea = 0;
        while(st < end) {
            int currArea = 0;
            int width = end-st;
            int wallHeight = Math.min(height[st], height[end]);
            currArea = width * wallHeight;
            maxArea = Math.max(currArea, maxArea);
            if(height[st] < height[end]) {
                st++;
            }
            else{
                end--;
            }
        }
        return maxArea;
    }    
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};    
        System.out.println(maxArea(height));
    }
}
