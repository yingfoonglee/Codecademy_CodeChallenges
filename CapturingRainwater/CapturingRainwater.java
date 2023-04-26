public class CapturingRainwater {
    public static void main(String[] args) {
        int[] heights = new int[] {4, 2, 1, 3, 0, 1, 2};
        System.out.println(capturingRainwater(heights));
    }

    public static int capturingRainwater(int[] heights) {
        // Write your code here
        int totalWater = 0;
        for (int i = 0; i < heights.length - 1; i++) {
            int leftBound = 0;
            int rightBound = 0;
            // Here we only want to look at elements to the LEFT of index i, which are the elements at the lower indices
            for (int j = 0; j <= i; j++) {
                leftBound = Math.max(leftBound, heights[j]);
            }
            // Now here we only want to look at elements to the RIGHT of index i, which are the elements at the higher indices
            for (int j = i; j < heights.length; j++) {
                rightBound = Math.max(rightBound, heights[j]);
            }
            // Add the amount of water at index i to totalWater
            totalWater += Math.min(leftBound, rightBound) - heights[i];
        }
        return totalWater;

    }
}