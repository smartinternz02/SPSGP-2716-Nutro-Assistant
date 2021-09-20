package com.demian.SpringApiTest;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.fasterxml.jackson.databind.ObjectMapper;

import javassist.bytecode.Descriptor.Iterator;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;

public class ApiCall {
	
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		/*String query = "calcium in milk";
		String encoded=URLEncoder.encode(query,"UTF-8").replace("+", "%20");
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/quickAnswer?q="+encoded))
				.header("x-rapidapi-key", "731f093f7amshb015efcbcf6e1c8p1012eejsncedd2328dbc1")
				.header("x-rapidapi-host", "spoonacular-recipe-food-nutrition-v1.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClieIterator it= meals.iterator();
	    Iterable<Object> iterable = (Iterable<Object>) StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, 0),false).collect(Collectors.toList());nt.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
	
		String input = "2000";
		String encoded=URLEncoder.encode(input,"UTF-8").replace("+", "%20");
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/mealplans/generate?targetCalories="+encoded+"&timeFrame=day"))
				.header("x-rapidapi-key", "731f093f7amshb015efcbcf6e1c8p1012eejsncedd2328dbc1")
				.header("x-rapidapi-host", "spoonacular-recipe-food-nutrition-v1.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		String map = response.body();
		ObjectMapper mapper = new ObjectMapper();
	    Map<String, Object> RecMap=mapper.readValue(map, Map.class);
	    System.out.println(RecMap);
	    System.out.println("space \n");
	    ArrayList<String> meals=(ArrayList) RecMap.get("meals");
	    System.out.println(Arrays.toString(meals.toArray()));
	   */
	    
	    
	}

}
