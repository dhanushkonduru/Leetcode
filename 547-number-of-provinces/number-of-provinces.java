class Solution {

    public void dfs(int city,int [][] isConnected,boolean[] visited){
        visited[city] = true;
        for(int neighbor=0;neighbor<isConnected.length;neighbor++){
            if(isConnected[city][neighbor] == 1 && !visited[neighbor]){
                dfs(neighbor,isConnected,visited);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces =0;
        for(int city=0;city<n;city++){
            if(!visited[city]){
                dfs(city,isConnected,visited);
                provinces++;
            }
        }
        return provinces;
    }
}