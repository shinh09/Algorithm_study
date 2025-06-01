package week5.Traversal;

import java.util.*;

public class AdjList<T extends Edge> implements Graph {
    private List<List<T>> adjList;

    // Constructor to initialize the adjacency list with the number of vertices
    public AdjList(int numVertices) {
        adjList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Adds an edge to the adjacency list
    public void addEdge(int u, int v, double w) {
        adjList.get(u).add((T) new Edge(u, v, w, null));
    }

    // Returns a string representation of the adjacency list
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < adjList.size(); i++) {
            result.append("\n[").append(i).append("]: ");
            for (T edge : adjList.get(i)) {
                result.append(edge).append(" ");
            }
        }
        return result.toString();
    }

	@Override
    public int[] bfs(int start) {
        // TODO Auto-generated method stub
        int[] result = new int[adjList.size()];
        boolean[] visit = new boolean[adjList.size()];
        for (int i = 0; i < visit.length; i++) visit[i] = false;
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        visit[start] = true;
        int count = 0;
        while (q.isEmpty() != true) {
            int temp = q.remove();
            result[count] = temp;
            count++;
            for (T edge : adjList.get(temp)) {
                int neighbor = edge.getHead();
                if(!visit[neighbor]){
                    q.add(neighbor);
                    visit[neighbor] = true;
                }
            }
        }
        return result;
    }


    @Override
    public int[] dfs(int start) {
        boolean[] visit = new boolean[adjList.size()];
        int[] count ={0};
        int[] result = new int[adjList.size()];
        return dfs(start,visit,result,count );
    }
    public int[] dfs(int current, boolean[] visit,int[] result, int[] count ) {
        visit[current] = true ;
        result[count[0]] = current;
        count[0]++;
        for(T edge : adjList.get(current)){
            int neighbor = edge.getHead();
            if(!visit[neighbor]){
                dfs(neighbor,visit,result,count);
            }
        }
        return result;
    }
}