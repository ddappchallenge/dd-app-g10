
package com.ddth.challenge.shtp.algorithm;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;



public class ShortestPath{
/* Dijkstra Algorithm
 * 
 *
 */
 public static void computePaths(Node source){
  source.shortestDistance=0;

  //implement a priority queue
  PriorityQueue<Node> queue = new PriorityQueue<Node>();
  queue.add(source);

  while(!queue.isEmpty()){
   Node u = queue.poll();

   /*visit the adjacencies, starting from 
   the nearest node(smallest shortestDistance)*/
   
   for(Edge e: u.adjacencies){

    Node v = e.target;
    double weight = e.weight;

    //relax(u,v,weight)
    double distanceFromU = u.shortestDistance+weight;
    if(distanceFromU<v.shortestDistance){

     /*remove v from queue for updating 
     the shortestDistance value*/
     queue.remove(v);
     v.shortestDistance = distanceFromU;
     v.parent = u;
     queue.add(v);

    }
   }
  }
 }

 public static List<Node> getShortestPathTo(Node target){

  //trace path from target to source
  List<Node> path = new ArrayList<Node>();
  for(Node node = target; node!=null; node = node.parent){
   path.add(node);
  }


  //reverse the order such that it will be from source to target
  Collections.reverse(path);

  return path;
 }



 public static void main(String[] args){

  //initialize the graph base on the Romania map
  Node n1 = new Node("A");
  Node n2 = new Node("B");
  Node n3 = new Node("C");
  Node n4 = new Node("D");
  Node n5 = new Node("E");

  //initialize the edges
  n1.adjacencies = new Edge[]{
   new Edge(n2,10),
   new Edge(n3,10)
  };

  n2.adjacencies = new Edge[]{
   new Edge(n5,15),
   new Edge(n3,5)
  };

  n3.adjacencies = new Edge[]{
   
  };

  n4.adjacencies = new Edge[]{
   
  };

  n5.adjacencies = new Edge[]{
   
   
  };

  

  Node[] nodes = {n1,n2,n3,n4,n5};

  //compute paths
  computePaths(n1);

  //print shortest paths
  
  for(Node n: nodes){
   System.out.println("Distance to " + 
    n + ": " + n.shortestDistance);
      List<Node> path = getShortestPathTo(n);
      System.out.println("Path: " + path);
  }


 }


}


//define Node
class Node implements Comparable<Node>{
 
 public final String value;
 public Edge[] adjacencies;
 public double shortestDistance = Double.POSITIVE_INFINITY;
 public Node parent;

 public Node(String val){
  value = val;
 }

 public String toString(){
   return value;
 }

 public int compareTo(Node other){
  return Double.compare(shortestDistance, other.shortestDistance);
 }

}

//define Edge
class Edge{
 public final Node target;
 public final double weight;
 public Edge(Node targetNode, double weightVal){
  target = targetNode;
  weight = weightVal;
 }
}
