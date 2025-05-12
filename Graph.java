package Graphs;

public class Graph { // Directed-Graph
    int V;
    int E;
    int adjMatrix[][];

    public Graph(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adjMatrix = new int[nodes][nodes];
    }

    public void addEdge(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
        E++;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(V+" Vertices"+" "+E+" Edges"+"\n");
        for(int i=0;i<V;i++){
            sb.append(i+" ");
            for(int e:adjMatrix[i]){
                sb.append(e+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Graph ob = new Graph(4);
        ob.addEdge(0, 1);
        ob.addEdge(1, 2);
        ob.addEdge(2, 3);
        ob.addEdge(3, 0);
        System.out.println(ob);

    }

}
