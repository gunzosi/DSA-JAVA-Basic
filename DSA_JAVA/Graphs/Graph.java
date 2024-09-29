package Graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private final HashMap<String, ArrayList<String>> adjListGraph = new HashMap<>();

    public void printGraph(){
        System.out.println(adjListGraph);
    }

    public boolean addVertex(String vertex){
        if(adjListGraph.get(vertex) == null) {
            adjListGraph.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String vertex1, String vertex2) {
        if(adjListGraph.get(vertex1) != null & adjListGraph.get(vertex2) != null){
            /**
             * @adjListGraph is a HashMap (Key-Value pair)
             * @Key: vertex1
             * @Value: ArrayList of vertex1
             * @get(vertex1) returns the value of vertex1 is [array]
             * @add(vertex2) adds vertex2 to the ArrayList of vertex1
             * Because .add() is method of ArrayList
             */
            adjListGraph.get(vertex1).add(vertex2);
            adjListGraph.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex1, String vertex2){
        if (adjListGraph.get(vertex1) != null && adjListGraph.get(vertex2) != null){
            adjListGraph.get(vertex1).remove(vertex2);
            adjListGraph.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex){
        if (adjListGraph.get(vertex) == null) return false;
        for (String otherVertex : adjListGraph.get(vertex)){
            adjListGraph.get(otherVertex).remove(vertex);
        }
        adjListGraph.remove(vertex);
        return true;
    }
}
