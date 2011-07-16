package org.conc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;



//the model should keep track of the game data and information. This means keeping all the maps of all the stuff
public class Model {
	public HashMap <String,String> answerMap;
	public LinkedList<String>states;
	public LinkedList<String>capitals;
	public LinkedList<String>entityList;
	public Model()
	{
		
		
		states = new LinkedList<String>();
		capitals = new LinkedList<String>();
		entityList= new LinkedList<String>();
		answerMap = new HashMap<String, String>();		
		states.add("WI");
		capitals.add("Madison");
		states.add("IA");
		capitals.add("Des Moines");
		states.add("MN");
		capitals.add("St. Paul");
		states.add("MI");
		capitals.add("Lansing");
		states.add("KS");
		capitals.add("Topeka");
		states.add("OR");
		capitals.add("Salem");
		
		// maps all the states with the right capitals in answerMap
		//
		System.out.println(states.toString());
		System.out.println(capitals.toString());
		for(int i=0; i<states.size(); i++)
		{	
			answerMap.put(states.get(i),capitals.get(i));
		}
		
		
		
		
		  // shuffling the freeSpace allows us to pick a random elt from the list ...
		  //need to find a way to only make this happen once
		 
		  Collections.shuffle(states);
		  Collections.shuffle(capitals);
		  for(int i=0; i<states.size(); i++)
		  {
			  entityList.add(states.get(i));
			  entityList.add(capitals.get(i));
		  }
		  Collections.shuffle(entityList);
		
		  
		  /*
		   * Now I need to map all these spaces to to the states and cooridents
		   */
		  //answerMap = new HashMap<String, String>();


		  
	}
}
