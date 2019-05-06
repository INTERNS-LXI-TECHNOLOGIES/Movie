package com.lxisoft.cast;
import com.lxisoft.film.FilmScript;
import java.util.*;
public class Cast{
public ArrayList<Actor> actors = new ArrayList<Actor>();


public void setDetails(){


	createCast(new Villain(),"Ajay","Varki");
	createCast(new Villain(),"Sarath","Mattan");
	createCast(new Villain(),"Anish","Annachi");
	createCast(new Comedian(),"Pavana","Meenakshi");
	createCast(new Comedian(),"Greeshma","Sakundala");
	createCast(new Comedian(),"Akhil","Thommanchandi");
	createCast(new Comedian(),"Rahul","Odiyan");
	for(int i=0;i<actors.size();i++){
 	System.out.println("actores are:"+actors.get(i).getName()+"   charector name:"+actors.get(i).getCharectorName());
 
	}
	
	//System.out.println("comedian names:"+actors.getName());

}
public void createCast(Actor newActor,String name,String charector){
Actor actor = newActor;
actor.setName(name);
actor.setCharectorName(charector);
actors.add(actor);
//System.out.println(actors.size());
			
}

}