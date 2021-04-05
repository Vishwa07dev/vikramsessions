import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;


public class Solution {

  public static int numberOfConnectedComponents(Graph g) {

    Collection<Vertex> unexplored = g.getAllVertices();


    Collection<Vertex> vertexList = g.getAllVertices();

    int count =0 ;

    for(Vertex vertex : vertexList){
      if(unexplored.contains(vertex)){
        count++;
        bfs(vertex,unexplored, g);
      }
    }

    return count ;

  }

  /**
   * BFS code for this question
   * @param vertex
   * @param unexplored
   * @param g
   */
  public static void bfs(Vertex vertex , Collection<Vertex> unexplored , Graph g){

    Queue<Vertex> q = new ArrayDeque();

    q.add(vertex);
    while(!q.isEmpty()){
      Vertex v = q.remove();

      for(Vertex n : g.getNeighbours(v)){
        if(unexplored.contains(n)){
          unexplored.remove(n);
          q.add(n);
        }
      }
    }

  }

}
