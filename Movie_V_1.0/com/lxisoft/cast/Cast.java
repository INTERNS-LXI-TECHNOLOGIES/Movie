package com.lxisoft.cast;
import java.util.*;
public class Cast{
ArrayList<Actor> actors = new ArrayList<Actor>();


public void setDetails(){


	createCast(new Villain(),"Ajay","Varki");
	createCast(new Villain(),"Sarath","Mattan");
	createCast(new Villain(),"Anish","Annachi");
	createCast(new Comedian(),"Pavana","Meenakshi");
	createCast(new Comedian(),"Greeshma","Sakundala");
	createCast(new Comedian(),"Akhil","Thommanchandi");
	createCast(new Comedian(),"Rahul","Odiyan");
	
	//System.out.println("comedian names:"+actors.getName());

}
public void createCast(Actor actors,String name,String charector){
Actor actor = new Actor();
actor.setName(name);
actor.setCharectorName(charector);
//actors.add(actor);
//System.out.println(actors.size());
		
 	System.out.println("actores are:"+actor.getName()+"   charector name:"+actor.getCharectorName());
 	
			
}

}