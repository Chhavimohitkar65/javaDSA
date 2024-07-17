package Graphs;
import java.util.*;

public class AdjacencyList_creation {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge (int s , int d , int w ){
            this.src = s;
            this.dest = d;
            this.wt = w;

        }     
    }
    public static void main (String args[]){

        int V = 5;
        //int  arr[] = new arr[V];
        // at every arry index there is an array list stored 
        ArrayList<Edge>[] graph = new ArrayList[V]; // null ---> empty array list

        for (int i = 0; i<V; i++){
            graph[i] = new ArrayList<>(); // here we are going at each index i and cerating an array list at each index  
        }

        //0 vertex
        graph[0].add(new Edge(0, 1, 5)); 
        // 1 vertex
        graph[1].add(new Edge(1, 0 , 5)); 
        graph[1].add(new Edge(1, 2, 1)); 
        graph[1].add(new Edge(1, 3, 3)); 
        
        // 2 vertex
        graph[2].add(new Edge(2, 1 , 1)); 
        graph[2].add(new Edge(2, 3, 1)); 
        graph[2].add(new Edge(2, 4, 4)); 

         // 3 vertex
         graph[3].add(new Edge(3, 1 , 3)); 
         graph[3].add(new Edge(3, 2, 1)); 
        
         // 4 vertex
         graph[4].add(new Edge(4, 2 , 2)); 
    

         //now to store the info of any neighbors
         //let for 2's negighbors
         for (int i= 0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);// src wt dest 
            System.out.println(e.dest);
         }

    }
    
}
