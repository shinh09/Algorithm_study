package week6.mst;

public interface Graph<T extends Edge> {
    // Method to add an edge to the graph
    void addEdge(int u, int v, double w);

    // Method to return a string representation of the graph
    String toString();

	int[] bfs(int start);

	int[] dfs(int start);
}