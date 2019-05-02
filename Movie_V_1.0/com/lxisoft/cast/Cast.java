package com.lxisoft.cast;
import java.util.*;
public class Cast{
ArrayList<Actor> actors = new ArrayList<Actor>();


public void setDetails(){


	createCast.add(new Villain(),"Ajay","Varki");
	createCast.add(new Villain(),"Sarath","Mattan");
	createCast.add(new Villain(),"Anish","Annachi");
	createCast.add(new Comedian(),"Pavana","Meenakshi");
	createCast.add(new Comedian(),"Greeshma","Sakundala");
	createCast.add(new Comedian(),"Akhil","Thommanchandi");
	createCast.add(new Comedian(),"Rahul","Odiyan");
	
	//System.out.println("comedian names:"+actors.getName());

}
public void createCast(Actor actors,String name,String charector){
Actor actor = new Actor();
actor.setName(name);
actor.setCharectorName(charector);
actors.add(actor);
System.out.println(actors.size());
for(int i=0;i<actors.size();i++)
	{		
 	System.out.println("actores are:"+actors.get(i).getName());
 	}
			
}

}