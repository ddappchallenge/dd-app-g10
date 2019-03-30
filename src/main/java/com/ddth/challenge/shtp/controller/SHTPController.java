package com.ddth.challenge.shtp.controller;

import com.ddth.challenge.shtp.algorithm.ShortestPath;
import com.ddth.challenge.shtp.model.Edge;
import com.ddth.challenge.shtp.model.ResponseMessage;
import java.util.ArrayList;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class SHTPController {

	protected ArrayList<String> nodes;
        protected ArrayList<Edge> edges;

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/hello")
	public ResponseMessage helloGet(){
		ResponseMessage hm = new ResponseMessage();
		hm.setNodes(nodes);
		hm.setEdges(edges);
		return hm;
	}

	@PostMapping(value="/set-hello-message")
	public HttpStatus setResponseMessage(@RequestBody ResponseMessage message){
		nodes = message.getNodes();
                edges = message.getEdges();
		return HttpStatus.OK;
	}

	@GetMapping(value = "short")
	public String ShortestPath(){
		ShortestPath a= new ShortestPath();
		return "Just a sample";
	}
}
