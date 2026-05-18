class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int fresh = 0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j] == 2){
                    queue.offer(new int[]{i,j});
                }
                else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        if(fresh ==0){
            return 0;
        }
        int min = 0;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while(!queue.isEmpty()){
            int size = queue.size();
            boolean rottonthisminute = false;
            for(int i=0;i<size;i++){
                int[] current = queue.poll();
                int r = current[0];
                int c = current[1];

                for(int d=0;d<4;d++){
                    int nr = r + dr[d];
                    int nc = c + dc[d];
                    if (nr >= 0 && nr < rows &&
                        nc >= 0 && nc < cols &&
                        grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;
                        queue.offer(new int[]{nr, nc});
                        fresh--;
                        rottonthisminute = true;
                    }
                }
            }
            if(rottonthisminute){
                min++;
            }
        }
        return fresh == 0 ? min : -1;
    }
}