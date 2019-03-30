package com.ddth.challenge.shtp.model;


import java.util.ArrayList;

public class ResponseMessage {

        private ArrayList<String> nodes;
        private ArrayList<Edge> edges;

	public void setNodes(ArrayList<String> nodes) {
		this.nodes = nodes;
	}

	public void setEdges(ArrayList<Edge> edges) {
		this.edges = edges;
	}
        
        
	public ArrayList<String> getNodes() {
		return nodes;
	}

	public ArrayList<Edge> getEdges() {
		return edges;
	}
        
       
}
