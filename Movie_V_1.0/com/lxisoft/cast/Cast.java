package com.lxisoft.cast;
import java.util.*;
public class Cast{

private ArrayList<Actor> actors = new ArrayList<Actor>();


public void setDetails(){

	create(new Villain(),"Raju","srdtr");
	create(new Villain(),"Prabhu","ddty");
	create(new Comedian(),"Pavana","ssdsaf");
	create(new Comedian(),"Anish","dfg");
	create(new Comedian(),"Greeshma","sdfgh");
	create(new Comedian(),"Akhil","sdfgh");
	create(new Comedian(),"Sarath","sdfg");
	
	//System.out.println("comedian names:"+actors.getName());

}
public void create(Actor comedianNames,String name,String charector){
Actor actors = null;
actors.setName(name);
actors.setCharectorName(charector);
//this.comedianNames.add(comedianNames);
System.out.println("actores are:"+actors.getName());
}

}