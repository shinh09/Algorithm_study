package week4.basicGraph;

public class CompleteGraphTest {
    public static void main(String[] args) {
        int numVertices = 3;
        int numEdges = 6;
        Graph<Edge> adjList = new AdjList<>(numVertices);
        Graph<Edge> adjMatrix = new AdjMatrix(numVertices);
        Graph<Edge> IncMatrix = new IncMatrix(numVertices,numEdges);

        for(int i=0; i<numVertices;i++){
            for(int j=0 ; j<numVertices;j++){
                if(i!=j) {
                    adjList.addEdge(i, j, 1);
                    adjMatrix.addEdge(i, j, 1);
                    IncMatrix.addEdge(i, j, 1);
                }
            }
        }
        // Print the graph representations
        System.out.println("Adjacency List Representation:"+ adjList.toString());
        System.out.println();

        System.out.println("\nAdjacency Matrix Representation:");
        System.out.println(adjMatrix.toString());

        System.out.println("\nIncidence Matrix Representation:");
        System.out.println(IncMatrix.toString());
    }
}
