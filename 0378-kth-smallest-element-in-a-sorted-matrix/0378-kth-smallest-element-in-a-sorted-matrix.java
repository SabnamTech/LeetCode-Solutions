class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                heap.add(matrix[i][j]);
            }
        }
        for(int i = 1 ; i < k ; i++){
            heap.poll();
        }
        return heap.poll();
    }
}